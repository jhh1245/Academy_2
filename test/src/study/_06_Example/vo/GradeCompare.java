package study._06_Example.vo;

import java.util.Comparator;

public class GradeCompare implements Comparator<GradeVo>{

	// 정렬 기준 
	public static final int SORT_FIELD_NAME = 1;
	public static final int SORT_FIELD_KOR = 2;
	public static final int SORT_FIELD_ENG = 3;
	public static final int SORT_FIELD_MATH = 4;
	
	// 정렬 방식 (오름 / 내림) 
	public static final int SORT_METHOD_ASC = 1;
	public static final int SORT_METHOD_DESC = 2;

	// 기본 값 
	int sort_field = SORT_FIELD_NAME; 
	int sort_method = SORT_METHOD_ASC;
	
	public void setSort_field(int sort_field) {
		this.sort_field = sort_field;
	}

	public void setSort_method(int sort_method) {
		this.sort_method = sort_method;
	}
	
	@Override
	public int compare(GradeVo o1, GradeVo o2) {
		int result = 0;
		
		switch(sort_field) {
		case SORT_FIELD_NAME:
			if(o1.getName().compareTo(o2.getName()) > 0) result = 1;
			else result = -1;
			break;
		case SORT_FIELD_KOR:
			if(o1.getKor() > o2.getKor()) result = 1;
			else result = -1;
			break;
		case SORT_FIELD_ENG:
			if(o1.getEng() > o2.getEng()) result = 1;
			else result = -1;
			break;
		case SORT_FIELD_MATH:
			if(o1.getMath() > o2.getMath()) result = 1;
			else result = -1;
			break;
		}
		
		
		// Desc 
		if (sort_method == SORT_METHOD_DESC) {
			result = -result;
		}
		
		return result;
	}
	
	

}
