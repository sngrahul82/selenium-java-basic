package trainingRite;
// Prove that this keyword refers to the current class instance variable.

public class Ref {
	
	
		void m(){  
		System.out.println(this);//prints same reference ID  
		}  

		public static void main(String args[]){ 
			 Ref obj = new Ref();
			 System.out.println(obj);
			 obj.m();
		}
}
