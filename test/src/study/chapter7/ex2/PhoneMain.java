package study.chapter7.ex2;

public class PhoneMain {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone("갤럭시노트9" , "검정", 15, "맨투맨");
		System.out.println("모델 : " + sp.model);
		System.out.println("색상 : " + sp.color);
		System.out.println("채널 : " + sp.channel);
		System.out.println("검색 : " + sp.search);
		System.out.println();
		
		
		// 부모인 cellphone으로부터 상속받은 메소드 
		sp.powerOn();
		sp.bell();
		sp.sendVoice("여보세요?");
		sp.receiveVoice("하이");
		sp.sendVoice("잘못거셨어요");
		sp.hangUP();
		System.out.println();
		
		
		// Smartphone 자신의 메서드 호출 
		sp.turnOnDmb();
		sp.changeDmb(14);
		sp.turnOffDmb();
		
	}

}
