package ch07;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Television myTv= new Television();
		myTv.channel =24;
		myTv.volume =30;
		myTv.onoff=true;
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 "+ ch +"이고, 볼륨은 " + myTv.volume+"이고, 전원은"+myTv.onoff+"입니다.");
	}
}
