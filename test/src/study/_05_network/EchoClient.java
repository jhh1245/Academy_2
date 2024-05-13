package study._05_network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	public static void main(String[] args) throws IOException{
		// 1. 서버에 연결 요청          ip, port 
		// Socket client = new Socket("localhost", 7000);
		
		Socket client = new Socket("192.168.219.170", 7000);
		
		// 2. 전송 
		OutputStream os = client.getOutputStream(); // 송신 스트림 = 데이터 전송시 
		String msg = "안녕하세요.";
		
		// String -> byte배열로 변환 
		os.write(msg.getBytes()); 
		
	}
}
