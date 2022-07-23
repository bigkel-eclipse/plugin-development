package com.bigkel.tree;

import java.util.List;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class TreeViewerMain3 {
	public static void main(String[] args) {
		new TreeViewerMain3().open();
	}

	@SuppressWarnings("unchecked")
	public void open() {
		final Display display = new Display();
		final Shell shell = new Shell();
		shell.setSize(300, 300);
		// -----------������Ĵ���-------------------
		shell.setLayout(new FillLayout());
		TreeViewer tv = new TreeViewer(shell, SWT.BORDER);

		Tree tree = tv.getTree();
		tree.setHeaderVisible(true);
		TreeColumn column = new TreeColumn(tree, SWT.LEFT);
		column.setText("����");
		column.setWidth(150);
		column = new TreeColumn(tree, SWT.LEFT);
		column.setText("�ӽ����");
		column.setWidth(80);
		column = new TreeColumn(tree, SWT.LEFT);
		column.setText("�Ա�");
		column.setWidth(80);

		tv.setContentProvider(new TreeViewerContentProvider());
		tv.setLabelProvider(new MyTableLableProvider());
		// ��TableViewerһ�������ݵ����Ҳ��setInput����
		List<Country> input = (List<Country>) DataFactory.createTreeData();
		tv.setInput(input);
		// --------------������룺START------------------
		MyActionGroup actionGroup = new MyActionGroup(tv);// ����һ��ActionGroup����
		actionGroup.fillContextMenu(new MenuManager());// ����ťע�뵽�˵�������
		// -----------END------------------
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
