package study.chapter7.ex7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		
		ch.x = 10;
		ch.y = 20;
		ch.z = 30;
		
		String result = ch.setNumber();
		System.out.println(result);
	}

}
