package gitswe;
import java.util.Scanner;
public class Hello {
	
	public static void main(String[] args) {
		int x;
		System.out.print("Enter number to check odd or even : ");
        Scanner in = new Scanner(System.in);
        x=in.nextInt();
        
        if(calc(x)==true) {
        System.out.println(x+" is even number ");
        }else {
        System.out.println(x+" is odd number ");	
        }
        	
       
    }
	private static boolean calc(int i) {
		// TODO Auto-generated method stub
		
		if (i%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
