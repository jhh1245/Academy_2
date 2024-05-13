package study._05_network;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		// 1. 서버 생성 port open : 5000번
		ServerSocket server = new ServerSocket(7000);
		System.out.println("--[서버 구동중]--");
		// 2. 접속 대기 
		while (true) {
			Socket child = server.accept();
			//대기큐에 접속정보 들어올 때까지 계속 만든다. 
	
			// 접속 요청한 상대방 IP 
			InetAddress ia = child.getInetAddress();
			System.out.println(ia.getHostAddress() + "님 접속 성공");
			
			// 2-1. 데이터 수신 
			InputStream is = child.getInputStream(); 
			// 수신 스트림 = 데이터 받는 쪽 
			
			byte[] buff = new byte[100];
			
			// 실 수신된 크기 
			int len = is.read(buff);
			
			//byte[] -> String, 실제 받은 데이터 만큼만 String 변환
			String readMsg = new String(buff, 0, len);
			
			System.out.println(readMsg);
		}
		
		

	}

}
