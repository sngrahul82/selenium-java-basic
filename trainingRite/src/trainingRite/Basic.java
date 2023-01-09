package trainingRite;

public class Basic {

	public static void main(String[] args) {
		
		
		sum();
		sum(2,5);
		CallingMethods.callMethod();
		CallingMethods.callMethodsWithParameter();
		CallingMethods.userInput();

	}
	
	public static void sum() {
		
		int a=22;
		int b=67;
		int c= a+b;
		System.out.println("sum of a+b is :"+c);
	}
	public static int sum(int a, int b) {
		
		int c=a+b;
		
		System.out.println("sum of two variables is : "+c);
		return c;
		
	}

}
