package com.neotech.lesson26;

public class  EmployeeTest {

	public static void main(String[] args) {

		
		
		
		
		Employee emp = new Employee();
		 
		// becausese variables are private i can not access them directly from here 
	//  emp.name = "Mahwish";
	//	emp.age = 27;
	//	emp.salary = 5000;
		
		
		
		
		// if you want set value you need SETTER
		// if you want get value you need GETTER
		
		emp.setName("Abit");
		
		emp.setAge(27);
		
		emp.setSalary(5000.0);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
		
		
		
		
		
		
	}

}
