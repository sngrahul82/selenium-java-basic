package trainingRite;

//Solution of the student1 problem by this keyword
public class Student2 {
	
	int enrollno;  
	String name;  
	float fee;  
	Student2(int enrollno,String name,float fee){  
	this.enrollno=enrollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(enrollno+" "+name+" "+fee);}  
	  
	  
	//class TestThis2{  
	public static void main(String args[]){  
	Student2 s1=new Student2(456,"ankit",5000f);  
	Student2 s2=new Student2(564,"sumit",6000f);  
	s1.display();  
	s2.display();  
	} 
	

}
