package com.bigkel.tree;

import java.util.Date;
import java.util.List;

public class People implements ITreeEntry {
	private Long id; // Ψһʶ���룬�����ݿ��ﳣΪ�Զ�������ID��
	private String name; // ����
	private boolean sex; // �Ա� true�У�flaseŮ
	private int age; // ����
	private Date createDate; // ��¼�Ľ������ڣ���java.util.Date��������java.sql.Date

	public People(String name) {
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

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	// ��Ϊ�������������С�ӽڵ�,��������ط���ʵ�ֽӿ��е������������Ϳ�����
	@Override
	public void setChildren(List<ITreeEntry> children) {
	}

	@Override
	public List<ITreeEntry> getChildren() {
		return null;
	}
}
