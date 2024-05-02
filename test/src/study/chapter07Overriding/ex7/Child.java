package study.chapter07Overriding.ex7;

public class Child extends Parent{

	int z; 
	
	@Override
	String setNumber() {
		String result = "x = " + x + " y = " + y + " z = " + z; 
		return result;
	}

}
