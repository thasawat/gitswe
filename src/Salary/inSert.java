package Salary;

import java.util.Scanner;

public class inSert {

	public inSert(){
		// TODO Auto-generated method stub
		String id;
		String name;
		Double salary;
		Double sale;
		
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		name = sc.nextLine();
		salary = sc.nextDouble();
		sale=sc.nextDouble();
	
		
		System.out.println(id);
		System.out.println(name);	
		System.out.println(salary);
		System.out.println(sale);
		
	}
}

