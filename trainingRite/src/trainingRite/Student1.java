package trainingRite;

//Understanding the problem without this keyword
public class Student1 {
	
	
	int enrollmentno;  
	String name;  
	float fee;  
	Student1(int enrollmentno,String name,float fee){  
	enrollmentno=enrollmentno;  
	name=name;  
	fee=fee;  
	}  
	void display(){System.out.println(enrollmentno+" "+name+" "+fee);}  
	//}  
	//class TestThis1{  
	public static void main(String args[]){  
		Student1 s1=new Student1(12,"Rupal",5000f);  
		Student1 s2=new Student1(32,"Rupanshu",6000f);  
		s1.display();  
		s2.display();  
	}}  

//}
