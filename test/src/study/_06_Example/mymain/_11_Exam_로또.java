package study._06_Example.mymain;

import java.util.Scanner;

import study._06_Example.util.Lotto;

public class _11_Exam_로또 {
	public static void main(String[] args) {
		//번호 입력받고 몇등인지 출력한다. 
		Scanner scanner = new Scanner(System.in);
		int user_no[] = new int[6];
		String yn = "y";
		
		Lotto lotto = new Lotto();
		lotto.makeWinNo();
		
		while(true) {
			
			System.out.println("로또번호 6자리 입력");
			user_no[0] = scanner.nextInt();
			user_no[1] = scanner.nextInt();
			user_no[2] = scanner.nextInt();
			user_no[3] = scanner.nextInt();
			user_no[4] = scanner.nextInt();
			user_no[5] = scanner.nextInt();

			// 1. 로또 처리 객체에게 user_no를 넘긴다. 
			lotto.setUser_no(user_no);
			
			// 2. 검증 요청 (중복, 최대값 체크)
			if(lotto.isVaildation() == false) {
				System.out.println("입력 번호가 유효하지 않습니다. ");
				continue;
			} 
			// 3. 등수 체크 
			lotto.checkRank();
			
			// 4. 출력 
			lotto.display();
			
			System.out.print("계속 여부 (y/n) : ");
			yn = scanner.next();
			if(!yn.equalsIgnoreCase("y")) break;
			
		} // end : while 
		
	}
}
