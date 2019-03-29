package com.inherit;

public class Teacher extends Person {
	public String name = "Teacher";
	public final int LEG_NUM = 3;
	@Override
	public void eat(){
		System.out.println("Teacher的eat方法");
	}
//	不能重写被final修饰的方法
//	@Override
//	public final void digestion(){
//		System.out.println("Person的digestion方法");
//	}
}
