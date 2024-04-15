package chapter3;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean play = true;
		System.out.println(play); // t 
		
		play = !play;
		System.out.println(play); // f 
		
		System.out.println(!play); //출력은 t : false일 것 같지만 true이다. 왜냐하면 대입연산자를 쓰지 않았기 때문에
		//실제값은 false 
		
		System.out.println("다시 : " + (play = !play)); //true
		System.out.println(play); //true
		System.out.println("다시 : " + (play = !play)); // flase
	}

}
