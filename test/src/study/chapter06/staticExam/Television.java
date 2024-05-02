package study.chapter06.staticExam;

public class Television {
	static String company = "samsung";
	static String model = "LCD";
	static String info; 
	static int from1To10Sum;
	
	static { 
		// this.company // this를 사용할 수 없다. this는 객체자기 자신을 의미하기 때문에!!
		
		info = company + "-" + model; //조건문, 반복문 등 자바기능 사용 가능
		int sum = 0; 
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		from1To10Sum = sum;
	}
}
