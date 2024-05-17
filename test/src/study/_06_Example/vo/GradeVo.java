package study._06_Example.vo;

public class GradeVo {
	// 필드 
	String name; 
	int kor;
	int eng;
	int math;
	
	// 생성자 
	public GradeVo() {
		
	}
			
	public GradeVo(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s-%d-%d-%d-%d]",name, kor, eng, math, (kor+eng+math));
	}
	
	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
