package study.chapter11.ex00;

import java.util.Scanner;

public class LengthExam {
	Scanner sc = new Scanner(System.in);
	private String ssn1;
	private String ssn2; 
	
	public void ssnInput() {
		System.out.print("주민번호 앞자리 입력(6자리) : ");
		ssn1 = sc.nextLine();
		System.out.print("주민번호 뒷자리 입력(7자리) : ");
		ssn2 = sc.nextLine();
		
		String ssn = ssn1+"-"+ssn2;
		
		
		if(ssn1.length() != 6 || ssn2.length() != 7 ) {
			System.out.println("주민번호 앞자리 혹은 뒷자리를 잘못입력하셨습니다." );
		} else {
			System.out.println("당신의 주민등록 번호는 "+ ssn + "입니다.");
			if(ssn2.indexOf("1") == 0 || ssn2.indexOf("3") == 0) { 	// if(ssn.indexOf("-1") == 6 || ssn.indexOf("-3") == 6) { 
				System.out.println("남자입니다.");
			} else if(ssn2.indexOf("2") == 0 || ssn2.indexOf("4") == 0)  { 
				System.out.println("여자입니다.");
			} else { 
				System.out.println("잘못입력하셨습니다.");
			}
		}
		 
	}
}


