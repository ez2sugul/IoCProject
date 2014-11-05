package polymorphism3;

public class SamsungTV implements TV {
	private Speaker speaker;
	private String name;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV °´Ã¼ »ı¼ºµÊ");
	}
	
	public SamsungTV(Speaker speaker, String name) {
		System.out.println("===> SamsungTV with parameter");
		this.speaker = speaker;
		this.name = name;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker ");
		this.speaker = speaker;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	public void powerOn() {
		System.out.println(name + "---Àü¿øÀ» ÄÒ´Ù.");
	}
	public void powerOff() {
		System.out.println(name + "---Àü¿øÀ» ²ö´Ù.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
