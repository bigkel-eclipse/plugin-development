package com.itchenyang.editor.model;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PropertyFile extends PropertyElement {
	private PropertyCategory unnamedCategory;
	private List<PropertyCategory> categories;
	private List<PropertyFileListener> listeners;

	public PropertyFile(String content) {
		super(null);
		categories = new ArrayList<PropertyCategory>();
		listeners = new ArrayList<PropertyFileListener>();

		LineNumberReader reader = new LineNumberReader(new StringReader(content));
		try {
			unnamedCategory = new PropertyCategory(this, reader);
			while (true) {
				reader.mark(1);
				int ch = reader.read();
				if (ch == -1)
					break;
				reader.reset();
				categories.add(new PropertyCategory(this, reader));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public PropertyElement[] getChildren() {
		List<PropertyElement> children = new ArrayList<PropertyElement>();
		children.addAll(unnamedCategory.getEntries());
		children.addAll(categories);
		return children.toArray(new PropertyElement[children.size()]);
	}

	public void addCategory(PropertyCategory category) {
		if (!categories.contains(category)) {
			categories.add(category);
			categoryAdded(category);
		}
	}

	public void removeCategory(PropertyCategory category) {
		if (categories.remove(category)) {
			categoryRemoved(category);
		}
	}

	@Override
	public void removeFromParent() {
		// TODO Auto-generated method stub

	}

	public void addPropertyFileListener(PropertyFileListener listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removePropertyFileListener(PropertyFileListener listener) {
		listeners.remove(listener);
	}

	void keyChanged(PropertyCategory category, PropertyEntry entry) {
		Iterator<PropertyFileListener> iter = listeners.iterator();
		while (iter.hasNext())
			iter.next().keyChanged(category, entry);
	}

	void valueChanged(PropertyCategory category, PropertyEntry entry) {
		Iterator<PropertyFileListener> iter = listeners.iterator();
		while (iter.hasNext())
			iter.next().valueChanged(category, entry);
	}

	void nameChanged(PropertyCategory category) {
		Iterator<PropertyFileListener> iter = listeners.iterator();
		while (iter.hasNext())
			iter.next().nameChanged(category);
	}

	void entryAdded(PropertyCategory category, PropertyEntry entry) {
		Iterator<PropertyFileListener> iter = listeners.iterator();
		while (iter.hasNext())
			iter.next().entryAdded(category, entry);
	}

	void entryRemoved(PropertyCategory category, PropertyEntry entry) {
		Iterator<PropertyFileListener> iter = listeners.iterator();
		while (iter.hasNext())
			iter.next().entryRemoved(category, entry);
	}

	void categoryAdded(PropertyCategory category) {
		Iterator<PropertyFileListener> iter = listeners.iterator();
		while (iter.hasNext())
			iter.next().categoryAdded(category);
	}

	void categoryRemoved(PropertyCategory category) {
		Iterator<PropertyFileListener> iter = listeners.iterator();
		while (iter.hasNext())
			iter.next().categoryRemoved(category);
	}

	public String asText() {
		StringWriter stringWriter = new StringWriter(2000);
		PrintWriter writer = new PrintWriter(stringWriter);
		unnamedCategory.appendText(writer);
		Iterator<PropertyCategory> iter = categories.iterator();
		while (iter.hasNext()) {
			writer.println();
			iter.next().appendText(writer);
		}
		return stringWriter.toString();
	}

}
