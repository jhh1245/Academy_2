package study._02_awt;


import javax.swing.JFrame;

public class WinExamTwo extends JFrame {

	public WinExamTwo() {
		super("title");

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
		new WinExamTwo();

	}

}
