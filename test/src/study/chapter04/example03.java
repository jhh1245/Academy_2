package study.chapter04;

public class example03 {

	public static void main(String[] args) {
		//int num = Math.random(); //에러나는 이유는 형변환이 필요해서 double -> int로
		
		//int num = (int)(Math.random() * 6) + 1;  // 1 ~ 6 : (int)(Math.random() * 6) + 1
		
		int score = (int)(Math.random() * 21) + 80; // 80 ~ 100 : (int)(Math.random() * 21) + 80
		String grade = "당신의 학점 : ";
		
		System.out.println(score + "이 나왔습니다.");
		
		if(score >= 90) {
			if(score >= 95) {
				grade += "A+";
			} else {
				grade += "A";
			}
		} else {
			if(score >= 85) {
				grade += "B+";  
			} else { 
				grade += "B";
			}
		}
		System.out.println(grade);

	}

}
