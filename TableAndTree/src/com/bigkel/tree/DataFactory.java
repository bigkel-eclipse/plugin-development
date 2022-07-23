package com.bigkel.tree;

import java.util.ArrayList;

/**
 * ���ฺ������TreeViewer�ķ���setInput����Ҫ�Ĳ���.
 * 
 * @author kongxiaohan
 * 
 *         ����ط���û���������õľֲ������,����֯�����ʱ��ȷʵ����һЩС����, ȷʵ��ᵽ�˾ֲ�����������,�������������,���ҽ�ʡ���ڴ�.
 */
public class DataFactory {
	/**
	 * ����������ж������ɵ����� Ҫ����People�����ݶ��� Ҫ�й���Country�����ݶ��� Ҫ�г���City�����ݶ���
	 * 
	 * @return
	 */
	public static Object createTreeData() {
		// ������People�����ݶ���
		People people1 = new People("��A");
		People people2 = new People("��B");
		People people3 = new People("��C");
		People people4 = new People("��D");
		People people5 = new People("��E");
		People people6 = new People("��F");
		People people7 = new People("��G");
		People people8 = new People("��H");
		People people9 = new People("��I");

		// ���ɳ���City�����ݶ���
		City city1 = new City("����");
		City city2 = new City("����");
		City city3 = new City("����");
		City city4 = new City("֥�Ӹ�");
		City city5 = new City("��ɼ�");

		// ���ɹ���Country�ĵ����ݶ���
		Country country1 = new Country("�й�");
		Country country2 = new Country("�ձ�");
		Country country3 = new Country("����");

		/**
		 * ����Щ��װ�Ķ�������ϵ.
		 */
		// 1.�˺ͳ��еĹ�ϵ
		// ��A ��B ��C �ڵ۶�
		ArrayList<ITreeEntry> list1 = new ArrayList<ITreeEntry>();
		list1.add(people1);
		list1.add(people2);
		list1.add(people3);
		city1.setChildren(list1);

		// ��D ��E ��F�ڹ���
		ArrayList<ITreeEntry> list2 = new ArrayList<ITreeEntry>();
		list2.add(people4);
		list2.add(people5);
		list2.add(people6);
		city2.setChildren(list2);

		// ��G �ڶ���
		ArrayList<ITreeEntry> list3 = new ArrayList<ITreeEntry>();
		list3.add(people7);
		city3.setChildren(list3);

		// ��I ��֥�Ӹ�
		ArrayList<ITreeEntry> list4 = new ArrayList<ITreeEntry>();
		list4.add(people8);
		city4.setChildren(list4);

		// ��H ����ɼ�
		ArrayList<ITreeEntry> list5 = new ArrayList<ITreeEntry>();
		list5.add(people9);
		city5.setChildren(list5);

		// 2.���к͹��ҵĹ�ϵ
		// ���� �Ϻ� �������й���
		ArrayList<ITreeEntry> list6 = new ArrayList<ITreeEntry>();
		list6.add(city1);
		list6.add(city2);
		country1.setChildren(list6);

		// �������ձ���
		ArrayList<ITreeEntry> list7 = new ArrayList<ITreeEntry>();
		list7.add(city3);
		country2.setChildren(list7);

		// ֥�Ӹ����ɼ���������
		ArrayList<ITreeEntry> list8 = new ArrayList<ITreeEntry>();
		list8.add(city4);
		list8.add(city5);
		country3.setChildren(list8);

		// 3.����������һ������֮��,������������һ��ListҲ�����Ǹ�����
		// ������������ϵ����ϲ�Ľڵ�.���Һ͹���֮���ǲ��еĹ�ϵ,���⼸�����ҷŵ�һ��List���϶�����.
		ArrayList<ITreeEntry> list9 = new ArrayList<ITreeEntry>();
		list9.add(country1);
		list9.add(country2);
		list9.add(country3);
		return list9;
	}
}
