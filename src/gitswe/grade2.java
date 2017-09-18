package gitswe;

import java.util.Scanner;

public class grade2 {
	static Scanner t = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Grade : ");
		int score = t.nextInt();
		final String grade;  
					if (score >= 80) {
			           grade = "Grade:A";
			        } else if (score >= 70) {
			           grade = "Grade:B";      
			        } else if (score >= 60) {
				           grade = "Grade:C";
			       
			        } else if (score >= 50) {
				           grade = "Grade:D";
			        } else {
			            grade = "Grade:F";
			     }
		System.out.printf (grade);
	}

}

