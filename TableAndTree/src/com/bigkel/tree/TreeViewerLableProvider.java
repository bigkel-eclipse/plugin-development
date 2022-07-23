package com.bigkel.tree;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class TreeViewerLableProvider implements ILabelProvider {
	/**
	 * 记录显示的文字。不能返回NULL值
	 */
	@Override
	public String getText(Object element) {
		// 得到这个节点对应的名字,首先对element进行强制类型转换
		ITreeEntry entry = (ITreeEntry) element;
		return entry.getName();
	}

	/**
	 * 记录显示的图像，可以返回NULL值
	 */
	@Override
	public Image getImage(Object element) {
		return null;
	}

	// >>>>>>>>>>>>>>>>>>>>>>书上说一下几个方法没有用,空实现就可以了.>>>>>>>>>>>>>>>>>>>>>>>>>
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}
}
