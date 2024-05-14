package study._06_Example;

import java.util.Scanner;

import study._06_Example.util.MaBangJin;

public class _08_Exam_이차원배열_마방진 {

	public static void main(String[] args) {
		
		// 대각선 이동 = [row-1][col+1]
		
		// 위에가 없으면 해당 줄 맨 아래 if(0 > row) -> row = row.length-1 -> [row][col]
		// 맨 우측 대각선 없으면 맨 좌측으로 [대각선이동]한게 -> if(col > col.length-1) ->[row-1][0]  
		// 이미 채워져 있으면 해당 자리 바로 아래에 [대각선이동]한게 값이 있으면 -> [row+1][col]  
		// 
		// 시작위치는 map[row][col] = 1; row = 0, col = row/2
		
		Scanner scanner = new Scanner(System.in);
		int chasu;
		String yn = "y";
		MaBangJin ma = new MaBangJin();
		
		while(true) {
			System.out.println("차수(홀수) : ");
			chasu = scanner.nextInt();
			
			if(chasu% 2 == 0) {
				System.out.println("홀수만 입력해주세요.");
				continue;
			}
			
			ma.setChasu(chasu);  // 차수 세팅 
			
			ma.make_mabangjin(); // 마방진 만들기 
			
			ma.show_mabangjin(); // 마방진 출력 
			
			// 계속 유무
			System.out.print("계속 (y/n) : ");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) { // y나 Y가 아니면 break 
				break;
			}
		}
		
		

	}

}
