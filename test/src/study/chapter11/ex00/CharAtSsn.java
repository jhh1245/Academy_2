package study.chapter11.ex00;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CharAtSsn {

	Scanner sc = new Scanner(System.in);
	
	private String ssn; 
	
	// 생성자 
	
	
	// 메서드 
	public void ssnInput() {
//		System.out.print("주민등록 번호를 입력하세요(xxxxxx-xxxxxxx) : ");
//		String ssn = sc.nextLine();
//		this.ssn = ssn;
//		System.out.println("입력한 주민등록 번호는 : " + ssn );
//		
//		char ch = this.ssn.charAt(7);
//		//System.out.println(ch);
//		
//		if(ch == '1' ||ch == '3' ) {
//			System.out.println("남자입니다.");
//		} else if(ch == '2' ||ch == '4' ) {
//			System.out.println("여자입니다.");
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		String ssn = JOptionPane.showInputDialog("주민등록번호입력");
		this.ssn = ssn;
		char ch = this.ssn.charAt(7);
		
		if(ch == '1' ||ch == '3' ) {
			System.out.println("남자입니다.");
		} else if(ch == '2' ||ch == '4' ) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
