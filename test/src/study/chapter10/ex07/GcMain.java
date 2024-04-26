package study.chapter10.ex07;

public class GcMain {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1); 
		emp = null;
		emp = new Employee(3);
		emp = new Employee(4); // 위에 1, 3 으로만든 객체는 지워진다. 
		emp = new Employee(5); // 위에 1, 3 으로만든 객체는 지워진다. 
		emp = new Employee(6); // 위에 1, 3 으로만든 객체는 지워진다. 
		emp = new Employee(7); // 위에 1, 3 으로만든 객체는 지워진다. 
		emp = new Employee(8); // 위에 1, 3 으로만든 객체는 지워진다. 
		
		System.out.println("현재 사용중인 객체 : " + emp.empno);
		System.gc();

	}

}
