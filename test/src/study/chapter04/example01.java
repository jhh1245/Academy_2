package study.chapter04;

public class example01 {

	public static void main(String[] args) {
		
//		int a = 10;
//		
//		if(a > 10) {
//			System.out.println("10보다 큼");
//		}
//		System.out.println("종료");
		
		int score = 93;
		if(score > 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("학점은 A입니다.");
		}
		if(score < 90)
			System.out.println("점수가 90미만입니다.");
			System.out.println("학점은 B입니다."); 
			//B입니다도 같이 출력되니까 if문에 한줄이어도 코드블럭 {}을 생략하지 말자 
	
	}

}
