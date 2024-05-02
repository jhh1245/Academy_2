package study.chapter13.ex04;

import javax.swing.JOptionPane;


public class InputOutputBlocking {
	public static void main(String[] args) {
		InputExam th1 = new InputExam();
		
		th1.start();
		
		String input = JOptionPane.showInputDialog("아이디를 입력하세요");
		System.out.println("입력하신 아이디 : " + input);
		
		
		
	}
}
