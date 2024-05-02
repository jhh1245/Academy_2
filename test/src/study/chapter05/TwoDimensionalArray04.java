package study.chapter05;

public class TwoDimensionalArray04 {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "홍길동";
		strArray[1] = "홍길동";
		strArray[2] = new String("홍길동");
		
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		System.out.println(strArray[2]);
		
		System.out.println();
		System.out.println(strArray[0]== strArray[1]); //t
		System.out.println(strArray[0]== strArray[2]); //f
		
		System.out.println();
		System.out.println(strArray[0].equals(strArray[1])); //t
		System.out.println(strArray[0].equals(strArray[2])); //t
	}

}
