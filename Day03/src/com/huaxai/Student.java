package com.huaxai;

/*
 * 先有类，再有对象
 */
public class Student {
	private String name;//成员变量，属于对象，一个对象拥有一个成员
	private int age;
	static String teacher;//静态变量，属于类，在内存中只有唯一的一份，所有对象共享
	
	/*
	 *	方法的重载：方法名相同，参数列表不同
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
		s1.name = "里斯";
		Student s2 = new Student("张三", 20);
		s2.setAge(65);
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println();
	}
	
}
