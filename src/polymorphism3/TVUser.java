package polymorphism3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 다형성 = 상속 + Overriding + 형변환
public class TVUser {
	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory(
//				new ClassPathResource("applicationContext.xml"));
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();		
	}
}
