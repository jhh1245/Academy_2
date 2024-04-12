package test.chapter2.example01;

public class example01 {
	public static void main(String[] args) {
		int intValue = 10; //10진수
		int intValue2 = 012; //8진수
		int intValue3 = 0xA; //16진수 
		
		System.out.println(intValue);
		System.out.println(intValue2);
		System.out.println(intValue3);
		
		double doubleValue1 = 0.5;
		double doubleValue2 = 3.14;
		
		System.out.println(doubleValue1);
		System.out.println(doubleValue2);
		
		
		char charValue1 = 'A';
		char charValue2 = '한';
		
		System.out.println(charValue1);
		System.out.println(charValue2);
		System.out.println('\t' + "들어쓰기");
		System.out.println("대한" + '\n' + "민국!!");
		System.out.println('\'');
		System.out.println('\"');
		System.out.println('\\');
		
		boolean boolValue1 = true;
		boolean boolValue2 = false;
		System.out.println(boolValue1);
		System.out.println(boolValue2);
		
		byte byteValue = 10; //10만 보면 int라서 byte에 들어갈 수 없다.
		
		long longValue1 = 10;
		long longValue2 = 10000000000L; //int는 21억까진데 L을 적어줘야함 
		
		float f1 = 1.5f; // double타입이라서 

		
	}
}
 