package com.bigkel.tree;

import java.util.List;

public class City implements ITreeEntry {

	private Long id; // 唯一识别码

	private String name;// 城市名

	private List<ITreeEntry> peoples;// City实体的子节点 城市中的人，装在一个List集合中

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
	}// 这个地方是设置子节点....当前是City实体,其子节点是People实体

	@Override
	public void setChildren(List<ITreeEntry> children) {
		// 这个地方我犯了一错误,以前写习惯了,this.name = name
		// 所以一开始这个地方我写的是this.peoples = peoples
		// 在Country实体类中也是这个错误,所以运行出来的程序只有一列国家名,国家下面的城市都没有了....
		this.peoples = children;
	}

	@Override
	public List<ITreeEntry> getChildren() {
		return peoples;
	}
}
