package com.bigkel.tree;

import java.util.List;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class TreeViewerContentProvider implements ITreeContentProvider {
	/**
	 * ���������������һ��Ŀ¼��ʾ��Щ����
	 * 
	 * @param inputElement ����tv.setInput()����������Ǹ�����
	 * @return Object[]һ�����飬������һ��Ԫ�ؾ���һ�����
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			List<?> list = (List<?>) inputElement;
			return list.toArray();
		} else {
			return new Object[0]; // ����һ��������
		}
	}

	/**
	 * �ж�ĳ����Ƿ����ӽ�㡣������ӽ�㣬��ʱ���ǰ����һ����������ͼ��
	 * 
	 * @param element ��Ҫ�ж��Ƿ����ӵĽ��
	 * @return true���ӽ�㣬false���ӽ��
	 */
	@Override
	public boolean hasChildren(Object element) {
		ITreeEntry entry = (ITreeEntry) element;
		List<ITreeEntry> list = entry.getChildren();
		if (list == null || list.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * ������������������Ӧ����ʾ��Щ�ӽ�㡣
	 * 
	 * @param parentElement ��ǰ������Ľ�����
	 * @return ���ӽ����ΪԪ�ص�����
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		ITreeEntry entry = (ITreeEntry) parentElement;
		List<ITreeEntry> list = entry.getChildren();
		if (list == null || list.isEmpty()) {
			return new Object[0];
		} else {
			return list.toArray();
		}
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

}
