//

package study._06_Example.util;

public class MyArrayList <E> {
	// E : Element Type (Type 명칭 마음대로)
	E[] data = null;
	
	public int size() {
		return data == null ? 0 : data.length;
		// 비어있으면 0 반환 
	}
	
	public void add(E newObj) {
		// 1. 기존 배열보다 1개 더 많게끔 임시 배열 생성 
		E [] imsi = (E [] )new Object[this.size() + 1]; // E타입의 배열로 다운 캐스팅 
		// this.size() 는 위에 선언한 size() 메소드 실행 
		
		// 2. 원래 배열값 -> 임시 배열로 옮긴다. 
		for(int i = 0; i < this.size(); i++) {
			imsi[i] = data[i];
		} 
		
		// 3. 임시배열 마지막 방에 새 데이터(매개변수로 받은 newObj)를 넣는다. 
		// 마지막 방 인덱스 = 기존 배열의 크기 (ex. 3개 방이 기존에 있다. 임시배열의 마지막 방인덱스는 3이다!) 
		imsi[this.size()] = newObj;
		
		// 4. 임시배열을 -> 기존 배영로 넘긴다.
		data = imsi;
		// imsi 배열 소멸 
	}
	
	public E get(int index) { // 저장된 데이터 가져올때는 어떤 타입일 지 모르니까 리턴타입은 Object
		return data[index];
	}
}



//package study._06_Example.util;
//
//public class _05_MyArrayList {
//	Object[] data = null;
//	
//	public int size() {
//		return data == null ? 0 : data.length;
//		// 비어있으면 0 반환 
//	}
//	
//	public void add(Object newObj) {
//		// 1. 기존 배열보다 1개 더 많게끔 임시 배열 생성 
//		Object [] imsi = new Object[this.size() + 1];
//		// this.size() 는 위에 선언한 size() 메소드 실행 
//		
//		// 2. 원래 배열값 -> 임시 배열로 옮긴다. 
//		for(int i = 0; i < this.size(); i++) {
//			imsi[i] = data[i];
//		} 
//		
//		// 3. 임시배열 마지막 방에 새 데이터(매개변수로 받은 newObj)를 넣는다. 
//		// 마지막 방 인덱스 = 기존 배열의 크기 (ex. 3개 방이 기존에 있다. 임시배열의 마지막 방인덱스는 3이다!) 
//		imsi[this.size()] = newObj;
//		
//		// 4. 임시배열을 -> 기존 배영로 넘긴다.
//		data = imsi;
//		// imsi 배열 소멸 
//	}
//	
//	public Object get(int index) { // 저장된 데이터 가져올때는 어떤 타입일 지 모르니까 리턴타입은 Object
//		return data[index];
//	}
//}
