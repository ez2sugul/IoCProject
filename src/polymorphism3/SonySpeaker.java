package polymorphism3;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("created sonyspeaker");
	}
	public void volumeUp() {
		System.out.println("SonySpeaker---�Ҹ��� �ø���.");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker---�Ҹ��� ������.");
	}
}
