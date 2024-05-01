package study.chapter11.ex00;

import java.util.Scanner;

public class SsnTest {


	Scanner sc = new Scanner(System.in);
	private String ssn1;
	private String ssn2;
	
//	public void ssnInput() {
//		System.out.println("주민등록 앞자리 6자리를 입력 : ");
//		String temp1 = sc.nextLine();
//		if(temp1.length() == 6) {
//			this.ssn1 = temp1;
//		} else {
//			System.out.println("앞자리를 잘못입력하셨습니다.");
//			ssnInput();
//		}
//		
//	
//		System.out.println("주민등록 뒷자리 7자리를 입력 : ");
//		String temp2 = sc.nextLine();
//		if(temp2.length() == 7) {
//			this.ssn2 = temp2;
//			if(ssn2.indexOf("1") == 0 || ssn2.indexOf("3") == 0) { 	// if(ssn.indexOf("-1") == 6 || ssn.indexOf("-3") == 6) { 
//				System.out.println("남자입니다.");
//			} else if(ssn2.indexOf("2") == 0 || ssn2.indexOf("4") == 0)  { 
//				System.out.println("여자입니다.");
//			} else { 
//				System.out.println("잘못입력하셨습니다.");
//			}
//			
//		} else {
//			System.out.println("뒷자리를 잘못입력하셨습니다.");
//			ssnInput();
//		}
//	}

	
	public void ssnInput() {
		boolean check = false, check2 = false;
	
		while(check == false) {
			System.out.println("주민등록 앞자리 6자리를 입력 : ");
			String temp1 = sc.nextLine();
			if(temp1.length() == 6) {
				this.ssn1 = temp1;
			} else {
				System.out.println("앞자리를 잘못입력하셨습니다.");
				continue;
			}
			
		
			while(check2 == false) {
				System.out.println("주민등록 뒷자리 7자리를 입력 : ");
				String temp2 = sc.nextLine();
				if(temp2.length() == 7) {
					this.ssn2 = temp2;
					if(ssn2.indexOf("1") == 0 || ssn2.indexOf("3") == 0) { 	// if(ssn.indexOf("-1") == 6 || ssn.indexOf("-3") == 6) { 
						System.out.println("남자입니다.");
						check = true;
						check2 = true;
					} else if(ssn2.indexOf("2") == 0 || ssn2.indexOf("4") == 0)  { 
						System.out.println("여자입니다.");
						check = true;
						check2 = true;
					} else { 
						System.out.println("잘못입력하셨습니다.");
					}
					
				} else {
					System.out.println("뒷자리를 잘못입력하셨습니다.");
				}
			}
		}
	}
}

