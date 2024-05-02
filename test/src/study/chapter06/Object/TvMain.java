package study.chapter06.Object;

public class TvMain {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		
		Tv tv2 = new Tv(250); // 채널을 변경 -> 10 ~ 200만 가능
		System.out.println("tv2 inch : " + tv2.inch);
		System.out.println("tv2 channel : " + tv2.channel);
		
		System.out.println();
		Tv tv3 = new Tv(100, 69); 
		System.out.println("tv3 inch : " + tv3.inch);
		System.out.println("tv3 channel : " + tv3.channel);
		System.out.println("tv3 vol : " + tv3.vol);
		
		System.out.println();
		Tv tv4 = new Tv(1231, 5, 3);
		// Tv tv5 = new Tv("삼성", 100); //String, int 타입으로 된 생성자는 없어서 에러 발생 
		System.out.println("tv4 inch: " + tv4.inch);
		System.out.println("tv4 channel: " + tv4.channel);
		System.out.println("tv4 vol: " + tv4.vol);
		System.out.println("tv4 brand : " + tv4.brand); 
		
	}

}
