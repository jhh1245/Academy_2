package study.chapter5;

import java.util.Scanner;

public class ArrayExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"양념치킨", "순살치킨", "떡볶이", "샐러드", "샌드위치"};
		int delivery = 0;
		
		while(delivery == 0) {
			System.out.println("메뉴 : \"양념치킨\", \"순살치킨\", \"떡볶이\", \"샐러드\", \"샌드위치\"");
			System.out.println("주문할 메뉴 입력 : ");
			String menu = sc.nextLine();
			
			for(int i = 0; i < arr.length; i++) {
				if(menu.equals(arr[i])) {
					System.out.println(menu + "가 주문되었습니다.");
					delivery += 1;
					break;
				}
				
			}
			if(delivery == 0) {
				System.out.println("다시입력해주세요.");
			}
			
		}
		
		

	}

}
