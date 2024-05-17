package study._06_Example.mymain;

import study._06_Example.util.AdvanceCalc;
import study._06_Example.util.BaseCalc;

public class _06_Exam {
	static void useOnlyBaseCalc(BaseCalc bc) { 
		// 그러나 여기서 지정한 파라미터타입 때문에 여기서 BaseCalc 영역만 쓸 수 있게 된다. 
		// AdvanceCalc영역 사용 불가. 제한을 시켰다. 
		
		int a = 10, b = 5, res;
		res = bc.plus(a,b);
		System.out.printf("BaseCalc 타입으로 실행 : %d + %d = %d\n", a, b, res);
	}
		
	public static void main(String[] args) {
		
		AdvanceCalc ac = new AdvanceCalc();
		
		Object ob = ac;
		
		BaseCalc bc = ac;
		
		useOnlyBaseCalc(ac); 				// ac는 3가지 영역 모두 사용가능
		
		useOnlyObject(ac);
		
		Object ob2 = new Object();			// 애초에 메모리에 Object 밖에 없음
		
		// AdvanceCalc ac2 = (AdvanceCalc)ob2; // 에러는 안뜨지만 안된다. 
	}

	//Object 영역만 사용(참조)해라
	private static void useOnlyObject(Object ob) { // Object ob = ac -> upcasting
		System.out.println(ob);
		
		AdvanceCalc ac = (AdvanceCalc)ob; 		   // AdvanceCalc까지 확장 
		
		int n = 10;
		int result = 0;
		
		result = ac.hap(n);
	}
}
