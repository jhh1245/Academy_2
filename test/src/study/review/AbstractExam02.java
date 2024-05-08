package study.review;


abstract class Student{
	int year;
	int num;
	
	abstract void study() ;
}

class 초등학생 extends Student{
	@Override
	void study() {
		System.out.println("초등학생은 구구단 공부");
		
	}
}

class 중학생 extends Student{
	@Override
	void study() {
		System.out.println("중학생은 함수 공부");
		
	}
}

class 고등학생 extends Student{
	@Override
	void study() {
		System.out.println("고등학생은 미적분 공부");
		
	}
}

public class AbstractExam02 {

	public static void main(String[] args) {
		Student[] student_list = {new 초등학생(), new 중학생(), new 고등학생()};

		for(Student s : student_list) {
			s.study();
		}
		
		Student s1 = new 초등학생();
		Student s2 = new 중학생();
		Student s3 = new 고등학생();
		
		Student[] student_list2 = {s1, s2, s3};
		for(int i = 0; i < student_list2.length; i++) {
			student_list2[i].study();
		}
		
		
	}

}
