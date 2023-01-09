package trainingRite;
//Java Program to demonstrate the use of static variable

public class Student {

	  
//	class Student{  
	   int enrollmentno;//instance variable  
	   String name;  
	   static String course ="selenium";//static variable  
	   //constructor  
	   Student(int e, String n){  
	   enrollmentno = e;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(enrollmentno+" "+name+" "+course);}  
	//}  
	//Test class to show the values of objects  
	//	public class TestStaticVariable1{  
		 public static void main(String args[]){  
		 Student s1 = new Student(12,"Rupal");  
		 Student s2 = new Student(22,"Rahul");  
		 //we can change the course of all objects by the single line of code  
		 //Student.course="java";  
		 s1.display();  
		 s2.display();  
		 }  
		}  

//}
