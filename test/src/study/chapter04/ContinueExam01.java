package study.chapter04;

public class ContinueExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		
//		while(i <= 5) {
//			if (i == 3) { //3제외하고 출력 
//				i++;
//				continue;
//			} 
//			System.out.println(i);
//			i++;
//		}
		
		// 2 
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) { //홀수만 출력 
				continue;
			}
			System.out.println(i);
		}
	}

}
