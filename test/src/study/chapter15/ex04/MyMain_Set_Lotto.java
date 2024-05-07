package study.chapter15.ex04;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MyMain_Set_Lotto {

	public static void main(String[] args) {
		Set<Integer> lottoSet = new TreeSet<Integer>(); 
		// 정렬 되어서 추출된다. 저장 순서는 의미가 없다.
		
		int count = 6;
		
		while(count > 0) {			
			
			// 난수 관리 객체 
			Random random = new Random();
			int num = random.nextInt(45) + 1; 
			// 0 ~ 9 사이 10가지 경우의 수
			// nextInt(n) : 0 ~ (n-1)까지 범위 
			System.out.println(num);
			if(lottoSet.add(num) == false) { // false 값 = 중복되어 안 들어 갔다.
				continue;
			}
			
			
			count--;
		}
		
		System.out.println(lottoSet); // 출력 방법 
	}

}
