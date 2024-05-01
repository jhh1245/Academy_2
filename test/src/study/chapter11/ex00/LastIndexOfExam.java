package study.chapter11.ex00;

public class LastIndexOfExam {

	public static void main(String[] args) {
		String str1 = "akskkfrjfhckskehfhr";
		int result1 = str1.indexOf("h");      // 처음 
		int result2 = str1.lastIndexOf("fh");  // 마지막 
		
		System.out.println(result1);
		System.out.println(result2);

		String str2 = "aaa.jpg";
		String str3 = "aaa.png";
		//jpg 만 업로드 
		if(str2.indexOf(".jpg") != -1) { // 찾았다.
			System.out.println("업로드 가능");
		}
	}

}
