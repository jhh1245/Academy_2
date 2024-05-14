package study._06_Example;

import study._06_Example.util.AdvanceCalc;
import study._06_Example.util.BaseCalc;

public class _06_Exam {
	static void useOnlyBaseCalc(BaseCalc bc) { 
		// 그러나 여기서 지정한 파라미터타입 때문에 여기서 BaseCalc 영역만 쓸 수 있게 된다. 
		// AdvanceCalc영역 사용 불가. 제한을 시켰다. 
	}
		
	public static void main(String[] args) {
		
		AdvanceCalc ac = new AdvanceCalc();
		Object ob = ac;
		
		useOnlyBaseCalc(ac); // ac는 3가지 영역 모두 사용가능 
	}

}
