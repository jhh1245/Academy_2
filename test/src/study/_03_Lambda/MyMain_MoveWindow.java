package study._03_Lambda;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_MoveWindow extends JFrame {

	// 1번째 줄 
	JButton jbt_lt;
	JButton jbt_ct;
	JButton jbt_rt;
	
	// 2번째 줄 
	JButton jbt_lc;
	JButton jbt_cc;
	JButton jbt_rc;
	
	// 3번째 줄 
	JButton jbt_lb;
	JButton jbt_cb;
	JButton jbt_rb;
	
	
	
	public MyMain_MoveWindow() {
		super("윈도우 움직이기");

		GridLayout gl = new GridLayout(3,3); // 3 * 3
		this.setLayout(gl);
		
		jbt_lt = new JButton("↖");
		jbt_ct = new JButton("↑");
		jbt_rt = new JButton("↗");
		jbt_lc = new JButton("←");
		jbt_cc = new JButton("♥");
		jbt_rc = new JButton("→");
		jbt_lb = new JButton("↙");
		jbt_cb = new JButton("↓");
		jbt_rb = new JButton("↘");
		
		
		this.add(jbt_lt);
		this.add(jbt_ct);
		this.add(jbt_rt);
		
		this.add(jbt_lc);
		this.add(jbt_cc);
		this.add(jbt_rc);
		
		this.add(jbt_lb);
		this.add(jbt_cb);
		this.add(jbt_rb);
		
		// 각 버튼 클릭시 
		jbt_lt.addActionListener((e) -> on_button_lt());
		jbt_ct.addActionListener((e) -> on_button_ct());
		jbt_rt.addActionListener((e) -> on_button_rt());
		
		jbt_rc.addActionListener((e) -> on_button_rc());
		jbt_cc.addActionListener((e) -> on_button_cc());
		jbt_lc.addActionListener((e) -> on_button_lc());
		
		jbt_lb.addActionListener((e) -> on_button_lb());
		jbt_cb.addActionListener((e) -> on_button_cb());
		jbt_rb.addActionListener((e) -> on_button_rb());
		
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

	private void on_button_lt() {
		Point pt = this.getLocation();

		pt.x = pt.x - 30;
		pt.y = pt.y - 30;

		this.setLocation(pt);
	}
	
	private void on_button_ct() {
		Point pt = this.getLocation();

		pt.y = pt.y - 30;

		this.setLocation(pt);
	}
	
	private void on_button_rt() {
		Point pt = this.getLocation();

		pt.x = pt.x + 30;
		pt.y = pt.y - 30;

		this.setLocation(pt);
	}
	
	private void on_button_lc() {
		Point pt = this.getLocation();

		pt.x = pt.x - 30; 

		this.setLocation(pt);
	}
	
	private void on_button_cc() {
		//setLocationRelativeTo(null);
		
		// 프레임(자바 화면) 크기
		Dimension frameSize = this.getSize();
		
		// 모니터 크기
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		// (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
		// (모니터화면 가로 / 2) - (프레임화면 가로 / 2), (모니터화면 세로 / 2) - (프레임화면 세로 / 2)
		// 두 식은 똑같다. 
		//this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		
		this.setLocation((screenSize.width / 2 - frameSize.width / 2), (screenSize.height / 2 - frameSize.height / 2));
		
	}
	
	
	private void on_button_rc() {
		// 현재 위치 구하기 
		Point pt = this.getLocation();
		
		// 이동시킬 좌표값 수정
		pt.x = pt.x + 30; 
		// 좌표 값만 더했다. 아직 실제 이동시키진 않았다.
		
		// 좌표 이동
		this.setLocation(pt);
	}
	
	private void on_button_lb() {
		Point pt = this.getLocation();

		pt.x = pt.x - 30;
		pt.y = pt.y + 30;

		this.setLocation(pt);
	}
	
	private void on_button_cb() {
		Point pt = this.getLocation();

		pt.y = pt.y + 30;

		this.setLocation(pt);
	}
	
	private void on_button_rb() {
		Point pt = this.getLocation();

		pt.x = pt.x + 30;
		pt.y = pt.y + 30;

		this.setLocation(pt);
	}

	// 내가 한 방법 
	private void on_button(String position){
		Point pt = this.getLocation();

		 switch(position){
		 case "lt":
			 pt.x = pt.x - 30;
			 pt.y = pt.y - 30;
			 break;
		
		 }
		 this.setLocation(pt);
	}
	
	public static void main(String[] args) {
		new MyMain_MoveWindow();

	}

	
	 
}

