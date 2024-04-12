package test.chapter2.example02;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //문제되지 않음 
		System.out.println(intValue);
		
		char charVal = 'A'; //65
		System.out.println(charVal);
		
		int intVal2 = 500;
		long longVal = intVal2;
		System.out.println(longVal);
		
		intVal2 = 200;
		double doubleVal = intVal2;
		System.out.println(doubleVal);
	}

}
