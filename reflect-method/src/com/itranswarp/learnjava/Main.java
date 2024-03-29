package com.itranswarp.learnjava;

import java.lang.reflect.Method;

/**
 *反射--调用方法
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法
		Class c = p.getClass();
		Method mSetNameMethod = c.getDeclaredMethod("setName", String.class);
		Method mSetAgeMethod = c.getDeclaredMethod("setAge", int.class);
		mSetNameMethod.invoke(p, name);
		mSetAgeMethod.invoke(p, age);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
