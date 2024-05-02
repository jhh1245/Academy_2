package study.chapter05;

public class ArrayExam01 {

	public static void main(String[] args) {
//		int[] intArray = {89, 78, 90, 84, 71};
//		System.out.println("intArray[0] = " + intArray[0]);
//		System.out.println("intArray[1] = " + intArray[1]);
//		System.out.println("intArray[2] = " + intArray[2]);
//		System.out.println("intArray[3] = " + intArray[3]);
//		System.out.println("intArray[4] = " + intArray[4]);
//
//		int sum = 0;
//		
//		for(int i = 0; i < intArray.length; i++) { //i 는 카운트 변수라고 한다. 
//			System.out.println(i + "번째 값 : " + intArray[i]);
//			sum += intArray[i];
//		}
//		
//		double avg = sum / 5.0;
//		
//		System.out.println("총 합 : " + sum);
//		System.out.println("평 균 : " + avg);
		
		int[] arr1 = new int[3];
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}	
		
		
		String[] arr3 = new String[3];
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]); // null
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}	
	}
}
