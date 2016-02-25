package test.java.org.bankio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import main.java.org.bankio.bean.BeanCfonb160;
import main.java.org.bankio.bean.BeanCfonb160Recipient;
import main.java.org.bankio.bean.BeanCfonb160RecipientAdditional;
import main.java.org.bankio.bean.BeanCfonb160Sender;
import main.java.org.bankio.bean.BeanCfonb160Total;

public class Cfonb160Test {
	
	private static BeanCfonb160 beanCfonb160;
	
	@BeforeClass
	public static  void onceExecutedBeforeAll() {
		BeanCfonb160Sender beanCfonb160Sender = new BeanCfonb160Sender();
		beanCfonb160Sender.setCodeEnregistrement("03");
		
		BeanCfonb160Recipient beanCfonb160Recipient = new  BeanCfonb160Recipient();
		beanCfonb160Recipient.setCodeEnregistrement("06");
		
		BeanCfonb160RecipientAdditional beanCfonb160RecipientAdditional = new  BeanCfonb160RecipientAdditional();
		beanCfonb160RecipientAdditional.setCodeEnregistrement("07");
		beanCfonb160Recipient.setRecipientAdditional(beanCfonb160RecipientAdditional);
				
		BeanCfonb160Total beanCfonb160Total = new BeanCfonb160Total();
		beanCfonb160Total.setCodeEnregistrement("08");
		
		beanCfonb160 = new BeanCfonb160();
		beanCfonb160.addRecipient(beanCfonb160Recipient.hashCode(), beanCfonb160Recipient);
		beanCfonb160.setSender(beanCfonb160Sender);
		beanCfonb160.setTotal(beanCfonb160Total);
	}

	@Test
	public void testCfonb160() {
		assertNotNull(beanCfonb160);
		assertNotNull(beanCfonb160.getRecipients());
		assertNotNull(beanCfonb160.getSender());
		assertNotNull(beanCfonb160.getTotal());
	}
	
	@Test
	public void testRecipients() {
		HashMap<Integer, BeanCfonb160Recipient> beanCfonb160Recipients = beanCfonb160.getRecipients();
		for (BeanCfonb160Recipient beanCfonb160Recipient : beanCfonb160Recipients.values()) {
			assertEquals("06", beanCfonb160Recipient.getCodeEnregistrement());
			assertEquals("07", beanCfonb160Recipient.getRecipientAdditional().getCodeEnregistrement());
		}
	}
	
	@Test
	public void testTotal() {
		assertEquals("08", beanCfonb160.getTotal().getCodeEnregistrement());
	}
	
	@Test
	public void testSender() {
		assertEquals("03", beanCfonb160.getSender().getCodeEnregistrement());
	}
}
