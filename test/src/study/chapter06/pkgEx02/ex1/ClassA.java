 package study.chapter6.pkgEx02.ex1;

public class ClassA { 			  // public   
	
	ClassA a1 = new ClassA(10);   // public
	ClassA a2 = new ClassA(10.0); // default 
	ClassA a3 = new ClassA("10"); // private
	
	
	
	public ClassA(int a) { 		  // public
	}
	
	ClassA(double b){ 			  //default
	}
	
	private ClassA(String c) { 	  // private
	}
	
}
