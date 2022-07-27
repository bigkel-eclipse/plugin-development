package com.itchenyang.editor.model;

public abstract class PropertyElement {

	public static final PropertyElement[] NO_CHILDREN = {};

	private PropertyElement parent;

	public PropertyElement(PropertyElement parent) {
		this.parent = parent;
	}

	public PropertyElement getParent() {
		return this.parent;
	}

	public abstract PropertyElement[] getChildren();

	public abstract void removeFromParent();
}
