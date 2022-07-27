package com.itchenyang.editor.provider;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.itchenyang.editor.model.PropertyCategory;
import com.itchenyang.editor.model.PropertyEntry;

public class PropertyEditorLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof PropertyCategory) {
			PropertyCategory category = (PropertyCategory) element;
			switch (columnIndex) {
			case 0:
				return category.getName();
			case 1:
				return "";
			}
		}
		if (element instanceof PropertyEntry) {
			PropertyEntry entry = (PropertyEntry) element;
			switch (columnIndex) {
			case 0:
				return entry.getKey();
			case 1:
				return entry.getValue();
			}
		}
		if (element == null)
			return "<null>";
		return element.toString();
	}

}
