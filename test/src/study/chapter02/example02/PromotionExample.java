package study.chapter02.example02;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //문제되지 않음 
		System.out.println(intValue);
		
		int charVal = 'A';
		System.out.println(charVal);  //65
		
		int intVal2 = 500;
		long longVal = intVal2;
		System.out.println(longVal); //50
		
		intVal2 = 200;
		double doubleVal = intVal2;
		System.out.println(doubleVal); //200.0
		
		intVal2 = 123456784;
		//byteValue = intVal2; // 에러 int값이 더 크기 때문에 byte에 못담음
		byteValue = (byte)intVal2; //int 값 4자리중에 3자리를 버린다. 
		System.out.println(byteValue);
		
		doubleVal = 3.14;
		intValue = (int)doubleVal;
		System.out.println(intValue); //.14는 잘리고 3만 남는다. 
	}

}
