package com.huaxai;

/*
 * �����࣬���ж���
 */
public class Student {
	private String name;//��Ա���������ڶ���һ������ӵ��һ����Ա
	private int age;
	static String teacher;//��̬�����������࣬���ڴ���ֻ��Ψһ��һ�ݣ����ж�����
	
	/*
	 *	���������أ���������ͬ�������б�ͬ
	 */
	public Student() {
		System.out.println("no param");
	}

	public Student(String name, int age) {
		System.out.println("two param");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "��˹";
		Student s2 = new Student("����", 20);
		s2.setAge(65);
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println();
	}
	
}
