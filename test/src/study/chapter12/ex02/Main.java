package study.chapter12.ex02;

public class Main {

	public static void main(String[] args) {
		A.C c = new A.C();
		 
		c.field1 = 10;
		System.out.println("C.field1 : " + c.field1);
		
		A.C.field2 = 20; // 그냥 A.field2 하면 경고 
		System.out.println("C.field2 : " + A.C.field2);

		A.C.method();
	}

}
