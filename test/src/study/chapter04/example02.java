package study.chapter4;

public class example02 {

	public static void main(String[] args) {
//		int age = 20;
//		
//		if(age >= 18) {
//			System.out.println("성인");
//		} else { 
//			System.out.println("미성년자");
//		}
//		
//		int score = 80;
//		if (score >= 60) {
//			System.out.println("점수 60점 이상. 합격");
//		} else {
//			System.out.println("점수 60점 미만. 불합격");
//		}
		
//		int a = 10;
//		if(a > 10 + 5) { //비교 보다 산술이 먼저 실행 
//			System.out.println("10보다 크다.");
//		} else {
//			System.out.println("10보다 작다.");
//		}
//		
//		boolean result = a > 10? true: false;
		
//		int age = 35;
//		if(age <= 7) {
//			System.out.println("미취학");
//		} else if (age <= 13) {
//			System.out.println("초등");
//		} else if (age<=16) {
//			System.out.println("중학");
//		} else if (age <= 19) {
//			System.out.println("고등");
//		} else {
//			System.out.println("성인");
//		}
		
		
		
//		int score = 0;
//		if(score < 0 || score > 100) {
//			System.out.println("잘못된 점수입니다.");
//		} else if(score < 60) {
//			System.out.println("당신의 점수는 " + score + "점이고 학점은 F입니다.");
//		} else if (score < 70) {
//			System.out.println("당신의 점수는 " + score + "점이고 학점은 D입니다.");
//		} else if (score < 80) {
//			System.out.println("당신의 점수는 " + score + "점이고 학점은 C입니다.");
//		} else if (score < 90) {
//			System.out.println("당신의 점수는 " + score + "점이고 학점은 B입니다.");
//		} else if (score <= 100) {
//			System.out.println("당신의 점수는 " + score + "점이고 학점은 A입니다.");
//		} 		
		
		
		int age = 38;
		int money = 0;
			
		if(age <= 7) {
			System.out.println("미취학 아동입니다.(0살 ~ 7살)");
		} else if (age <= 13) {
			System.out.println("초등학생입니다. (8살 ~ 13살)");
			money = 1000;
		} else if (age<=16) {
			System.out.println("중학생입니다. (14살 ~ 16살)");
			money = 3000;
		} else if (age <= 19) {
			System.out.println("고등학생입니다. (17살 ~ 19살)");
			money = 5000;
		} else {
			System.out.println("성인입니다.");
			money = 10000;
		}	
		System.out.println("입장료는 " + money + "원입니다.");
		
	
	}
}
			