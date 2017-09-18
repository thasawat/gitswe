package gitswe;
import java.util.Scanner;
public class Hello {
	static Scanner t = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter radius : ");
		double radius = t.nextDouble();
        Scanner input = new Scanner(System.in);
        System.out.print( "Area is : ");
        System.out.println(getArea(radius));
    }
	
	public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

		
}
