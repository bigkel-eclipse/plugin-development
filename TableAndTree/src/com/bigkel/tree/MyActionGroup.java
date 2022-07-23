package com.bigkel.tree;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;

public class MyActionGroup extends Action {
	// ActionGroup���Ǹ�������,�������в�û�г��󷽷�.
	private TreeViewer treeViewer;

	// ���췽��
	public MyActionGroup(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
	}

	/**
	 * ���ɲ˵�Menu,����Action����
	 */
	public void fillContextMenu(IMenuManager mgr) {
		/*
		 * ��������Action���󵽲˵�������
		 */
		MenuManager menuManager = (MenuManager) mgr; // �ѽӿ���ת������ʵ����.
		// ��MenuManager����Action
		menuManager.add(new OpenAction());
		menuManager.add(new RefreshAction());
		menuManager.add(new ExpandAction());
		menuManager.add(new CollapseAction());
		menuManager.add(new AddEntryAction());
		menuManager.add(new RemoveEntryAction());
		menuManager.add(new ModifyEntryAction());
		/*
		 * ����Щ���ܼ��뵽�Ҽ���Menu�˵���.
		 */
		Tree tree = treeViewer.getTree();
		Menu menu = menuManager.createContextMenu(tree);
		tree.setMenu(menu);
	}

	/**
	 * ��"�˵�"��Ӧ��Action��
	 */
	private class OpenAction extends Action {
		public OpenAction() {
			setText("��");
		}

		/**
		 * �̳���Action�ķ�������������д�˷�����
		 */
		// ����Action�е�run()����.
		public void run() {
			ITreeEntry obj = getSelTreeEntry();// getSelTreeEntry()�õ���ǰ�ڵ�
			if (obj != null) {
				// ����һ������ڵ����ֵĶԻ���.
				MessageDialog.openInformation(null, null, obj.getName());
			}
		}
	}

	/**
	 * ˢ�¶�Ӧ��Action��.
	 */
	private class RefreshAction extends Action {
		public RefreshAction() {
			setText("ˢ��");
		}

		// ����Action���е�run()����,�����ǵ��õ�refresh()����.
		public void run() {
			treeViewer.refresh();// ����TreeViewer��ˢ�·���
		}
	}

	/**
	 * չ����ǰ����Action��
	 */
	private class ExpandAction extends Action {
		public ExpandAction() {
			setText("չ��");
		}

		// ��дrun()����
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj != null) {
				treeViewer.expandToLevel(obj, 4);
				// ������������������չ���Ĳ㼶��.����ط����óɽ���չ��1���㼶.
			}
		}
	}

	/**
	 * ������ǰ����Action��
	 */
	private class CollapseAction extends Action {
		public CollapseAction() {
			setText("����");
		}

		// ��дrun()����
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj != null) {
				treeViewer.collapseToLevel(obj, -1); // -1Ϊ����ǰ���������ӽ������
			}
		}
	}

	/**
	 * ����ǰ�������һ���ӽ���Action��
	 */
	private class AddEntryAction extends Action {
		public AddEntryAction() {
			setText("����");
		}

		@Override
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj == null || obj instanceof People) {
				return;
			}
			InputDialog dialog = new InputDialog(null, "����ǰ�������һ���ӽ��", "��������", "��������Ҫ���ӵĽڵ������", null);
			if (dialog.open() == InputDialog.OK) {// �������OK��ť
				String entryName = dialog.getValue(); // �õ�Dialog����ֵ
				/* ���ݵ������Ĳ�ͬ����������Ӧ���ӽ�� */
				ITreeEntry newEntry = null;
				if (obj instanceof Country) {
					newEntry = new City(entryName);
				} else if (obj instanceof City) {
					newEntry = new People(entryName);
				}
				/* �������ӽ��֮ǰ�������չ�� */
				if (!treeViewer.getExpandedState(obj)) {
					treeViewer.expandToLevel(obj, 1);
				}
				treeViewer.add(obj, newEntry);// ���ӽ��
			}
		}
	}

	/**
	 * ɾ������Action��
	 */
	private class RemoveEntryAction extends Action {
		public RemoveEntryAction() {
			setText("ɾ��");
		}

		@Override
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj == null) {
				return;
			}
			treeViewer.remove(obj);
		}
	}

	/**
	 * �޸Ľ�����Ƶ�Action��
	 */
	private class ModifyEntryAction extends Action {
		public ModifyEntryAction() {
			setText("�޸�");
		}

		@Override
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj == null) {
				return;
			}
			InputDialog dialog = new InputDialog(null, "�޸Ľ��", "����������", obj.getName(), null);
			if (dialog.open() == InputDialog.OK) {
				String entryName = dialog.getValue();// �õ��Ի����е�ֵ.
				obj.setName(entryName);// ������ڵ����óɵõ��ĶԻ����е�����.
				treeViewer.refresh(obj); // ˢ�½��
			}
		}
	}

	/**
	 * ����������Զ���ķ���,������������þ��ǵõ���ǰѡ��Ľڵ�.
	 */
	private ITreeEntry getSelTreeEntry() {
		IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		ITreeEntry treeEntry = (ITreeEntry) (selection.getFirstElement());
		return treeEntry;
	}
}
