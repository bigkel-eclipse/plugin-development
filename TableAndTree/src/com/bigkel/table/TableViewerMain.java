package com.bigkel.table;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class TableViewerMain {
	// 首先定义一个表格(TableViewer类)对象
	private TableViewer tableViewer;

	public static void main(String[] args) {
		TableViewerMain window = new TableViewerMain();
		// 因为这类和TableViewer1的代码基本上是一样的,我就原样拷贝过TableViewer1的代码来了
		// 但是这个地方应该改成TableViewer2的.
		window.open();
	}

	// 定义这个open()方法.就是创建一个典型的SWT程序的步骤
	public void open() {
		// 1.display负责管理一实现循环和控制UI线程和其他线程之间的通信
		Display display = new Display();
		// 2.创建一个或者多个Shell(shell是程序的主窗口)
		Shell shell = new Shell();
		// 3.设置shell的布局.
		shell.setSize(500, 150);
		// 设置shell的布局为FillLayout
		shell.setLayout(new FillLayout());
		shell.setText("TableViewer例子");
		// 调用自定义的方法创建表格
		createTableViewer(shell);
		// 4.设定内容器
		tableViewer.setContentProvider(new TableViewerContentProvider());
		// 5.设定标签器
		tableViewer.setLabelProvider(new TableViewerLabelProvider());
		// 6.用setInput输入数据(把PeopleFactory产生的List集合传进来)
		tableViewer.setInput(PeopleFactory.getPeoples());

		// 增加一个监听器
		addListener();
		// 生成一个Action对象.
		MyActionGroup actionGroup = new MyActionGroup(tableViewer);
		// 调用fillContextMenu方法将按钮注入到菜单对象中
		actionGroup.fillContextMenu(new MenuManager());

		// 7.创建Shell中的组件(这个例子中没有加入组件,只有一个空窗口)
		shell.open();
		// 8.写一个时间转发循环
		while (!shell.isDisposed()) {// 如果主窗口没有关闭,则一直循环
			// dispose 是"处理,处置,毁掉"的意思
			if (!display.readAndDispatch()) {//// 如果display不忙
				display.sleep();// display休眠
			}
		}
	}

	/**
	 * 创建一个表格
	 */
	public void createTableViewer(Composite prarent) {
		/**
		 * 第一步:定义一个TableViewer对象. 同时在构造方法中定义其式样. 这里设置成可以多选(SWT.MULTI),
		 * 有水平滚动条(SWT.H_SCROLL),有垂直滚动条(SWT.V_SCROLL),
		 * 有边框(SWT.BORDER),可以整行选择(SWT.FULL_SELECTION)
		 */
		tableViewer = new TableViewer(prarent,
				SWT.MULTI | SWT.H_SCROLL | SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL | SWT.FULL_SELECTION);

		/**
		 * 第二步:通过TableViewer中的Table对其布局.
		 */
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);// 设置标头
		table.setLinesVisible(true);// 显示表格线
		TableLayout tLayout = new TableLayout();// 专用于表格的布局
		table.setLayout(tLayout);

		/**
		 * 第三步:建立TableViewer中的列
		 */
		tLayout.addColumnData(new ColumnWeightData(20));// 这个是设置ID列的列宽为10像素
		new TableColumn(table, SWT.NONE).setText("ID号");

		tLayout.addColumnData(new ColumnWeightData(20));// 这个是设置Name列的列宽为40像素
		new TableColumn(table, SWT.NONE).setText("姓名");

		tLayout.addColumnData(new ColumnWeightData(20));// 这个是设置Sex列的列宽为10像素
		new TableColumn(table, SWT.NONE).setText("性别");

		tLayout.addColumnData(new ColumnWeightData(20));// 这个是设置Age列的列宽为10像素
		new TableColumn(table, SWT.NONE).setText("年龄");

		tLayout.addColumnData(new ColumnWeightData(70));// 这个是设置Date的列宽为70像素
		new TableColumn(table, SWT.NONE).setText("记录建立时间");
	}

	/**
	 * 新增加的监听器
	 */
	public void addListener() {
		// TableViewer的双击事件的监听
		tableViewer.addDoubleClickListener(new IDoubleClickListener() {// IDoubleClickListener是一个接口
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				// 得到记录的实体对象(要类型转换)
				People people = (People) selection.getFirstElement();
				// 一个弹出提示框
				MessageDialog.openInformation(null, "提示", people.getName());
			}
		});

		/*
		 * tv的选择事件（单击）监听
		 */
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// 如果要定义单击的事件的处理在这里写代码.......
			}
		});
	}
}
