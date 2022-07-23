package com.bigkel.tree;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class TreeViewerLableProvider implements ILabelProvider {
	/**
	 * ��¼��ʾ�����֡����ܷ���NULLֵ
	 */
	@Override
	public String getText(Object element) {
		// �õ�����ڵ��Ӧ������,���ȶ�element����ǿ������ת��
		ITreeEntry entry = (ITreeEntry) element;
		return entry.getName();
	}

	/**
	 * ��¼��ʾ��ͼ�񣬿��Է���NULLֵ
	 */
	@Override
	public Image getImage(Object element) {
		return null;
	}

	// >>>>>>>>>>>>>>>>>>>>>>����˵һ�¼�������û����,��ʵ�־Ϳ�����.>>>>>>>>>>>>>>>>>>>>>>>>>
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
