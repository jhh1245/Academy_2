package study.chapter14.ex03;

public class Product <T, M>{
	private T kind;		// 입력 값에 따라 컴파일시 타입 변환 
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
	
	
}
