package study.chapter07Overriding.ex8;

public class Tv {
	
	boolean power; 
	int channel;
	int vol;
	
	void power() {
		power = !power;	
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}

	void volUp() {
		vol += 3;
	}
	
	void volDown() {
		vol -= 3;
	}
}
