package com.bigkel.table;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class TableViewerContentProvider implements IStructuredContentProvider {
	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	// 实现IStructuredContentProvider接口之后,主要复写的就是这个getElements()方法.
	@Override
	public Object[] getElements(Object inputElement) {// setInput传过来的是一个集合
		if (inputElement instanceof List) {// 对这个参数进行类型的判断.
			return ((List<?>) inputElement).toArray();// 将setInput传过来的List变成一个数组输出
		} else {
			return new Object[0];
		}
	}
}
