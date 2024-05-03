package study.chapter14.ex02;

public class BoxMain <T>{ 
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setGeneric("안녕");
		
		String str = box.getGeneric();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setGeneric(100); 
		// 객체에 값을 넣을 수 없다. 100을 Integer로 바꿔서 저장했다. (자동 박싱!!)
		int num = box2.getGeneric();
		System.out.println(num);
		
		Box box3 = new Box(); // 타입을 지정하지 않으면 Object 
		box3.setGeneric("문자열");
		String str2 = (String)box3.getGeneric(); 
		// box3.getGeneric()는 Object 타입임으로 
		System.out.println(str2);
		
		box3.setGeneric(100);
		int number = (int) box3.getGeneric();
		
	}
}
