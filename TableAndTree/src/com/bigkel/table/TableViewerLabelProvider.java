package com.bigkel.table;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class TableViewerLabelProvider implements ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;// �����getColumnText()��ͬ����,����������Է���һ��nullֵ.
	}

	/**
	 * �ɴ˷����������ݼ�¼�ڱ���ÿһ������ʾʲô����
	 * 
	 * @param element     ʵ�������
	 * @param columnIndex �кţ�0�ǵ�һ��
	 * @return ����ֵһ��Ҫ����NULLֵ,�������
	 */
	@Override
	public String getColumnText(Object element, int columnIndex) {
		People people = (People) element;
		if (columnIndex == 0) {
			return people.getId().toString();
		}

		if (columnIndex == 1) {
			return people.getName();
		}

		if (columnIndex == 2) {
			return people.isSex() ? "��" : "Ů";
		}

		if (columnIndex == 3) {
			return people.getAge() + "";
			// ����ط���boolen���͵�set��getter�����ر�ĵط�.��"is"��ͷ��
		}

		if (columnIndex == 4) {
			return people.getCreateDate().toString();
		}
		// ���������ϵ�ʱ�򷵻�һ�����ַ���
		return "";
	}

	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}
}
