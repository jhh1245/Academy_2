package study._06_Example.vo;

import java.util.Comparator;

// PersonVo에 대한 정렬 정보 
public class PersonCompare implements Comparator<PersonVo>{

	// 정렬기준 
	public static final int SORT_FIELD_NAME = 1; 
	public static final int SORT_FIELD_AGE = 2;
	public static final int SORT_FIELD_ADDR = 3;
	
	// 정렬방식 (오름차순 / 내림차순)
	public static final int SORT_METHOD_ASC = 1;
	public static final int SORT_METHOD_DESC = 2;
	
	int sort_field = SORT_FIELD_NAME; // 기본정렬 방식은 "이름"이다. 
	int sort_method = SORT_METHOD_ASC;
	

	public void setSort_field(int sort_field) {
		this.sort_field = sort_field;
	}

	public void setSort_method(int sort_method) {
		this.sort_method = sort_method;
	}
	
	
	@Override
	public int compare(PersonVo o1, PersonVo o2) { // 인터페이스의 추상메소드를 반드시 재정의 해야됨 
		int result = 0; // 같으면 0이다. 
		
		if(sort_field == SORT_FIELD_NAME) {
			if(o1.getName().compareTo(o2.getName()) > 0) result = 1;        // 1이면 바꾼다. 
			else if(o1.getName().compareTo(o2.getName()) < 0) result = -1;  // 0이나 -1이면 바꾸지 않는다.
		} else if (sort_field == SORT_FIELD_ADDR) {
			if(o1.getAddr().compareTo(o2.getAddr()) > 0) result = 1;        // 1이면 바꾼다. 
			else if(o1.getAddr().compareTo(o2.getAddr()) < 0) result = -1;  // 0이나 -1이면 바꾸지 않는다.
		} else if (sort_field == SORT_FIELD_AGE) {
			if(o1.getAge() > o2.getAge()) result = 1;        // 1이면 바꾼다. 
			else if(o1.getAge() < o2.getAge()) result = -1;  // 0이나 -1이면 바꾸지 않는다.
		}

		// Desc 
		if (sort_method == SORT_METHOD_DESC) {
			result = -result;
		}
		return result;
	}
}
