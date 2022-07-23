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
	// ���ȶ���һ�����(TableViewer��)����
	private TableViewer tableViewer;

	public static void main(String[] args) {
		TableViewerMain window = new TableViewerMain();
		// ��Ϊ�����TableViewer1�Ĵ����������һ����,�Ҿ�ԭ��������TableViewer1�Ĵ�������
		// ��������ط�Ӧ�øĳ�TableViewer2��.
		window.open();
	}

	// �������open()����.���Ǵ���һ�����͵�SWT����Ĳ���
	public void open() {
		// 1.display�������һʵ��ѭ���Ϳ���UI�̺߳������߳�֮���ͨ��
		Display display = new Display();
		// 2.����һ�����߶��Shell(shell�ǳ����������)
		Shell shell = new Shell();
		// 3.����shell�Ĳ���.
		shell.setSize(500, 150);
		// ����shell�Ĳ���ΪFillLayout
		shell.setLayout(new FillLayout());
		shell.setText("TableViewer����");
		// �����Զ���ķ����������
		createTableViewer(shell);
		// 4.�趨������
		tableViewer.setContentProvider(new TableViewerContentProvider());
		// 5.�趨��ǩ��
		tableViewer.setLabelProvider(new TableViewerLabelProvider());
		// 6.��setInput��������(��PeopleFactory������List���ϴ�����)
		tableViewer.setInput(PeopleFactory.getPeoples());

		// ����һ��������
		addListener();
		// ����һ��Action����.
		MyActionGroup actionGroup = new MyActionGroup(tableViewer);
		// ����fillContextMenu��������ťע�뵽�˵�������
		actionGroup.fillContextMenu(new MenuManager());

		// 7.����Shell�е����(���������û�м������,ֻ��һ���մ���)
		shell.open();
		// 8.дһ��ʱ��ת��ѭ��
		while (!shell.isDisposed()) {// ���������û�йر�,��һֱѭ��
			// dispose ��"����,����,�ٵ�"����˼
			if (!display.readAndDispatch()) {//// ���display��æ
				display.sleep();// display����
			}
		}
	}

	/**
	 * ����һ�����
	 */
	public void createTableViewer(Composite prarent) {
		/**
		 * ��һ��:����һ��TableViewer����. ͬʱ�ڹ��췽���ж�����ʽ��. �������óɿ��Զ�ѡ(SWT.MULTI),
		 * ��ˮƽ������(SWT.H_SCROLL),�д�ֱ������(SWT.V_SCROLL),
		 * �б߿�(SWT.BORDER),��������ѡ��(SWT.FULL_SELECTION)
		 */
		tableViewer = new TableViewer(prarent,
				SWT.MULTI | SWT.H_SCROLL | SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL | SWT.FULL_SELECTION);

		/**
		 * �ڶ���:ͨ��TableViewer�е�Table���䲼��.
		 */
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);// ���ñ�ͷ
		table.setLinesVisible(true);// ��ʾ�����
		TableLayout tLayout = new TableLayout();// ר���ڱ��Ĳ���
		table.setLayout(tLayout);

		/**
		 * ������:����TableViewer�е���
		 */
		tLayout.addColumnData(new ColumnWeightData(20));// ���������ID�е��п�Ϊ10����
		new TableColumn(table, SWT.NONE).setText("ID��");

		tLayout.addColumnData(new ColumnWeightData(20));// ���������Name�е��п�Ϊ40����
		new TableColumn(table, SWT.NONE).setText("����");

		tLayout.addColumnData(new ColumnWeightData(20));// ���������Sex�е��п�Ϊ10����
		new TableColumn(table, SWT.NONE).setText("�Ա�");

		tLayout.addColumnData(new ColumnWeightData(20));// ���������Age�е��п�Ϊ10����
		new TableColumn(table, SWT.NONE).setText("����");

		tLayout.addColumnData(new ColumnWeightData(70));// ���������Date���п�Ϊ70����
		new TableColumn(table, SWT.NONE).setText("��¼����ʱ��");
	}

	/**
	 * �����ӵļ�����
	 */
	public void addListener() {
		// TableViewer��˫���¼��ļ���
		tableViewer.addDoubleClickListener(new IDoubleClickListener() {// IDoubleClickListener��һ���ӿ�
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				// �õ���¼��ʵ�����(Ҫ����ת��)
				People people = (People) selection.getFirstElement();
				// һ��������ʾ��
				MessageDialog.openInformation(null, "��ʾ", people.getName());
			}
		});

		/*
		 * tv��ѡ���¼�������������
		 */
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// ���Ҫ���嵥�����¼��Ĵ���������д����.......
			}
		});
	}
}
