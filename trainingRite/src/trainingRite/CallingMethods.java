package trainingRite;

import java.util.Scanner;

public class CallingMethods {
	
	public static void callMethod() {
		
		System.out.println("I am learning java");
	}
	
	public static void callMethodsWithParameter() {
		
		String a= "I am learning ";
		String b= "Java";
		
		System.out.println(a.concat(b));
	}
	
	public static void userInput() {
		
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter user name: ");
		String userName=myObj.nextLine();
		System.out.println("User name is "+userName);
	}

}
