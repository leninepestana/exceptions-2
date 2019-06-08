package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");
		
		

	}
	
	public static void method1() {
		System.out.println("*************METHOD1 START*************");
		method2();
		System.out.println("*************METHOD1 END*************");
		
	}
	
	public static void method2() {
		System.out.println("*************METHOD2 START*************");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter values separated by (\"\") :");
			String[] vector = sc.nextLine().split(" ");
			
			System.out.println("Enter position: ");
			int position = sc.nextInt();

			System.out.println("Position " + position + " has a value of " + vector[position]);
			
			System.out.println();
			
			System.out.println("TOTAL VALUES ON VECTOR ARE:");
			for (int i=0; i<vector.length; i++) {
				System.out.println(vector[i]);
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Imput error, not a number");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			//e.printStackTrace(); // test with printStackTrace()
			//sc.next();
		}
		
		sc.close();
		
		System.out.println("*************METHOD2 END*************");
	}
}
