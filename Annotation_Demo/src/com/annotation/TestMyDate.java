package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestMyDate {

	@MyDate(month = "July", year = 1922)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestMyDate test = new TestMyDate();
		Class class1 = test.getClass();
		Method[] methods = class1.getMethods();
		for (Method method : methods) {

			Annotation[] annotations = method.getAnnotations();

			for (Annotation anno : annotations) {

				if (anno.annotationType().equals(MyDate.class)) {
					MyDate n = (MyDate) anno;
					String day = n.day();
					String month=n.month();
					int year=n.year();
					System.out.println(day+" "+month+ " "+year);

				}
			}
		}
	}
}
