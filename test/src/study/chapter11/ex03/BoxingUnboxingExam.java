package study.chapter11.ex03;

public class BoxingUnboxingExam {

	public static void main(String[] args) {
		// Boxing
		Integer int1 = new Integer(100);
		Integer int2 = new Integer("100");
		Integer int3 = Integer.valueOf(100);
		Integer int4 = Integer.valueOf("100");
		
		System.out.println(int1.toString());
		System.out.println(int2.toString());
		System.out.println(int3.toString());
		System.out.println(int4.toString());
		
		System.out.println("=======================");
		// Unboxing
		int num1 = int1.intValue();
		int num2 = int2.intValue();
		int num3 = int3.intValue();
		int num4 = int4.intValue();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println("=======================");
		// Boxing
		Double double1 = new Double(100.5);
		Double double2 = Double.valueOf(100.5);
		
		// UnBoxing
		double val1 = double1.doubleValue();
		double val2 = double2.doubleValue();
		System.out.println(val1);
		System.out.println(val2);
	}

}
