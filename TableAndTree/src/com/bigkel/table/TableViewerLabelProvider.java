package com.bigkel.table;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class TableViewerLabelProvider implements ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;// 这个和getColumnText()不同的是,这个方法可以返回一个null值.
	}

	/**
	 * 由此方法决定数据记录在表格的每一列是显示什么文字
	 * 
	 * @param element     实体类对象
	 * @param columnIndex 列号，0是第一列
	 * @return 返回值一定要避免NULL值,否则出错
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
			return people.isSex() ? "男" : "女";
		}

		if (columnIndex == 3) {
			return people.getAge() + "";
			// 这个地方是boolen类型的set和getter方法特别的地方.是"is"开头的
		}

		if (columnIndex == 4) {
			return people.getCreateDate().toString();
		}
		// 当都不符合的时候返回一个空字符串
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
