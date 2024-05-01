package study.chapter11.ex05;

import java.text.MessageFormat;
import java.util.Scanner;

public class MsgFormatExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요. : ");
		String id = sc.nextLine();
		System.out.println("회원이름을 입력하세요. : ");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요. : ");
		String tel = sc.nextLine();
		
		System.out.println("ID : " + id + "\n회원이름 : " + name + "\n회원 전화 : " + tel);
		
		String mem = "회원 ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		String result = MessageFormat.format(mem, id, name, tel);
		System.out.println(result);
	}

}
