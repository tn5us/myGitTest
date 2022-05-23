package ch16;

public class MusicPlayer extends Thread{
	//멤버변수
	int type;
	MusicBox musicBox;//내가 만든 클래스도 객체형 데이터 타입이 될 수 있다
	
	public MusicPlayer(int type, MusicBox musicBox) {//지역변수
		this.type = type;
		this.musicBox= musicBox;
	}
	public MusicPlayer() {//기본생성자
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: musicBox.playMusicA(); break;
		case 2: musicBox.PlayMusicB(); break;
		case 3: musicBox.PlayMusicC(); break;
		}
	}
	
	
}
