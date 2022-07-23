package com.bigkel.table;

import java.util.Date;

public class People {
	private Long id; // 唯一识别码，在数据库里常为自动递增的ID列
	private String name; // 姓名
	private boolean sex; // true是男，flase是女
	private int age; // 年龄
	private Date createDate; // 这个地方Date声明称Long类型也可以.(1970年到现在的毫秒数)

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
