package study.chapter4;

public class BreakExam02 {

	public static void main(String[] args) {
//		int i = 0;
//		int sum = 0;
//		
//		while(true) {
//			sum += i; 
//			if(sum > 100) { //sum이 100보다 크면 break;
//				System.out.println(sum + " " + i);
//				break;
//			}
//			i++;
//		}
		
//		for(char upper='A'; upper <= 'Z'; upper++) {
//			for(char lower='a'; lower <= 'z'; lower++) {
//				System.out.println(upper + "-" + lower);
//				if(lower == 'g') {
//					break; //내부 for문만 종료됨. 외부 for 문은 종료 X  
//					// 외부 for문도 종료하고 싶을 땐?
//				}
//			}
//			System.out.println();
//		}
		
		 outter : for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break outter; //해당 이름을 가진 for문 종료한다.  
				}
			}
			System.out.println();
		}

	}

}
