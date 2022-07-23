package com.bigkel.tree;

import java.util.List;

public class Country implements ITreeEntry {
	private Long id; // Ψһʶ����

	private String name;// ������

	private List<ITreeEntry> cities;// Cityʵ����ӽڵ� �����е��ˣ�װ��һ��List������

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
