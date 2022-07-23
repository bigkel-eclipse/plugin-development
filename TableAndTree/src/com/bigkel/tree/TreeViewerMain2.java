package com.bigkel.tree;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TreeViewerMain2 {
	public static void main(String[] args) {
		TreeViewerMain2 window = new TreeViewerMain2();
		window.open();
	}

	public void open() {
		final Display display = new Display();
		final Shell shell = new Shell();
		shell.setSize(500, 500);
		shell.setLayout(new FillLayout());
		Composite c = new Composite(shell, SWT.NONE);
		c.setLayout(new FillLayout());
		TreeViewer treeViewer = new TreeViewer(c, SWT.BORDER);
		treeViewer.setContentProvider(new TreeViewerContentProvider());
		treeViewer.setLabelProvider(new TreeViewerLableProvider());
		Object inputObj = DataFactory.createTreeData();
		// 生成一个Action对象
		MyActionGroup actionGroup = new MyActionGroup(treeViewer);
		// 调用fillContextMenu方法将按钮注入到菜单对象中
		actionGroup.fillContextMenu(new MenuManager());
		treeViewer.setInput(inputObj);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
