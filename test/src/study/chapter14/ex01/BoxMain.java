package study.chapter14.ex01;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box(); 
		box.set("문자열저장");
		
		String str = (String)box.get(); // 강제형변환
		System.out.println(str);
		
		Object obj = box.get();
		//String str2 = obj; // 자식은 부모를 담을 수 없다. 
		String str2 = (String)obj;
		
		Car car = new Car();
		box.set(car); // 
	}

}
