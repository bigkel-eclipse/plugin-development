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
		// -----------界面核心代码-------------------
		shell.setLayout(new FillLayout());
		TreeViewer tv = new TreeViewer(shell, SWT.BORDER);

		Tree tree = tv.getTree();
		tree.setHeaderVisible(true);
		TreeColumn column = new TreeColumn(tree, SWT.LEFT);
		column.setText("名称");
		column.setWidth(150);
		column = new TreeColumn(tree, SWT.LEFT);
		column.setText("子结点数");
		column.setWidth(80);
		column = new TreeColumn(tree, SWT.LEFT);
		column.setText("性别");
		column.setWidth(80);

		tv.setContentProvider(new TreeViewerContentProvider());
		tv.setLabelProvider(new MyTableLableProvider());
		// 和TableViewer一样，数据的入口也是setInput方法
		List<Country> input = (List<Country>) DataFactory.createTreeData();
		tv.setInput(input);
		// --------------插入代码：START------------------
		MyActionGroup actionGroup = new MyActionGroup(tv);// 生成一个ActionGroup对象
		actionGroup.fillContextMenu(new MenuManager());// 将按钮注入到菜单对象中
		// -----------END------------------
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
