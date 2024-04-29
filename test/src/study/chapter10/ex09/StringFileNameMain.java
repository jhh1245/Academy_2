package study.chapter10.ex09;


public class StringFileNameMain {
	public static void main(String[] args) {
		
		StringFileName sfn = new StringFileName();
		
		sfn.fileUpload("abc.jpg");
		sfn.fileUpload("abc.jpge");
		sfn.fileUpload("abc.png");
		sfn.fileUpload("abc.text");
		sfn.fileUpload("abc.png.text");
		sfn.fileUpload("abc.text.png");


		sfn.uploadAllFiles();
	}
	
}
