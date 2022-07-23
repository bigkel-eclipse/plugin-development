package com.bigkel.tree;

import java.util.List;

public class Country implements ITreeEntry {
	private Long id; // 唯一识别码

	private String name;// 城市名

	private List<ITreeEntry> cities;// City实体的子节点 城市中的人，装在一个List集合中

	public Country(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setChildren(List<ITreeEntry> children) {
		this.cities = children;
	}

	@Override
	public List<ITreeEntry> getChildren() {
		return cities;
	}
}
