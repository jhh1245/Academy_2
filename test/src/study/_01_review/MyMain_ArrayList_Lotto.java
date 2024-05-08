package study._01_review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyMain_ArrayList_Lotto {

	public static void main(String[] args) {
		// 중복 체크 할 필요 없다. 
		List<Integer> lottoList = new ArrayList<Integer>(); 

		for(int i = 1; i <= 45; i++) {
			lottoList.add(i); 
		}
		
		// 0 1 2 3 4 ... 44 (index)
		// 1 2 3 4 5 ... 45 (num, lottoList) 
		// index 가 3일 땐 4 값을 빼온다. 
		
		List<Integer> winList = new ArrayList<Integer>(); 
		Random random = new Random();
		
		for(int i = 0; i < 6; i++) {
			// 추첨 
			int size = lottoList.size(); // 뽑은 건 삭제했으니까. 총 사이즈를 구한다. 
			int index = random.nextInt(size); // lottoList에서 가져올 때 사용할 인덱스  
			
			// 추첨된 번호 
			int num = lottoList.get(index); // lottoList에서 index로 가져온 값! 
			winList.add(num); 

			// 추첨번호 삭제
			lottoList.remove(index); // 뽑은 번호는 삭제한다. 
		}
		System.out.println(winList);
		Collections.sort(winList);
		System.out.println(winList);
	}

}
