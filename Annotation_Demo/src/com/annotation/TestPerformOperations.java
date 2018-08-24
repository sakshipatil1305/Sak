package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestPerformOperations {

	@PerformOperations(number1 = 88, number2 = 22)

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestPerformOperations test = new TestPerformOperations();
		Class class1 = test.getClass();
		Method[] methods = class1.getMethods();
		for (Method method : methods) {

			Annotation[] annotations = method.getAnnotations();

			for (Annotation anno : annotations) {

				if (anno.annotationType().equals(PerformOperations.class)) {
					PerformOperations n = (PerformOperations) anno;
					int number1=n.number1();
					int number2=n.number2();
					System.out.println(number1 + number2);

				}
			}
		}
	}
}
