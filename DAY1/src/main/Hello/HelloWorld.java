package main.Hello;
import java.lang.*;
import java.io.*;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeetest empOne =new Employeetest("James Smith");
		Employeetest empTwo = new Employeetest("Mary Anne");
		empOne.empAge(27);
		empOne.empDesignation("Cleaner");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(28);
		empTwo.empDesignation("Debuger");
		empTwo.empSalary(1500);
		empTwo.printEmployee();
	}
}
