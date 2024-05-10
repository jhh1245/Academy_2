package study._04_javaIO.file;

import java.io.File;

public class _01_FileTest {

	public static void main(String[] args) {
		File f = new File("f:\\dev"); // 제어문자로 인식한다. \n \r \t 

		//Directory 생성 
		File ff = new File(f, "myfolder");
		
		// 존재하지 않으면 생성해라 
		if(ff.exists() == false) { 
			ff.mkdir();
		}
		
		// 삭제 
		ff.delete();
	
		// 경로 
		String path = "f:\\git\\test";
		
		// 목록확인 
		File f2 = new File(path);
		File[] f_array = f2.listFiles();
		
		// 목록에 있는 파일 개수 
		System.out.println(f_array.length);
		
		// 목록에 있는 파일 이름 get 
		for(File file : f_array) {
			StringBuilder sb = new StringBuilder("[");
//			String kind = "["; // 종류 
			
			if(file.isDirectory()) {
				// kind += "D"; // 메모리 낭비 많음
				sb.append("D");
			} else if(file.isFile()) {
				sb.append("F");
			} 
			if(file.isHidden()) {
				sb.append("H");
			}

//			kind += "]";
			sb.append("] ");
			
			String name = file.getName();
			long len = file.length(); // 8바이트, 
			
			if(file.isFile() && len != 0){
				System.out.printf("%s%s (%d bytes)\n", sb.toString(), name, len); 			
				// long 파일을 int로	
			}  else if(file.isFile() || file.isDirectory() || len == 0) {
				System.out.printf("%s%s\n", sb.toString(), name);				
			}
			
//			if(file.isFile() ){
//				System.out.printf("%s%s (%d bytes)\n", sb.toString(), name, len); 			
//				// long 파일을 int로	
//			} else if(file.isDirectory()) {
//				System.out.printf("%s%s\n", sb.toString(), name);				
//			}
			
			
//			System.out.printf("%s%s\n", kind, file.getName());
			
 
		}
	}

}
