package polymorphism3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Resource(name="sonySpeaker")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("created");
	}
	public void powerOn() {
		System.out.println("LgTV---������ �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LgTV---������ ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
