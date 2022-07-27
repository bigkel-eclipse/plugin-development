package com.itchenyang.editor.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.texteditor.IDocumentProvider;

import com.itchenyang.editor.model.PropertyCategory;
import com.itchenyang.editor.model.PropertyEntry;
import com.itchenyang.editor.model.PropertyFile;
import com.itchenyang.editor.model.PropertyFileListener;
import com.itchenyang.editor.provider.PropertyEditorContentProvider;
import com.itchenyang.editor.provider.PropertyEditorLabelProvider;

public class PropertyEditor extends MultiPageEditorPart {

	private TreeViewer treeViewer;
	private TextEditor textEditor;
	private TreeColumn keyColumn;
	private TreeColumn valueColumn;
	private PropertyEditorLabelProvider treeLabelProvider;
	private PropertyEditorContentProvider treeContentProvider;

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		if (!(input instanceof IFileEditorInput)) {
			throw new PartInitException("Invalid input: must be IFileEditorInput");
		}
		super.init(site, input);
	}

	@Override
	protected void createPages() {
		createPropertiesPage();
		createSourcePage();
		updateTitle();
		initTreeContent();
		initTreeEditors();
	}

	private void updateTitle() {
		IEditorInput input = getEditorInput();
		setPartName(input.getName());
		setTitleToolTip(input.getToolTipText());
	}

	private void createPropertiesPage() {
		Composite treeContainer = new Composite(getContainer(), SWT.NONE);

		TreeColumnLayout layOut = new TreeColumnLayout();
		treeContainer.setLayout(layOut);

		treeViewer = new TreeViewer(treeContainer, SWT.MULTI | SWT.FULL_SELECTION);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new FillLayout());
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);

		keyColumn = new TreeColumn(tree, SWT.NONE);
		keyColumn.setText("Key");
		layOut.setColumnData(keyColumn, new ColumnWeightData(2));

		valueColumn = new TreeColumn(tree, SWT.NONE);
		valueColumn.setText("Value");
		layOut.setColumnData(valueColumn, new ColumnWeightData(3));

		int index = addPage(treeContainer);
		setPageText(index, "Editor");
	}

	private void createSourcePage() {
		try {
			textEditor = new TextEditor();
			int index = addPage(textEditor, getEditorInput());
			setPageText(index, "Source");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		if (getActivePage() == 0 && isPageModifed)
			updateTextEditorFromTree();
		isPageModifed = false;
		textEditor.doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		if (getActivePage() == 0 && isPageModifed)
			updateTextEditorFromTree();
		isPageModifed = false;
		textEditor.doSaveAs();
		setInput(textEditor.getEditorInput());
		updateTitle();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	public void setFocus() {
		switch (getActivePage()) {
		case 0:
			treeViewer.getTree().setFocus();
		case 1:
			textEditor.setFocus();
			break;
		}
	}

	@SuppressWarnings("static-access")
	void initTreeContent() {
		treeContentProvider = new PropertyEditorContentProvider();
		treeViewer.setContentProvider(treeContentProvider);
		treeLabelProvider = new PropertyEditorLabelProvider();
		treeViewer.setLabelProvider(treeLabelProvider);

		treeViewer.setInput(new PropertyFile(""));
		treeViewer.getTree().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				updateTreeFromTextEditor();

			}

		});
		treeViewer.setAutoExpandLevel(treeViewer.ALL_LEVELS);
	}

	void updateTreeFromTextEditor() {
		PropertyFile propertyFile = (PropertyFile) treeViewer.getInput();
		propertyFile.removePropertyFileListener(propertyFileListener);
		IDocumentProvider provider = textEditor.getDocumentProvider();
		IDocument doc = provider.getDocument(textEditor.getEditorInput());
		propertyFile = new PropertyFile(doc.get());
		treeViewer.setInput(propertyFile);
		propertyFile.addPropertyFileListener(propertyFileListener);
	}

	void initTreeEditors() {
		TreeViewerColumn column1 = new TreeViewerColumn(treeViewer, keyColumn);
		TreeViewerColumn column2 = new TreeViewerColumn(treeViewer, valueColumn);
		column1.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return treeLabelProvider.getColumnText(element, 0);
			}
		});
		column2.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return treeLabelProvider.getColumnText(element, 1);
			}
		});
		column1.setEditingSupport(new EditingSupport(treeViewer) {
			TextCellEditor editor = null;

			@Override
			protected void setValue(Object element, Object value) {
				if (value == null) {
					return;
				}
				String text = ((String) value).trim();
				if (element instanceof PropertyCategory)
					((PropertyCategory) element).setName(text);
				if (element instanceof PropertyEntry) {
					((PropertyEntry) element).setKey(text);
				}
			}

			@Override
			protected Object getValue(Object element) {
				return treeLabelProvider.getColumnText(element, 0);
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				if (editor == null) {
					Composite tree = (Composite) treeViewer.getControl();
					editor = new TextCellEditor(tree);
					editor.setValidator(new ICellEditorValidator() {
						@Override
						public String isValid(Object value) {
							if (((String) value).trim().length() == 0)
								return "key must not be empty string";
							return null;
						}
					});

					editor.addListener(new ICellEditorListener() {
						@Override
						public void editorValueChanged(boolean oldValidState, boolean newValidState) {
							setErrorMessage(editor.getErrorMessage());
						}

						@Override
						public void cancelEditor() {
							setErrorMessage(null);
						}

						@Override
						public void applyEditorValue() {
							setErrorMessage(null);
						}

						private void setErrorMessage(String errorMessage) {
							getEditorSite().getActionBars().getStatusLineManager().setErrorMessage(errorMessage);
						}
					});
				}
				return editor;
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});

		column2.setEditingSupport(new EditingSupport(treeViewer) {
			TextCellEditor editor = null;

			@Override
			protected void setValue(Object element, Object value) {
				String text = ((String) value).trim();
				if (element instanceof PropertyEntry)
					((PropertyEntry) element).setValue(text);
			}

			@Override
			protected Object getValue(Object element) {
				return treeLabelProvider.getColumnText(element, 1);
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				if (editor == null) {
					Composite tree = (Composite) treeViewer.getControl();
					editor = new TextCellEditor(tree);
				}
				return editor;
			}

			@Override
			protected boolean canEdit(Object element) {
				return element instanceof PropertyEntry;
			}
		});
		// treeViewer.getColumnViewerEditor().addEditorActivationListener(new
		// AltClickCellEditListener());
	}

	private boolean isPageModifed;

	public void treeModified() {
		boolean wasDirty = isDirty();
		isPageModifed = true;
		if (!wasDirty) {
			firePropertyChange(IEditorPart.PROP_DIRTY);// 鍒锋柊椤甸潰鐘舵��
		}
	}

	private final PropertyFileListener propertyFileListener = new PropertyFileListener() {

		@Override
		public void valueChanged(PropertyCategory category, PropertyEntry entry) {
			treeViewer.refresh(entry);
			treeModified();

		}

		@Override
		public void nameChanged(PropertyCategory category) {
			treeViewer.refresh(category);
			treeModified();

		}

		@Override
		public void keyChanged(PropertyCategory category, PropertyEntry entry) {
			treeViewer.refresh(entry);
			treeModified();
		}

		@Override
		public void entryRemoved(PropertyCategory category, PropertyEntry entry) {
			treeViewer.refresh();
			treeModified();
		}

		@Override
		public void entryAdded(PropertyCategory category, PropertyEntry entry) {
			treeViewer.refresh();
			treeModified();
		}

		@Override
		public void categoryRemoved(PropertyCategory category) {
			treeViewer.refresh();
			treeModified();
		}

		@Override
		public void categoryAdded(PropertyCategory category) {
			treeViewer.refresh();
			treeModified();
		}
	};

	protected void handlePropertyChange(int propertyId) {
		if (propertyId == IEditorPart.PROP_DIRTY)
			isPageModifed = isDirty();
		super.handlePropertyChange(propertyId);
	}

	public boolean isDirty() {
		return isPageModifed || super.isDirty();
	}

	protected void pageChange(int newPageIndex) {
		switch (newPageIndex) {
		case 0:
			if (isDirty())
				updateTreeFromTextEditor();
			break;
		case 1:
			if (isPageModifed)
				updateTextEditorFromTree();
			break;
		}
		isPageModifed = false;
		super.pageChange(newPageIndex);
	}

	void updateTextEditorFromTree() {
		IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
		document.set(((PropertyFile) treeViewer.getInput()).asText());
	}

}
