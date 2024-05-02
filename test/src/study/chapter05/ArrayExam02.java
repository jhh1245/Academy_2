package study.chapter05;

import java.util.Scanner;

public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("=============================");
//		int[] arr2 = new int[10];
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = 10 - i;
//			System.out.println(arr2[i]);	
//		}
		
		// 난수 10개 찍기
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			arr[i] = (int)(Math.random() * 10) + 1;
//			System.out.println(arr[i]);
//		}

		
		
		
		// 입력한 만큼 배열 생성 
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("생성할 배열 길이 입력 : ");
//		int num = scanner.nextInt();
//		int arr[] = new int[num];
//		
//		for(int i = 0; i < num; i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
		
		
		
		
		
		// 10개 난수 발생, 그 중에서 최대값과 최솟값 구하기 
		
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			arr[i] = (int)(Math.random() * 10) + 1;
//			System.out.println(arr[i]);
//		}
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i = 1 ; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			} 
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println(max + "값이 가장 큽니다.");
//		System.out.println(min + "값이 가장 작습니다.");
		
		
		
		
		// 10개의 난수, 중복 안되게 하기 
		
//		int[] arr = new int[10];
//		
//		
//		int random = (int)(Math.random() * 10) + 1; 
//		arr[0] = random;
//		boolean jong = false;
		
//		//첫번째 방법 
//		
//		for(int i = 1; i < 10; i++) {
//			random = (int)(Math.random() * 10) + 1;
//			//System.out.println(random);
//			for(int j = 0; j < i; j++) {				
//				if(random == arr[j]) jong = true;
//			}
//			
//			if(jong == true) {
//				i--;
//			}
//			else {
//				arr[i] = random;
//			}
//			jong = false;
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		
		
		
		
		// 내가 생각한 두번째 방법
//		int[] arr = new int[10];
//	
//		int random = (int)(Math.random() * 10) + 1; 
//		arr[0] = random;
//		
//		int jong = 0;
//			 
//		for(int i = 1; i < 10; i++) {
//			while(jong == 0) {  
//				random = (int)(Math.random() * 10) + 1;
//				
//				for(int j = 0; j < i; j++) {				
//					if(random == arr[j]) { //중복이 발생하면
//						jong = 0; //for문 빠져나와라
//						break;
//					} else { //중복 아니면
//						jong = 1;  
//					}
//				}
//				
//				//중복이면 그대로 while로 -> jong = 0
//				//중복 아니면 while을 빠져나옴 jong = 1 
//			}
//			
//			//빠져나온경우는 중복이 없단 소리 
//			arr[i] = random;
//			jong = 0;
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		// 내가 생각한 세번째 방법 
		int[] arr = new int[10];
		
		int random = (int)(Math.random() * 10) + 1; 
		arr[0] = random;
		
		int jong = 0;
			 
		for(int i = 1; i < 10; i++) {
			while(jong == 0) {  
				random = (int)(Math.random() * 10) + 1;
				
				for(int j = 0; j < i; j++) {				
					if(random == arr[j]) { //중복이 발생하면
						jong = 0; //for문 빠져나와라
						break;
					} 
					if(random != arr[j] && j == i-1){ //중복 아니면서 j가 i-1값인 => 즉, 다 돌았으면 
						arr[i] = random; // 구한 랜덤값을 i번째에 넣는다. 
						jong = 1;   //while을 돌지 않기 위해서 값 변경 
					}
				}
				
				//중복이면 그대로 while로 -> jong = 0
				//중복 아니면 while을 빠져나옴 jong = 1 
			}
			
			//빠져나온경우는 중복이 없단 소리 
			jong = 0;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
		
//			while(is == false) {
//				
//				for(int j = 0; j < i; j++) { // 0부터 i까지 랜덤값과 배열에 있는 값을 비교 
//					if(random == arr[j]) { // 같으면 다시 랜덤 
//						is = false;
//					} else {
//						is = true; //중복안되었을 때 
//					}
//				}
//				arr[i] = random;
//				is = false;
//				break;
	//		}
		//	System.out.println(arr[i]);
	//	}
		
		
		// 선생님 코드 
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}

	}
}


