package com.bigkel.jface;

import java.util.Arrays;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

public class TableDialogTest {
	public static void main(String[] args) {
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		new TableDialog(shell).open();
	}
}

class TableDialog extends Dialog implements ISelectionChangedListener{

	private Shell shell;
	
	private TableViewer tableViewer;
	
	protected TableDialog(Shell shell) {
		super(shell);
		this.shell = shell;
	}
	
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Select Table");
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Table table = new Table(composite, 66308);
		GridData gridData = new GridData(1808);
		gridData.heightHint = 240;
		gridData.widthHint = 260;
		table.setLayoutData(gridData);
		tableViewer = new TableViewer(table);
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setLabelProvider(new TableDialogLabelProvider());
		tableViewer.setInput(Arrays.asList("bigkel","windows","helloworld"));
		addTableListen();
        return (Control) composite;
	}
	
	private void addTableListen() {
		tableViewer.addDoubleClickListener((IDoubleClickListener) new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Button button = TableDialog.this.getButton(0) ;
				if (button.isEnabled()) {
					TableDialog.this.okPressed();
				}
			}
		});
		tableViewer.addSelectionChangedListener((ISelectionChangedListener) this);
	}
	
	protected void okPressed() {
		Object select = tableViewer.getStructuredSelection().getFirstElement();
		MessageDialog.openInformation(shell, "Select", (String) select);
		System.out.println(select);
		super.okPressed();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		this.getButton(0).setEnabled(false);
		IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		Object element = selection.getFirstElement();
		if (element instanceof String) {
			String str = (String) element;
			if (str.equals("helloworld")) {
				this.getButton(0).setEnabled(true);
			}
		}
	}
}

class TableDialogLabelProvider extends CellLabelProvider {

	@Override
	public void update(ViewerCell cell) {
		cell.setImage(ImageDescriptor.createFromFile(this.getClass(), "sample.png").createImage());
		cell.setText(cell.getElement().toString());
	}
}
