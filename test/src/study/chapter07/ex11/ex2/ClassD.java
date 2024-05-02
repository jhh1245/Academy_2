package study.chapter07.ex11.ex2;

import study.chapter07.ex11.ex1.ClassA;

public class ClassD extends ClassA{
	ClassD(){ // 생성자 
		super(); //이렇게 만들어야 한다. 
		this.fieldA = 10;
		this.methodA();
		// ClassA a = new ClassA(); // 에러 new연산자로는 불가능 생성자를 통해서만 가능  
	}
	
	
	
}
