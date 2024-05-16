package study._06_Example;

import java.util.Scanner;

import study._06_Example.util.MaBangJin;
import study._06_Example.util.Snail;

public class _09_Exam_이차원배열_달팽이 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int chasu;
		String yn = "y";
		Snail ma = new Snail();
		
		while(true) {
			System.out.println("차수 : ");
			chasu = scanner.nextInt();

			
			ma.setChasu(chasu);  // 차수 세팅 
			
			//ma.make_snail(); // 마방진 만들기
			ma.make_snail2();
			
			ma.show_snail(); // 마방진 출력 
			
			// 계속 유무
			System.out.print("계속 (y/n) : ");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) { // y나 Y가 아니면 break 
				break;
			}
		}
		
		

	}

}
