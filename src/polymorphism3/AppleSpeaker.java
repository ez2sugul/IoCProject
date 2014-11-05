package polymorphism3;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("created AppleSpeaker");
	}
	/* (non-Javadoc)
	 * @see polymorphism3.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker---�Ҹ��� �ø���.");
	}
	/* (non-Javadoc)
	 * @see polymorphism3.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker---�Ҹ��� ������.");
	}
}
