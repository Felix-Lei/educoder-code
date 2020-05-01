package com.xuleifeng;
interface A{
	public static double PI= 3.14;
	double area();
}
interface B{
	abstract void setColor(String c);
}
interface C extends A,B{
	abstract void volume();
}
class Cylinder implements C {
	double radius;
	double height;
	String color;
	public Cylinder (double radius,double height,String color) {
		this.radius= radius;
		this.height= height;
		this.color= color;
	}
	public double area(){
		return PI*radius*height;
		
	}
	public void volume() {
		System.out.println(area()*height);
	}
	public String setColor() {
		return color;
	}
	@Override
	public void setColor(String c) {
		System.out.println(c);// TODO Auto-generated method stub
		
	}
}
public class Main{
public static void main() {
	Cylinder cy = new Cylinder(2.1,3.1,"red");
	cy.setColor("blue");
	cy.area();
	cy.volume();
}
	
}