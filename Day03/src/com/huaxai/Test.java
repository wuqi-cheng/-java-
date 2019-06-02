package com.huaxai;

/**
 * 
 * @author 伍
 *1.基础语法：入口、标准的输入输出、注释、变量、标识符、关键字、数据类型、运算符(优先级：)、
 *			表达式、语句、语句块、流程控制
 *	方法(函数)、数组(集合)、编程工具、调试程序
 *2.面向对象编程 OOP（Object Oriented Programming)：
 *	封装性：数据的封装，逻辑的封装（将数据和逻辑（对象、成员、属性）全部封装在类里）
 *	继承性：
 *	多态性：
 *	
 *	变量：成员变量（属性）、局部变量
 *	成员方法，行为
 *
 *
 *	类：是一个群体的概念
 *		类是对象的类型（模板）
 *	对象：是一个个体的概念
 *		对象是类的实例（具体）
 */

/*
 * 构造器
 * 特点：
 * 1.方法名和类名相同
 * 2.没有任何返回类型
 */

public class Test {
	public static void main(String[] args) {
		System.out.println();
		Test test = new Test();
		test.toString();
	}
}
