package study.chapter13.ex07;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		InteruptedExam th1 = new InteruptedExam();
		th1.start();
		
		System.out.println("th1.interrupted() : " + th1.interrupted());
		String input = JOptionPane.showInputDialog("값을 입력하세요.");
		System.out.println("입력 값은 " + input + "입니다.");
		th1.interrupt(); 	//false --> true
//		System.out.println(th1.isInterrupted());
//		System.out.println(th1.interrupted());
	}
		
}

