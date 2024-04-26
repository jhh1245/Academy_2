package study.chapter10.ex07;

public class Employee {
	
	int empno;
	
	Employee(int empno){
		this.empno = empno;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("employee " + this.empno + "가 메모리에서 제거됨");
	}
}
