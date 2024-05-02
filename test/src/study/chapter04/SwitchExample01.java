package study.chapter04;

public class SwitchExample01 {

	public static void main(String[] args) {
//		int a = 30;
//		
//		switch(a) {
//			case 10:
//				System.out.println(a + "점");
//				break;
//			case 20:
//				System.out.println(a + "점");
//				break;
//			case 30:
//				System.out.println(a + "점");
//				break;
//			default:
//				System.out.println(a + "점");
//		}

//		int num = (int)(Math.random() * 6) + 1;
//		
//		switch(num) {
//		case 1:
//			System.out.println("주사위 값 : " + num);
//			break;
//		case 2:
//			System.out.println("주사위 값 : " + num);
//			break;
//		case 3:
//			System.out.println("주사위 값 : " + num);
//			break;
//		case 4:
//			System.out.println("주사위 값 : " + num);
//			break;
//		case 5:
//			System.out.println("주사위 값 : " + num);
//			break;
//		case 6:
//			System.out.println("주사위 값 : " + num);
//			break;
//		}
		
//		char grade = 'a';
//		switch(grade) {
//		case 'A':
//		case 'a':
//			System.out.println("우수 회원입니다.");
//			break;    
//		case 'B':
//		case 'b':
//			System.out.println("일반 회원입니다.");
//			break;
//		default:
//			System.out.println("손님입니다.");
//		}
		
		
//		String position = "과장";
//		switch(position) {
//		case "부장":
//			System.out.println("월급 800만원");
//			break;
//		case "과장":
//			System.out.println("월급 600만원");
//			break;
//		case "대리":
//			System.out.println("월급 400만원");
//			break;
//		default:
//			System.out.println("월급 300만원");
//			break;
//			
//		}
		
		int score = 99;
		char grade =' ';
		
		switch(score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("당신의 점수는 " + score + "점이고 학점은 " + grade + "입니다.");
		
	}

}
