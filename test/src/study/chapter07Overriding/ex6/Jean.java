package study.chapter07Overriding.ex6;

public class Jean extends Pants{

	@Override
	public void cutHeight() {
		// TODO Auto-generated method stub
		System.out.println("내 키에 맞게 높이 수선했습니다.");
	}

	@Override
	public void cutWidth() {
		System.out.println("내 허벅지에 맞게 너비 수선했습니다.");
	}

}
