package gitswe;

import java.util.Scanner;

public class checknum {

	
		static Scanner t = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				System.out.print("Enter number : ");
				int num = t.nextInt();
		        if(num>=0 && num<=100) {
		        	 System.out.print( "OK");
		        }else if(num>100) {
		        System.out.print( "more than");
		        } else if(num<0) {
			        System.out.print( "less than");
		        }
		    }
	}




