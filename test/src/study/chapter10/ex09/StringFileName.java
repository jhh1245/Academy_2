package study.chapter10.ex09;

// file필드에 확장자가 .jpg or .png파일만 업로드 되어야 한다.
// 업로드 성공시 : 성공 메시지 + 업로드된 파일명 출력 
// 나머지 : 업로드 X 
// 배열에 저장

public class StringFileName {
	private String[] file = new String[100];
	
	private int fileNum;
	
	public void fileUpload(String file) {
		int fileName = file.lastIndexOf(".");
		String exFileName = file.substring(fileName); // 확장자 
		
		if(exFileName.equals(".jpg") || exFileName.equals(".png")) {
			System.out.println(file + "파일이 업로드 되었습니다.");
			System.out.println("업로드된 파일명 : " + file);
			this.file[fileNum++] = file;
		} else {
			System.out.println("업로드 할 수 없는 파일입니다.");
		}
	}
	
	public void uploadAllFiles() {
		for(int i = 0; i < file.length; i++) {
			if(this.file[i] == null) break;
			System.out.println("현재 업로드된 사진 " + (i+1) + ": " + this.file[i]);
		}
	}
}
