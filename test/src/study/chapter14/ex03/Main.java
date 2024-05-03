package study.chapter14.ex03;

public class Main {

	public static void main(String[] args) {
		Product<TV,String> p = new Product<TV,String>();
		
		p.setKind(new TV()); // 매개변수로 들어갈 수 있는건 TV이거나 TV상속한 것 
		p.setModel("삼성 스마트 TV");
		
		TV tv = p.getKind(); // TV 타입
		String tvModel = p.getModel();
		
		System.out.println("TV 모델 : " + tvModel);
		
		Product<Computer, String> p2 = new Product<Computer, String>();
		p2.setKind(new Computer());
		p2.setModel("LG 그램");
		
		Computer com = p2.getKind();
		String comModel = p2.getModel();
		System.out.println("컴퓨터 모델 : " + comModel);
		
		Product<Integer, String> p3 = new Product<Integer, String>();
		p3.setKind(3);
		p3.setModel("반팔티셔츠");
		int qua = p3.getKind();
		String str = p3.getModel();
		System.out.println(str + "를 " + qua + "개 주문하셨습니다.");

	}

}
