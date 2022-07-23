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
	// ActionGroup这是个抽象类,但是其中并没有抽象方法.
	private TreeViewer treeViewer;

	// 构造方法
	public MyActionGroup(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
	}

	/**
	 * 生成菜单Menu,并将Action传入
	 */
	public void fillContextMenu(IMenuManager mgr) {
		/*
		 * 加入两个Action对象到菜单管理器
		 */
		MenuManager menuManager = (MenuManager) mgr; // 把接口类转换成其实现类.
		// 用MenuManager管理Action
		menuManager.add(new OpenAction());
		menuManager.add(new RefreshAction());
		menuManager.add(new ExpandAction());
		menuManager.add(new CollapseAction());
		menuManager.add(new AddEntryAction());
		menuManager.add(new RemoveEntryAction());
		menuManager.add(new ModifyEntryAction());
		/*
		 * 把这些功能加入到右键的Menu菜单中.
		 */
		Tree tree = treeViewer.getTree();
		Menu menu = menuManager.createContextMenu(tree);
		tree.setMenu(menu);
	}

	/**
	 * 打开"菜单"对应的Action类
	 */
	private class OpenAction extends Action {
		public OpenAction() {
			setText("打开");
		}

		/**
		 * 继承自Action的方法，动作代码写此方法中
		 */
		// 覆盖Action中的run()方法.
		public void run() {
			ITreeEntry obj = getSelTreeEntry();// getSelTreeEntry()得到当前节点
			if (obj != null) {
				// 弹出一个这个节点名字的对话框.
				MessageDialog.openInformation(null, null, obj.getName());
			}
		}
	}

	/**
	 * 刷新对应的Action类.
	 */
	private class RefreshAction extends Action {
		public RefreshAction() {
			setText("刷新");
		}

		// 覆盖Action类中的run()方法,里面是调用的refresh()方法.
		public void run() {
			treeViewer.refresh();// 调用TreeViewer的刷新方法
		}
	}

	/**
	 * 展开当前结点的Action类
	 */
	private class ExpandAction extends Action {
		public ExpandAction() {
			setText("展开");
		}

		// 重写run()方法
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj != null) {
				treeViewer.expandToLevel(obj, 4);
				// 这个方法后面的数字是展开的层级数.这个地方设置成仅仅展开1个层级.
			}
		}
	}

	/**
	 * 收缩当前结点的Action类
	 */
	private class CollapseAction extends Action {
		public CollapseAction() {
			setText("收缩");
		}

		// 重写run()方法
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj != null) {
				treeViewer.collapseToLevel(obj, -1); // -1为将当前结点的所有子结点收缩
			}
		}
	}

	/**
	 * 给当前结点增加一个子结点的Action类
	 */
	private class AddEntryAction extends Action {
		public AddEntryAction() {
			setText("增加");
		}

		@Override
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj == null || obj instanceof People) {
				return;
			}
			InputDialog dialog = new InputDialog(null, "给当前结点增加一个子结点", "输入名称", "请输入你要增加的节点的名字", null);
			if (dialog.open() == InputDialog.OK) {// 如果单击OK按钮
				String entryName = dialog.getValue(); // 得到Dialog输入值
				/* 根据单击结点的不同类型生成相应的子结点 */
				ITreeEntry newEntry = null;
				if (obj instanceof Country) {
					newEntry = new City(entryName);
				} else if (obj instanceof City) {
					newEntry = new People(entryName);
				}
				/* 在增加子结点之前将父结点展开 */
				if (!treeViewer.getExpandedState(obj)) {
					treeViewer.expandToLevel(obj, 1);
				}
				treeViewer.add(obj, newEntry);// 增加结点
			}
		}
	}

	/**
	 * 删除结点的Action类
	 */
	private class RemoveEntryAction extends Action {
		public RemoveEntryAction() {
			setText("删除");
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
	 * 修改结点名称的Action类
	 */
	private class ModifyEntryAction extends Action {
		public ModifyEntryAction() {
			setText("修改");
		}

		@Override
		public void run() {
			ITreeEntry obj = getSelTreeEntry();
			if (obj == null) {
				return;
			}
			InputDialog dialog = new InputDialog(null, "修改结点", "输入新名称", obj.getName(), null);
			if (dialog.open() == InputDialog.OK) {
				String entryName = dialog.getValue();// 得到对话框中的值.
				obj.setName(entryName);// 给这个节点设置成得到的对话框中的名字.
				treeViewer.refresh(obj); // 刷新结点
			}
		}
	}

	/**
	 * 这个方法是自定义的方法,这个方法的作用就是得到当前选择的节点.
	 */
	private ITreeEntry getSelTreeEntry() {
		IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		ITreeEntry treeEntry = (ITreeEntry) (selection.getFirstElement());
		return treeEntry;
	}
}
