package study.chapter7.ex3;

public class Student extends People{
	public int studentNo; 
	
	// 첫번째 방법  
//	Student(int studentNo){
//		super("홍길동", "123456-123456"); // super는 첫줄에 써야한다. 
//		this.studentNo = studentNo; 
//	}
	
	// 두번째 방법 
	Student(String name, String ssn, int studentNo){
		super(name, ssn); // 매개변수로 만든 변수를 super에 넘긴다.
		System.out.println("부모 생성자 종료");
		this.studentNo = studentNo;
		System.out.println("자식 생성자 종료");
	}
}
