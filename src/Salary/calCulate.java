package Salary;
import java.util.Scanner;
public class calCulate {

String id;
String name;
Double salary;
Double sale;

static Scanner t = new Scanner(System.in);
public calCulate(String insert, String name , Double salary ,Double sale ) {
	// TODO Auto-generated constructor stub
	double x = t.nextDouble();
	this.id=insert;
	this.name=name;
	this.salary=salary;
	this.sale=sale;
	 if(sale<=25000) { 
		 
		 x=sale*(1/100);
		 salary = salary+x;
	        
	 }else if(sale>=25001 && sale<=50000) {

		 x=sale*(2/100);
		 salary = salary+x;		        
	 }else {
		 
		 x=sale*(3/100);
		 salary = salary+x;	        
	 }
}
	
}
