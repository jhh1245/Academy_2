package study._06_Example.util;

import java.util.Calendar;

public class Jumin {
	private String jumin_no;
	
	public String getJumin_no() {
		return jumin_no;
	}

	public void setJumin_no(String jumin_no) {
		this.jumin_no = jumin_no;
	}
	
	public int getYear() {
		String str_year = jumin_no.substring(0, 2);
		     
		int year =Integer.parseInt(str_year); 
		
		
		// char gender = jumin_no.charAt(7);
		//int gender_no = gender - '0';
		
		//             01234567890123   <- index(첨자)  
		// jumin_no = "091212-3234567";
		
		
		/*
		               내국인    외국인
		               남  여    남  여
		     1900      1   2     5   6 
		     2000      3   4     7   8
		     1800      9   0
		*/
		int gender_no = Integer.parseInt(jumin_no.substring(7,8));
		
		switch(gender_no) {
		case 1:
		case 2:
		case 5:
		case 6:
			return year + 1900;
		case 3:
		case 4:
		case 7:
		case 8:
			return year + 2000;
		}
		return year + 1800;
	} // end : getYear()
	
	public int getAge() {
		Calendar now = Calendar.getInstance();
		int current_year = now.get(Calendar.YEAR);
		
		int birth_year = this.getYear();
		
		int age = current_year - birth_year;
		
		return age;
	}
	
	public String getTti() {
		
		int tti_index = this.getYear() % 12;
		// 출생년도 % 12 : 0 ~ 11 
		// 4  5 6  7 8 9 10 11 0 1 2 3 
		// 자 축 인 묘 진 사 오 미 신 유 술 해 
		// 쥐 소 범 토 용 뱀 말 양 원 닭 개 돼 
		switch(tti_index) {
		case 0: return "원숭이";
		case 1: return "닭";
		case 2: return "개";
		case 3: return "돼지";
		case 4: return "쥐";
		case 5: return "소";
		case 6: return "범";
		case 7: return "토";
		case 8: return "용";
		case 9: return "뱀";
		case 10: return "말";
		case 11: return "양";
		
		
		} return "다시입력";
	}
	
	public String getGender() {
		int gender = Integer.parseInt(jumin_no.substring(7,8));
		if (gender% 2 == 0) { 
			return "여자";
		} else {
			return "남자";
		}
		
	}
	
	public String getSeason() {
		int season  = Integer.parseInt(jumin_no.substring(2,4));
		
//		if(season >= 3 && season <= 5) {
//			return "봄";
//		} else if(season >= 6 && season <= 8) {
//			return "여름";
//		} else if(season >= 9 && season <= 11) {
//			return "가을";
//		} else if (season == 12 || season == 1 || season == 2) {
//			return "겨울";
//		}
		
		// 방법 2 
//		switch(season) {
//		case 3:case 4: case 5:
//			return "봄";
//		case 6:case 7: case 8:
//			return "여름";
//		case 9:case 10: case 11:
//			return "가을";
//		default:
//		return "겨울";
//		}
		
		// 방법 3 
		switch(season / 3){
		case 1:
			return "봄";
		case 2: 
			return "여름";
		case 3:
			return "가을";
		default :
			return "겨울";
		}
		 
	}
	
	public String getLocal() {
		int local  = Integer.parseInt(jumin_no.substring(8,10));
		if(local >= 0 && local <= 8) {
			return "서울";
		} 
		if(local >= 9 && local <= 12) {
			return "부산";
		} 
		if(local >= 13 && local <= 15) {
			return "인천";
		} 
		if(local >= 16 && local <= 25) {
			return "경기도";
		}
		if(local >= 26 && local <= 34) {
			return "강원도";
		} 
		if(local >= 35 && local <= 39) {
			return "충척북도";
		} 
		if(local == 40) return "대전";
		if(local >= 41 && local <= 47) return "충청남도";
		if(local >= 48 && local <= 54) return "전라북도";
		
		if (local == 55 || local == 56) return "광주";
	

				
				
		// 그 외 생략.. 
		
		return "잘못입력";
	}
	
	public String getGanji() {
		
		int Ganji_1 = (this.getYear() % 10);
		int Ganji_2 = (this.getYear() % 12);
		
		String ganji = "";
		
		// 첫번째 방법
//		switch (Ganji_1) {
//		case 0: ganji += "경"; break;
//		case 1: ganji += "신"; break;
//		case 2: ganji += "임"; break;
//		case 3: ganji += "계"; break;
//		case 4: ganji += "갑"; break;
//		case 5: ganji += "을"; break;
//		case 6: ganji += "병"; break;
//		case 7: ganji += "정"; break;
//		case 8: ganji += "무"; break;
//		case 9: ganji += "기"; break;
//		}
//		switch (Ganji_2) {
//		case 0: ganji += "신"; break;
//		case 1: ganji += "유"; break;
//		case 2: ganji += "술"; break;
//		case 3: ganji += "해"; break;
//		case 4: ganji += "자"; break;
//		case 5: ganji += "축"; break;
//		case 6: ganji += "인"; break;
//		case 7: ganji += "묘"; break;
//		case 8: ganji += "진"; break;
//		case 9: ganji += "사"; break;
//		case 10: ganji += "오"; break;
//		case 11: ganji += "미"; break;
//		}
		
		// 두번째 방법
		String gan_list = "경신임계갑을병정무기";
		String ji_list = "신유술해자축인묘진사오미";
		
		char gan = gan_list.charAt(this.getYear() % 10);
		char ji = ji_list.charAt(this.getYear() % 12);
		
		return String.format("%c%c년", gan, ji);
	}
	
}
