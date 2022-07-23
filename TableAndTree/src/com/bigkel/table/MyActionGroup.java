package com.bigkel.table;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;

public class MyActionGroup extends Action {
	private TableViewer tableViewer;

	/**
	 * ����Ҽ��в˵�,����Ҫ ���ɲ˵�Menu,��������Action����
	 */
	public void fillContextMenu(IMenuManager mgr) {// I��ͷ��һ���ǽӿڵ���˼.
		// ��������Action���󵽲˵���������
		MenuManager menuManager = (MenuManager) mgr; // ��Ϊ�������һ���ӿ�,��������ط�Ҫת��һ������.
		menuManager.add(new OpenAction());
		menuManager.add(new RefreshAction());

		/*
		 * ��һ�δ�����ʲô��˼..........????????�е�㲻��.
		 */
		// ����Menu�����ر��table��,menu��table��������Ϊ�Է��Ĳ���.
		Table table = tableViewer.getTable();
		Menu menu = menuManager.createContextMenu(table);
		table.setMenu(menu);

	}

	/**
	 * ��������TableViewer����Ĺ��캯���� ��Ϊ��Action��Ҫʹ�õ�TableViewer���� ����һ��Ҫ��TableViewer��������
	 */
	public MyActionGroup(TableViewer tableViewer) {
		this.tableViewer = tableViewer;
	}

	/**
	 * "��"��Action��
	 */
	private class OpenAction extends Action {
		public OpenAction() {
			setText("��");
		}

		/**
		 * �̳���Action�ķ���,��������д�ڴ˷�����.
		 */
		public void run() {
			IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
			People obj = (People) (selection.getFirstElement());
			if (obj == null) {
				MessageDialog.openInformation(null, null, "ѡѡ���¼");
			} else {
				MessageDialog.openInformation(null, null, obj.getName());
			}
		}
	}

	/**
	 * ˢ�µ�Action��
	 */
	private final class RefreshAction extends Action {
		public RefreshAction() {
			setText("ˢ��");
		}

		public void run() {
			tableViewer.refresh();// ���ñ���ˢ�·���.
		}
	}
}
