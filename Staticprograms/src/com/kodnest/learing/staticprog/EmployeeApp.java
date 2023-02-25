package com.kodnest.learing.staticprog;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "sahana");
		System.out.println(Employee.count);
		Employee e2 = new Employee(2, "sindhu");
		System.out.println(Employee.count);
		Employee e3 = new Employee(3, "swathi");
		System.out.println(Employee.count);
	}
}
