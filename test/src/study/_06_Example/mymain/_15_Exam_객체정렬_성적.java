package study._06_Example.mymain;

import java.util.Arrays;

import study._06_Example.vo.GradeCompare;
import study._06_Example.vo.GradeVo;
import study._06_Example.vo.PersonCompare;

public class _15_Exam_객체정렬_성적 {

	public static void main(String[] args) {
		GradeVo[] grade_arr = {
				new GradeVo("가길동", 100, 80, 70),
				new GradeVo("나길동", 70, 90, 80),
				new GradeVo("다길동", 80, 70, 90),
				new GradeVo("마길동", 95, 100, 100),
				new GradeVo("라길동", 85, 95, 95),
		};
		
		System.out.println("--원본--");
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		GradeCompare comp = new GradeCompare();
		
		// 이름순 
		System.out.println("---이름순 오름차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		// 이름순 - 내림차순 
		comp.setSort_method(GradeCompare.SORT_METHOD_DESC);
		System.out.println("---이름순 내림차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		// 국어점수순 - 오름
		comp.setSort_field(GradeCompare.SORT_FIELD_KOR);
		comp.setSort_method(GradeCompare.SORT_METHOD_ASC);
		System.out.println("---국어점수순 오름차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		// 국어점수순 - 내림
		comp.setSort_method(GradeCompare.SORT_METHOD_DESC);
		System.out.println("---국어점수순 내림차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		// 영어점수순 - 오름
		comp.setSort_field(GradeCompare.SORT_FIELD_ENG);
		comp.setSort_method(GradeCompare.SORT_METHOD_ASC);
		System.out.println("---영어점수순 오름차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		// 영어점수순 - 내림
		comp.setSort_method(GradeCompare.SORT_METHOD_DESC);
		System.out.println("---영어점수순 내림차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		
		// 수학점수순 - 오름
		comp.setSort_field(GradeCompare.SORT_FIELD_MATH);
		comp.setSort_method(GradeCompare.SORT_METHOD_ASC);
		System.out.println("---수학점수순 오름차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}
		
		// 수학점수순 - 내림 
		comp.setSort_method(GradeCompare.SORT_METHOD_DESC);
		System.out.println("---수학점수순 내림차순---");
		Arrays.sort(grade_arr, comp);
		for(GradeVo grade : grade_arr) {
			System.out.println(grade);
		}

		
	}
	
	
}
