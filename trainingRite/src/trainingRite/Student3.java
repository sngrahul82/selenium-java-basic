package trainingRite;
//If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:

public class Student3 {


	//Program where this keyword is not required
		//class Student{  
		int rollno;  
		String name;  
		float fee;  
		Student3(int r,String n,float f){  
		rollno=r;  
		name=n;  
		fee=f;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		//}  
		  
		//class TestThis3{  
		public static void main(String args[]){  
		Student3 s1=new Student3(111,"ankit",5000f);  
		Student3 s2=new Student3(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		}  
}
