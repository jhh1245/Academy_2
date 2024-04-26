package study.chapter10.ex01;

public class Member {
	String id;
	
	public Member(String id) { 
		this.id = id;
	}
	

	//ctrl + space 누르고 equals 선택 -> 자동완성  
	
	@Override
	public boolean equals(Object obj) { // Object 이거나 Object 상속받은 애들 = 모든 애들이 다 들어온다 
		if(obj instanceof Member) { //Member로 부터 만들어졌니? 
			Member member = (Member)obj;// 강제 형변환, 캐스팅 해야 한다.  
			if(id.equals(member.id)) { // 현재 id랑 들어온 id랑 같은가? 
				return true;
				
			}
		}
		return false ; 
	}
}	
