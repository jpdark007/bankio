package test.java.org.bankio;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import main.java.org.bankio.bean.BeanCfonb160;
import main.java.org.bankio.bean.BeanCfonb160Recipient;
import main.java.org.bankio.bean.BeanCfonb160Sender;
import main.java.org.bankio.bean.BeanCfonb160Total;

public class Cfonb160Test {
	
	private static BeanCfonb160 beanCfonb160;
	
	@BeforeClass
	public static  void onceExecutedBeforeAll() {
		BeanCfonb160Sender beanCfonb160Sender = new BeanCfonb160Sender();
		beanCfonb160Sender.setCodeEnregistrement("03");
		
		List<BeanCfonb160Recipient> recipients = new ArrayList<BeanCfonb160Recipient>();
		BeanCfonb160Recipient beanCfonb160Recipient = new  BeanCfonb160Recipient();
		beanCfonb160Recipient.setCodeEnregistrement("06");
		
		List<BeanCfonb160Recipient> recipientsAdd = new ArrayList<BeanCfonb160Recipient>();
		BeanCfonb160Recipient beanCfonb160Recipient2 = new  BeanCfonb160Recipient();
		beanCfonb160Recipient2.setCodeEnregistrement("07");
		recipientsAdd.add(beanCfonb160Recipient2);
		
		beanCfonb160Recipient.setRecipients(recipientsAdd);
		
		BeanCfonb160Total beanCfonb160Total = new BeanCfonb160Total();
		beanCfonb160Total.setCodeEnregistrement("08");
		
		beanCfonb160 = new BeanCfonb160();
		beanCfonb160.setRecipients(recipients);
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
		List<BeanCfonb160Recipient> beanCfonb160Recipients = beanCfonb160.getRecipients();
		for (BeanCfonb160Recipient beanCfonb160Recipient : beanCfonb160Recipients) {
			List<BeanCfonb160Recipient> beanCfonb160RecipientsAdd = beanCfonb160Recipient.getRecipients();
			assertEquals("06", beanCfonb160Recipient.getCodeEnregistrement());
			for (BeanCfonb160Recipient beanCfonb160Recipient2 : beanCfonb160RecipientsAdd) {
				assertEquals("07", beanCfonb160Recipient2.getCodeEnregistrement());
			}
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
