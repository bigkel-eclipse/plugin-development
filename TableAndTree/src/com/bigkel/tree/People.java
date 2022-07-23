package com.bigkel.tree;

import java.util.Date;
import java.util.List;

public class People implements ITreeEntry {
	private Long id; // 唯一识别码，在数据库里常为自动递增的ID列
	private String name; // 姓名
	private boolean sex; // 性别 true男，flase女
	private int age; // 年龄
	private Date createDate; // 记录的建立日期，是java.util.Date，而不是java.sql.Date

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

	// 因为人是这个树的最小子节点,所以这个地方空实现接口中的这两个方法就可以了
	@Override
	public void setChildren(List<ITreeEntry> children) {
	}

	@Override
	public List<ITreeEntry> getChildren() {
		return null;
	}
}
