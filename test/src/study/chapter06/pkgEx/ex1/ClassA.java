package study.chapter6.pkgEx.ex1;

class ClassA { //default 접근 제한자 (같은 패키지만 접근 가능) 
	ClassB b; 
	
	void methodA() {
		ClassB cb = new ClassB();
	}
}
