package com.bigkel.table;

import java.util.Date;

public class People {
	private Long id; // Ψһʶ���룬�����ݿ��ﳣΪ�Զ�������ID��
	private String name; // ����
	private boolean sex; // true���У�flase��Ů
	private int age; // ����
	private Date createDate; // ����ط�Date������Long����Ҳ����.(1970�굽���ڵĺ�����)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
