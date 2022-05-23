package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio ra1 = new Radio();
		ra1.name = "브리츠 라디오";
		ra1.onoff=true; 
		ra1.channel = 89.1;
		ra1.volume = 12;
		ra1.print();
		System.out.println();
		Radio ra2 = new Radio();
		ra2.name ="아이리버 라디오";
		ra2.onoff=false;
		ra2.channel = 95.1;
		ra2.volume = 9;
		ra2.print();
		
		
		
	}
}
