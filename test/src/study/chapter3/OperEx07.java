package study.chapter3;

public class OperEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2, 8, 16진수 만들기 */ 
		
		int num = 172;
		int m = 0;
		int n = 0;
		String str = "";
		while(num > 0) {
			m = num / 2; //몫
			n = num % 2; //나머지
			num = m;
			
//			System.out.println("num : " + num);
//			System.out.println("나머지!! : " + n);
//			System.out.println("몫 : " + m);
			str += n;
			System.out.println();
		}
		
		//System.out.println(str);
		
		//str 거꾸로 
		String reverse = "";
		String reverse2 = ""; //8진수 
		String reverse3 = ""; //16진수
		for (int i = str.length() - 1; i >= 0; i--) {            
			reverse = reverse + str.charAt(i);
			reverse2 = reverse2 + str.charAt(i);
			reverse3 = reverse3 + str.charAt(i);
			if(i % 3 == 0) {
				reverse2 += " ";
			}
			if(i % 4 == 0) {
				reverse3 += " ";
			}
		}
		
		System.out.println("2진수 : " + reverse);
		System.out.println("8진수 : " + reverse2);
		System.out.println("16진수 : " + reverse3);
		
		System.out.println(reverse2.length());
		
		int sum = 0;
		int cnt = 0;
		String str3 = "";
		for (int i = reverse2.length() - 1; i >= 0; i--) {  
			if(reverse2.charAt(i) != ' ') {
				if(cnt == 0 && reverse2.charAt(i) == '1') {
					sum += 1;
				}
				if(cnt == 1 && reverse2.charAt(i) == '1') {
					sum += 2;
				}
				if(cnt == 2  && reverse2.charAt(i) == '1') {
					sum += 4;
					
				}
				cnt++;
				
			}
			
			if(cnt == 3) {
				System.out.println("reverse2.charAt(i) : " + reverse2.charAt(i) + " i : " + i + " cnt : " + cnt + " sum : " + sum);
				//str3 +=sum;
				cnt = 0;
				sum = 0;
			}	
			
		}
		System.out.println(sum);
		
		
		
	}

}
