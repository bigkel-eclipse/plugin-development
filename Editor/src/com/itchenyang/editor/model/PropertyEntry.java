package com.itchenyang.editor.model;

import java.io.PrintWriter;

public class PropertyEntry extends PropertyElement {

	String key;
	String value;
	
	public PropertyEntry(PropertyCategory parent, String key, String value) {
		super(parent);
		this.key = key;
		this.value = value;
	}

	@Override
	public PropertyElement[] getChildren() {
		return NO_CHILDREN;
	}

	@Override
	public void removeFromParent() {
		((PropertyCategory)getParent()).removeEntry(this);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String text) {
		if(key.equals(text)) {
			return;
		}
		key = text;
		((PropertyCategory)getParent()).keyChanged(this);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String text) {
		if(value.equals(text)) {
			return;
		}
		value = text;
		((PropertyCategory)getParent()).valueChanged(this);
	}
	
	public void appendText(PrintWriter writer) {
		writer.print(key);
		writer.print(" = ");
		writer.print(value);
		writer.print("\n");
	}

}
