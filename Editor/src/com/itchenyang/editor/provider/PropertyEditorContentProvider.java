package com.itchenyang.editor.provider;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.itchenyang.editor.model.PropertyElement;

public class PropertyEditorContentProvider implements ITreeContentProvider {

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object element) {
		if(element instanceof PropertyElement) {
			return ((PropertyElement)element).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof PropertyElement) {
			return ((PropertyElement)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof PropertyElement) {
			return ((PropertyElement)element).getChildren().length>0;
		}
		return false;
	}

	public void dispose() {
		
	}
}
