package study.chapter2.example03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVal = 10;
		double doubleVal = 5.5;
		// double result = intVal + doubleVal; //int가 double이 되서 결과값은 double이 된다. 
		int result = intVal + (int)doubleVal; //10 + 5 = 15가 된다.  
		
		System.out.println(result);
	}

}
