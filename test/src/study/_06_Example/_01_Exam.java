package study._06_Example;

import java.util.Scanner;

public class _01_Exam {
	public static void main(String[] args) {
		// 1. 반지름 입력
		
		// 2. 부가 정보 구함 
		// 원 둘레 = 2 * 파이 * 반지름 
		// 원 면적 = 반지름 * 반지름 * 파이 
		// 구  부피 = 4/3 * 파이 * 반지름 ^3 
		
		Scanner sc = new Scanner(System.in);
		
		double radius;
		double circle_length;
		double circle_square;
		double circle_volume;
		
		System.out.print("반지름 : ");
		radius = sc.nextDouble();
		
		circle_length = radius * 2 * Math.PI;
		circle_square = radius * radius * Math.PI;
		circle_volume = 4/3. * Math.PI * Math.pow(radius, 3);
		
		System.out.printf("원둘레 : %.2f(cm)\n", circle_length);
		System.out.printf("원면적 : %.2f(㎠)\n", circle_square);
		System.out.printf("구부피 : %.2f(㎤)\n", circle_volume);
		
		
//		System.out.println("값"); // line next 
//		System.out.print("값");
//		System.out.printf("서식", "값");
		// %d : 정수, %f : 실수, %c : 문자, %s : 문자열, %b : boolean
	}
}
