package com.bigkel.tree;

import java.util.ArrayList;

/**
 * 此类负责生成TreeViewer的方法setInput所需要的参数.
 * 
 * @author kongxiaohan
 * 
 *         这个地方我没有用书中用的局部代码块,在组织代码的时候确实犯了一些小错误, 确实体会到了局部代码块的意义,代码读起来容易,而且节省了内存.
 */
public class DataFactory {
	/**
	 * 在这个方法中定义生成的数据 要有人People的数据对象 要有国家Country的数据对象 要有城市City的数据对象
	 * 
	 * @return
	 */
	public static Object createTreeData() {
		// 生成人People的数据对象
		People people1 = new People("张A");
		People people2 = new People("张B");
		People people3 = new People("张C");
		People people4 = new People("张D");
		People people5 = new People("张E");
		People people6 = new People("张F");
		People people7 = new People("张G");
		People people8 = new People("张H");
		People people9 = new People("张I");

		// 生成城市City的数据对象
		City city1 = new City("北京");
		City city2 = new City("广州");
		City city3 = new City("东京");
		City city4 = new City("芝加哥");
		City city5 = new City("洛杉矶");

		// 生成国家Country的的数据对象
		Country country1 = new Country("中国");
		Country country2 = new Country("日本");
		Country country3 = new Country("美国");

		/**
		 * 将这些封装的对象建立关系.
		 */
		// 1.人和城市的关系
		// 张A 张B 张C 在帝都
		ArrayList<ITreeEntry> list1 = new ArrayList<ITreeEntry>();
		list1.add(people1);
		list1.add(people2);
		list1.add(people3);
		city1.setChildren(list1);

		// 张D 张E 张F在广州
		ArrayList<ITreeEntry> list2 = new ArrayList<ITreeEntry>();
		list2.add(people4);
		list2.add(people5);
		list2.add(people6);
		city2.setChildren(list2);

		// 张G 在东京
		ArrayList<ITreeEntry> list3 = new ArrayList<ITreeEntry>();
		list3.add(people7);
		city3.setChildren(list3);

		// 张I 在芝加哥
		ArrayList<ITreeEntry> list4 = new ArrayList<ITreeEntry>();
		list4.add(people8);
		city4.setChildren(list4);

		// 张H 在洛杉矶
		ArrayList<ITreeEntry> list5 = new ArrayList<ITreeEntry>();
		list5.add(people9);
		city5.setChildren(list5);

		// 2.城市和国家的关系
		// 北京 上海 广州是中国的
		ArrayList<ITreeEntry> list6 = new ArrayList<ITreeEntry>();
		list6.add(city1);
		list6.add(city2);
		country1.setChildren(list6);

		// 东京是日本的
		ArrayList<ITreeEntry> list7 = new ArrayList<ITreeEntry>();
		list7.add(city3);
		country2.setChildren(list7);

		// 芝加哥和洛杉矶是美国的
		ArrayList<ITreeEntry> list8 = new ArrayList<ITreeEntry>();
		list8.add(city4);
		list8.add(city5);
		country3.setChildren(list8);

		// 3.将国家置于一个对象之下,这个对象可以是一个List也可以是个数组
		// 国家是这个树上的最上层的节点.国家和国家之间是并列的关系,把这几个国家放到一个List集合对象中.
		ArrayList<ITreeEntry> list9 = new ArrayList<ITreeEntry>();
		list9.add(country1);
		list9.add(country2);
		list9.add(country3);
		return list9;
	}
}
