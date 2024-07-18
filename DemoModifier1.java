package com.apjfsa;

public class DemoModifier1 {
	public static void main(String[] args) {
		// Creating object of ModifiersUsageDemo
		ModifiersUsageDemo demo = new ModifiersUsageDemo();

		// Accessing public variable
		demo.val1 = 798;
		System.out.println("value1= " + demo.val1);

		// Accessing protected variable
		demo.val2 = 675;
		System.out.println("value2= " + demo.val2);

		// Accessing default variable
		demo.val4 = 189;
		System.out.println("value4= " + demo.val4);

		// Setting and accessing private variable using setter and getter
		demo.setdouble3(342);
		System.out.println("value3= " + demo.getVal3());
	}
}
