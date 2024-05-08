package study._01_review;


abstract class Student{
	int year;
	int num;
	
	abstract void study() ;
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
