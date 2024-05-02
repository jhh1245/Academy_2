package study.chapter06.Object;

public class KoreanMain {

	public static void main(String[] args) {
		Korean kor1 = new Korean("홍길동", "240419-3021547");
		System.out.println(kor1.nation);
		System.out.println(kor1.name);
		System.out.println(kor1.ssn);
		
		Korean kor2 = new Korean("김자바", "240419-2043547");
		System.out.println(kor2.nation);
		System.out.println(kor2.name);
		System.out.println(kor2.ssn);
		

	}

}
