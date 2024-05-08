package study._02_awt;

import javax.swing.JFrame;

// awt (Abstract Window Toolkit) package
// Frame       <- awt 
// L JFrame    <- swing (성능 개선) 
// 그 외에 java FX 도 있다. 

public class WinExam extends JFrame { // F4키 

	public WinExam() { // 생성자 = 초기화 
		super("첫번째 윈도우"); // ctrl키 + 클릭 => JFrame("title"); 생성자  
		
		// MyWin 클래스에는 기능이 없다. 부모의 기능을 갖다쓴다.
		
		// 위치 지정 
		super.setLocation(300, 300); // x, y
		
		// 창 사이즈 
		super.setSize(500, 500); // w, h
		
		// 보여줘라 
		super.setVisible(true);
		
		// 종료 
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// close 버튼 눌리면 프로그램 종료될 것이다. 
	

	}
	public static void main(String[] args) {
		new WinExam();

	}

}
