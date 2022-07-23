package com.bigkel.tree;

import java.util.List;

public interface ITreeEntry {
	
	public void setName(String name);
	public String getName();
	
	public void setChildren(List<ITreeEntry> children);
	public List<ITreeEntry> getChildren();
}
