package Salary;

import java.util.Scanner;

public class inSert {

	 public static void main(String[] args) {
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
		calCulate send= new calCulate(id,name,salary,sale);
		send.output();
	
		
	}
}

