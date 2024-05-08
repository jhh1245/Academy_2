package study._02_awt;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent extends JFrame {

	JButton jbt_kor; // 참조 변수 
	JButton jbt_eng;
	JButton jbt_jpn;
	JButton jbt_chn;
	JButton jbt_ger;
	JButton jbt_fra;
	
	
	// Member 로써의 ! 내부 클래스
	// 이 안에선 ButtonEvent에서 정의한 모든걸 쓸 수 있다.
	class KorButtonEventObject implements ActionListener{ // 인터페이스를 구현 상속받음   
		// kor 버튼이 눌렸을 때 
		
		@Override
		public void actionPerformed(ActionEvent e) { 	 // 인터페이스 내 추상클래스 구현해야함 
			// System.out.println(e); // 이벤트에 관한 정보들 
			
			setTitle("한국어 : 안녕하세요!! ");
			// this.를 쓰면 KorButtonEventObject를 의미하기 때문에 쓰면 안됨 
			// 그냥 setTitle은 ButtonEvent -> JFrame -> JFrame 이 상속받은 부모.. 를 가르킨다.
			// 상속관계에서 자식에 없는 메소드는 부모들에서 찾기 때문에 
			
		}
		
	}
	
	public ButtonEvent() { // 생성자 
		super("나라별 인사말");
		
		GridLayout gl = new GridLayout(6, 1); // 6행, 1열
		this.setLayout(gl);
		
		// 버튼 생성 
		jbt_kor = new JButton("한국어 인사말");
		jbt_eng = new JButton("영어 인사말");
		jbt_jpn = new JButton("일본어 인사말");
		jbt_chn = new JButton("중국어 인사말");
		jbt_ger = new JButton("독일어 인사말");
		jbt_fra = new JButton("프랑스어 인사말");
		
		
		// 버튼 적재 
		this.add(jbt_kor);
		this.add(jbt_eng);
		this.add(jbt_jpn);
		this.add(jbt_chn);
		this.add(jbt_ger);
		this.add(jbt_fra);
		
		// 버튼 이벤트 등록 
		
		// 형식 => Event 발생시킨 컨트롤.addActionListener(처리객체)
		// ()안에 쓴 처리객체한테 넘긴다 = 위임
		// 이벤트 위임 모델 (Delegation Evet Model) 		
		
		// ### 이벤트 등록 1번째 방법 ---------------------   
		jbt_kor.addActionListener(new KorButtonEventObject());
		// 1. jbt_kor 버튼 클릭 
		// 2. KorButtonEventObject 객체에게 위임한다! 
		// 3. KorButtonEventObject 객체안에 actionPerformed() 메소드가 호출된다.
		
		
		// ### 이벤트 등록 2번째 방법 ---------------------
		// Local 내부 클래스 (메소드내에 선언된 클래스) 
		// 생성자 안에 만들어졌다 = 1번만 사용되는 객체이다. = 이름을 줄 필요 없다
		class EngButtonEventObject implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("영어 인사말 : Hello");
			}
		}
		
		jbt_eng.addActionListener(new EngButtonEventObject()) ;
		// 1. jbt_eng가 클릭되면 EngButtonEventObject 객체에게 위임한다. 
		// 2. EngButtonEventObject 객체 안 actionPerformed() 메소드가 호출된다. 
		
		
		// ### 이벤트 등록 3번째 방법 ---------------------
		// 인터페이스, 추상클래스는 객체 생성과 동시에 재정의 하면, 익명객체가 생성된다! 
		// 이름없는 클래스지만 객체이다. 
		ActionListener jpn_ActionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("일본어 : 오겡끼데스까");
				
			}
		}; 
		
		jbt_jpn.addActionListener(jpn_ActionListener);
		

		// ### 이벤트 등록 4번째 방법 ---------------------
		// 참조 변수도 아깝다. 생략한다! 바로 익명객체 생성한다!
		// jbt_chn눌리면  (new ActionListener() {  ..... }); 객체에게 위임한다.  
		jbt_chn.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("중국어 : 니하오");
				
			}
		});
		
		// ### 이벤트 등록 5번째 방법 ---------------------
		// 람다식 jdk 8.0 later 
		jbt_ger.addActionListener((ActionEvent e) -> { 
			setTitle("독일어 : 구텐탁");
		});
		
		// ### 이벤트 등록 6번째 방법 ---------------------
		// JVM는 addActionListener가 어떤 역할인지 알기 때문에 위 코드처럼 익명 객체를 알아서 만들고 실행한다.  
		jbt_fra.addActionListener((e) -> { 
			setTitle("프랑스어 : 봉쥬르");
		});
		
		
		// 위치 지정 
		super.setLocation(300, 300); // x, y

		// 창 사이즈 
		super.setSize(400, 400); // w, h

		// 보여줘라 
		super.setVisible(true);

		// 종료 
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// close 버튼 눌리면 프로그램 종료될 것이다. 


	}   

	public static void main(String[] args) {
		new ButtonEvent();

	}

}
