package study._06_Example;

import java.util.Scanner;

public class _03_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Q. 키보드로부터 키, 몸무게 입력 받아서 BMI (체질량지수) 구하기 
		// 체질량지수는 자신의 몸무게(kg)를 키의 제곱(m)으로 나눈 값
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * 0.01 * height * 0.01); 
		// 연산 우선순위 중요하다! 
		// ()가 없으면 앞에서부터 계산한다. 
		
		String result = "";
		System.out.printf("BMI 수치 : %.2f\n", bmi);
		if(bmi >= 0.0 && bmi < 18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi < 23.0) {
			result = "정상";
		} else if (bmi > 23.0 && bmi < 25.0) { 
			result = "과체중";
		} else if (bmi >= 25.0) {
			result = "비만";
		} 
		System.out.printf("상태 : %s", result);
		
	}

}
