package study.chapter5;

import java.util.Scanner;

public class TwoDimensionalArray05 {

	public static void main(String[] args) {
		//아이디 비번 체크 예제 
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("아이디를 입력하세요 : ");
//		String id = sc.nextLine();
//		
//		System.out.print("비밀번호를 입력하세요 : ");
//		String pw = sc.nextLine();

		String id = "han";
		String pw = "5han";
		
		String idArray[] = {"hjj", "jhh", "won", "hye", "han"};
		String pwArray[] = {"1hjj", "2jhh", "3won", "4hye", "5han"};
		
		boolean login = false;
		boolean login2 = false;
//		for(int i = 0; i < idArray.length; i++) {
//			if(idArray[i].equals(id) == true && pwArray[i].equals(pw) == true) {
//				login = true;
//				break;
//			}
//			else {
//				login = false;
//			}
//		}
		
//		if(login) {
//			System.out.println("로그인 성공했습니다.");
//		} else {
//			System.out.println("아이디 또는 비밀번호를 확인해주세요.");
//		}
		
		for(int i = 0; i < idArray.length; i++) {
			if(idArray[i].equals(id)) {
				login = true;
				if(pwArray[i].equals(pw)) {
					login2 = true;
					break;
				} else {
					login2 = false;
				}
			} else {
				login = false;
			}
		}
		
		if(login) {
			if(login2) {
				System.out.println("로그인 성공했습니다.");
			}
			else {
				System.out.println("비밀번호를 확인해주세요.");
			}
		} else {
			System.out.println("아이디를 확인해주세요.");
		}
		
		
	}

}
