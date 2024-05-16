package study._06_Example.util;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	int [] user_no; // new 할 필요 없다. 참조변수만 필요 
	int [] win_no = new int[7]; // 보너스 번호 
	
	Random random = new Random();
	int rank = 0;  // 등수 
	int count = 0; //맞은 갯수
	boolean isBonus = false;
	
	public int[] getUser_no() {             
		return user_no;                     
	}                                       
	public void setUser_no(int[] user_no) { 
		this.user_no = user_no;     
		Arrays.sort(user_no);
	} 
	
	public void makeWinNo() {
		int n = 0;
		OUT_WHILE: // lable 달기 
		while(n < 7) {
			int su = random.nextInt(45) + 1; // 1 ~ 45
			
			// 현재 발생된 수 su가 이전에 있는지?
			// 방법 1 
//			boolean bSame = false; // boolean형 			
//			for(int k = 0; k < i; k++) {	
//				if(win_no[k] == su) {
//					bSame = true;
//					break;  
//				}
//				
//			}
//			if(bSame) continue; // 같은 수가 있으면 다시 while
			
			// 방법 2 
			for(int k = 0; k < n; k++) {	
				if(win_no[k] == su) {
					continue OUT_WHILE;
				}
			}
	
			win_no[n] = su;
			n++;
		}
		
		// 마지막 번호 제외하고 앞번호 6자리 오름차순 정렬 
		Arrays.sort(win_no, 0, 6);
		
		for(int wn : win_no) {
			System.out.print(wn + "   ");
		} System.out.println();
		
	} // end : makeWinNo()
	
	public boolean isVaildation() { // 유효성 체크 	
		// 유효범위 체크(1~45)
		for(int un : user_no) {
			if(un > 45 || un < 0) {
				System.out.println("범위 이상 ");
				return false;	
			} 
		}
		
		// 중복수 체크	
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j < 6; j++) {
				//System.out.println("i : " + i + " j : " + j);
				if(user_no[i] == user_no[j]) {
					System.out.println("중복 발생");
					return false; 
				}	
			}
		}
		return true;
	}	
	
	public void checkRank() {
		count = 0; // main에서 while로 계속 반복되기때문에 이 메소드 부를 때 마다 0으로 리셋 
		
		// user_no와 win_no 같은 수가 몇개인지? 
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				if(user_no[i] == win_no[j]) { // 유저번호랑 당첨번호랑 일치할 때 
					if(j == 6) { // 보너스 번호랑 일치할 때 
						isBonus = true;
					} else {
						count++;
					}
				}
			}
		}
		
		// 등수 체크 
		if(count <= 3) {
			System.out.println("꽝입니다.");
		} 
		switch (count){
		case 4:
			rank = 4;
			break;
		case 5: // 5개 맞은 경우 
			if(isBonus) rank = 2; //보너스 번호가 맞았으면 2등 
			else rank = 3;		  //아니면 3등 
			break;
		case 6:
			rank = 1;
			break;
		}
	}
	
	
	public void display() {
		System.out.print("==============================\n추첨 번호 : ");
		for(int i = 0; i < 7; i++) {
			if(i < 6) 
				System.out.printf("%3d", win_no[i]);
			else 
				System.out.printf(" (%d)", win_no[i]);
		}
		
		System.out.print("\n유저 번호 : ");
		for(int un : user_no) {
			System.out.printf("%3d", un);
		}
		
		System.out.printf("\n맞은 갯수 : %d(개)\n", count);
		System.out.printf("당첨 등수 : %d(등)\n==============================\n", rank);
	}

}
