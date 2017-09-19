package Salary;
import java.util.Scanner;
public class calCulate {
String id;
String name;
Double salary;
Double sale;

public calCulate(String insert, String name , Double salary ,Double sale ) {
	// TODO Auto-generated constructor stub
	
	this.id=insert;
	this.name=name;
	this.salary=salary;
	this.sale=sale;
	 if(sale<=25000) { 
		 
		 this.sale=sale*(0.01);
		 this.salary =  this.salary + this.sale;
	        
	 }else if(sale>=25001 && sale<=50000) {

		 this.sale=sale*(0.02);
		 this.salary =  this.salary+this.sale;		        
	 }else {
		 
		 this.sale=sale*(0.03);
		 this.salary =  this.salary+ this.sale;	        
	 }
	}
	public void output(){

	System.out.println(this.name);	
	System.out.println(this.salary);
	
	}
}
