package study.chapter10.ex09;

public class SubStringExam {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		String first = ssn.substring(0,6);
		System.out.println(first);
		
		String second = ssn.substring(7);
		System.out.println(second);
		
		String str1 = "abcd.jpg";
		String str2 = "abcd.jpg.text";
		String str3 = "abcd.png";
		String str4 = "abcd.text";
		
		int f = str3.lastIndexOf("."); 
		// indexof가 아니라 마지막 .을 찾기 위해 lastindexof
		String fileName = str3.substring(0, f);
		System.out.println("파일명 : " + fileName);
		
		String result = str3.substring(f+1);
		System.out.println("확장자 : " + result);
		
		
		if(result.equals("jpg") || result.equals("png")) {
			System.out.println("업로드가 가능합니다.");
		} else { 
			System.out.println("업로드를 할 수 없는 형식입니다. ");
		}

	}

}
