package com.bigkel.tree;

import java.util.List;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class MyTableLableProvider implements ITableLabelProvider {
	public String getColumnText(Object element, int columnIndex) {
		ITreeEntry entry = (ITreeEntry) element;
		switch (columnIndex) {
		case 0:
			return entry.getName();
		case 1:
			List<?> list = entry.getChildren();
			if (list == null)
				return "";
			return String.valueOf(list.size());
		case 2:
			if (entry instanceof People) {
				boolean sex = ((People) entry).isSex();
				return sex ? "ÄÐ" : "Å®";
			}
			return "";
		default:
			return "";
		}
	}

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public void addListener(ILabelProviderListener listener) {
	}

	public void removeListener(ILabelProviderListener listener) {
	}

	public void dispose() {
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}
}
