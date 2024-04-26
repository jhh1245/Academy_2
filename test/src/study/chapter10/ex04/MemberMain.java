package study.chapter10.ex04;

public class MemberMain {

	public static void main(String[] args) {
		Member original = new Member("abcd", "1234", 30, true, new int[] {100,90}) ; // 배열 넘길 때 형식 주의!  
		
		Member cloned = original.getMember();
		
		original.scores[0] = 50;
		
		
		System.out.println("원본");
		System.out.println(original.id);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		System.out.println(original.scores[0]);
		System.out.println(original.scores[1]);
		
		
		 
		original.id = "ddd";
		System.out.println(original.id);
		
		System.out.println();
		System.out.println("복제본");
		System.out.println(cloned.id); // 안바뀜
		System.out.println(cloned.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);
		System.out.println(cloned.scores[0]); // 메모리를 공유하고 있다. 
		System.out.println(cloned.scores[1]);
		
		int a = 10;
		int b = a;
		
		b = 20; // 깊은
		System.out.println(a);
		System.out.println(b);
		
		String c = "홍길동";
		String d = c;
		d = "길동홍";
		System.out.println(c);
		System.out.println(d);
		
		int[] aa = {1,2,3};
		int[] bb = aa; // 얕은 
		bb[0] = 10000;
		
		System.out.println(aa[0]);
		System.out.println(bb[0]);
	}

}
