package com.xuleifeng;

public class overridingTest {
	public static void main(String[] args) {
		// 实例化子类对象s，调用talk()方法打印信息
		/********* begin *********/
		Student s=new Student("张三",18,"哈佛大学");
		s.talk();
		/********* end *********/
		
	}
}

class Person {
	/********* begin *********/
	String name;
	int age;
	/*Person(String naem,int age){
		this.name=naem;
		this.age=age;
	}
	*/
	void talk(){
		System.out.println("我是："+name+",今年："+age);
		
	}
	/********* end *********/
}

class Student extends Person {
	/********* begin *********/
		String school;
		Student(String name,int age,String school){
			this.name=name;
			this.age=age;
			this.school=school;
		}
		@Override
		void talk(){
			super.talk();
			System.out.println("岁，我在"+school+"上大学");
			
		}
	/********* end *********/
}