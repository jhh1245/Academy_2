package study.chapter6.methodExam;

public class CalMain {

	public static void main(String[] args) {
		Cal cal = new Cal();
		
		cal.add();
		cal.add(10,20);
		
		int result = cal.add(10);
		System.out.println(result);

	}

}
