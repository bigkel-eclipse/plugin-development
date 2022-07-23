package com.bigkel.tree;

import java.util.List;

public class City implements ITreeEntry {

	private Long id; // Ψһʶ����

	private String name;// ������

	private List<ITreeEntry> peoples;// Cityʵ����ӽڵ� �����е��ˣ�װ��һ��List������

	public City(String name) {
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
	}// ����ط��������ӽڵ�....��ǰ��Cityʵ��,���ӽڵ���Peopleʵ��

	@Override
	public void setChildren(List<ITreeEntry> children) {
		// ����ط��ҷ���һ����,��ǰдϰ����,this.name = name
		// ����һ��ʼ����ط���д����this.peoples = peoples
		// ��Countryʵ������Ҳ���������,�������г����ĳ���ֻ��һ�й�����,��������ĳ��ж�û����....
		this.peoples = children;
	}

	@Override
	public List<ITreeEntry> getChildren() {
		return peoples;
	}
}
