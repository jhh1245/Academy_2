package study._06_Example;

import java.util.Scanner;

public class _04_Exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String jumin_no;
		String yn = "y";
		_04_Jumin jumin = new _04_Jumin();
		while(true) {
			
			System.out.print("주민번호 (xxxxxx-xxxxxxx) : ");
			jumin_no = sc.nextLine();
			
			// 주민번호 객체에게 주민번호 전달
			jumin.setJumin_no(jumin_no);
			
			
			int year = jumin.getYear();
			int age = jumin.getAge();
			String tti = jumin.getTti();
			String season = jumin.getSeason();
			String local = jumin.getLocal();
			String ganji = jumin.getGanji();
			
			// 부가정보(출생년도, 나이, 띠, 성별) 추출 
			System.out.println("---[결과]---");
			System.out.printf("출생년도 : %d\n", year);
			System.out.printf("나이 : %d\n", age);
			System.out.printf("띠 : %s\n", tti);
			System.out.printf("계절 : %s\n", season);
			System.out.printf("지역 : %s\n", local);
			System.out.printf("간지 : %s\n", ganji);
			
			// 계속 여부 
			System.out.println("계속 (y/n) : ");
			yn = sc.nextLine();
			
			// y가 아니면 탈출 
			if(yn.equals("y") == false) 
				break;
			
		} // end : while
	} 

}
