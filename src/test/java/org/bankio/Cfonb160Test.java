package test.java.org.bankio;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.beanio.BeanIOConfigurationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import main.java.org.bankio.bean.BeanCfonb160;
import main.java.org.bankio.bean.BeanCfonb160Recipient;
import main.java.org.bankio.bean.BeanCfonb160RecipientAdditional;
import main.java.org.bankio.bean.BeanCfonb160Sender;
import main.java.org.bankio.bean.BeanCfonb160Total;
import main.java.org.bankio.writer.WriterCfonb;

public class Cfonb160Test {
	
	private static BeanCfonb160 beanCfonb160;
	
	@BeforeClass
	public static  void onceExecutedBeforeAll() {
		BeanCfonb160Sender beanCfonb160Sender = new BeanCfonb160Sender();
		beanCfonb160Sender.setCodeEnregistrement("03");
		
		BeanCfonb160Recipient beanCfonb160Recipient = getRecipient("0000");
		BeanCfonb160Recipient beanCfonb160Recipient2 = getRecipient("0001");
		
				
		BeanCfonb160Total beanCfonb160Total = new BeanCfonb160Total();
		beanCfonb160Total.setCodeEnregistrement("08");
		
		beanCfonb160 = new BeanCfonb160();
		beanCfonb160.addRecipient(beanCfonb160Recipient.hashCode(), beanCfonb160Recipient);
		beanCfonb160.addRecipient(beanCfonb160Recipient2.hashCode(), beanCfonb160Recipient2);
		beanCfonb160.addAdditionnalToRecipient(beanCfonb160Recipient.hashCode(), getRecipientAdditional());
		beanCfonb160.addAdditionnalToRecipient(beanCfonb160Recipient2.hashCode(), getRecipientAdditional());
		beanCfonb160.setSender(beanCfonb160Sender);
		beanCfonb160.setTotal(beanCfonb160Total);
	}

	private static BeanCfonb160RecipientAdditional getRecipientAdditional() {
		BeanCfonb160RecipientAdditional beanCfonb160RecipientAdditional = new  BeanCfonb160RecipientAdditional();
		beanCfonb160RecipientAdditional.setCodeEnregistrement("07");
		return beanCfonb160RecipientAdditional;
	}

	private static BeanCfonb160Recipient getRecipient(final String codeOperation) {
		BeanCfonb160Recipient beanCfonb160Recipient = new  BeanCfonb160Recipient();
		beanCfonb160Recipient.setCodeEnregistrement("06");
		beanCfonb160Recipient.setCodeOperation(codeOperation);
		return beanCfonb160Recipient;
	}

	@Test
	public void testCfonb160() throws BeanIOConfigurationException, IOException {
		assertNotNull(beanCfonb160);
		assertNotNull(beanCfonb160.getRecipients());
		assertNotNull(beanCfonb160.getSender());
		assertNotNull(beanCfonb160.getTotal());
		
		File output = WriterCfonb.setBeanCfonb160ToFile(beanCfonb160);
		assertTrue(output.exists());
		assertTrue(output.isFile());
		assertTrue(output.delete());
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
