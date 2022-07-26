package com.itchenyang.editor.model;

public interface PropertyFileListener {

	public void entryRemoved(PropertyCategory category, PropertyEntry entry);

	public void entryAdded(PropertyCategory category, PropertyEntry entry);

	public void nameChanged(PropertyCategory category);

	public void categoryAdded(PropertyCategory category);

	public void categoryRemoved(PropertyCategory category);

	public void valueChanged(PropertyCategory category, PropertyEntry entry);

	public void keyChanged(PropertyCategory category, PropertyEntry entry);

}
