package com.xuleifeng;

public class superTest {
	public static void main(String[] args) {
		// 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
		/********* begin *********/

		Student s= new Student("张三",18);
		s.school="哈佛大学";
		
		System.out.println("姓名："+s.getname()+"，年龄："+s.getage()+"，学校："+s.school);
		/********* end *********/
	}
 }

class Person {
	/********* begin *********/
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
	/********* end *********/
}

class Student extends Person {
	/********* begin *********/
	String school;
	Student(String name,int age){
		super(name,age);
	}
	/********* end *********/
 }

