package main.Hello;
import java.io.*;

public class Employeetest {
	String name;
	int age;
	String designation;
	double salary;
	
	//This is the constructor of the class Employee
	public Employeetest(String name) {
		this.name=name;
	}
	public void empAge(int empAge) {
		age=empAge;
	}
	public void empDesignation(String EmpDesig) {
		designation =EmpDesig;
	}
	public void empSalary(double empSalary) {
		salary=empSalary;
	}
	public void printEmployee() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
	}
}
