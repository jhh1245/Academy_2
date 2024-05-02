package study.chapter4;

public class BreakExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) { // 무한 반복
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			
			if(num == 6) {
				break;					
			}
		}
		
		System.out.println("종료");

	}

}
