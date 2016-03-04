package main.java.org.bankio.cfonb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.beanio.BeanIOConfigurationException;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import main.java.org.bankio.bean.BeanCfonb120;
import main.java.org.bankio.bean.BeanCfonb120Additional;
import main.java.org.bankio.bean.BeanCfonb120Movement;
import main.java.org.bankio.bean.BeanCfonb120NewAmount;
import main.java.org.bankio.bean.BeanCfonb120OldAmount;
import main.java.org.bankio.bean.BeanCfonb160;
import main.java.org.bankio.bean.BeanCfonb160Recipient;
import main.java.org.bankio.bean.BeanCfonb160RecipientAdditional;
import main.java.org.bankio.bean.BeanCfonb160Sender;
import main.java.org.bankio.bean.BeanCfonb160Total;

public class ReaderCfonb {
	
	private static final String CFONB120 = "cfonb120";
	private static final String CFONB120_XML = "cfonb120.xml";
	private static final String CFONB160 = "cfonb160";
	private static final String CFONB160_XML = "cfonb160.xml";
	
	public static BeanCfonb120 getBeanCfonb120FromFile(File file) throws BeanIOConfigurationException, IOException {
	        // create a StreamFactory
	        StreamFactory factory = StreamFactory.newInstance();
	        // load the mapping file
	        factory.load(ReaderCfonb.class.getClassLoader().getResourceAsStream(CFONB120_XML));
	        	        
	        BeanReader in = factory.createReader(CFONB120,   new InputStreamReader(new FileInputStream(file)));
	        Object record = null;
	        BeanCfonb120 beanCfonb120 = new BeanCfonb120();
	        int lastBeanCfonb120Movement = 0;
	        
	        while ((record = in.read()) != null) {
	        	if (record instanceof BeanCfonb120OldAmount) {
	        		beanCfonb120.setOldAmount((BeanCfonb120OldAmount) record);
				}else if (record instanceof BeanCfonb120Movement) {
					lastBeanCfonb120Movement = ((BeanCfonb120Movement) record).hashCode();
					beanCfonb120.addMovement(lastBeanCfonb120Movement, (BeanCfonb120Movement) record);
				}else if (record instanceof BeanCfonb120Additional ){
					beanCfonb120.addAdditionnalToMovement(lastBeanCfonb120Movement, (BeanCfonb120Additional) record);
				}else if (record instanceof BeanCfonb120NewAmount ){
					beanCfonb120.setNewAmount((BeanCfonb120NewAmount) record);
				}
	        }	        
	        in.close();
			return beanCfonb120;
	    }
	
	public static BeanCfonb160 getBeanCfonb160FromFile(File file) throws BeanIOConfigurationException, IOException {
        // create a StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file
        factory.load(ReaderCfonb.class.getClassLoader().getResourceAsStream(CFONB160_XML));
        	        
        BeanReader in = factory.createReader(CFONB160,   new InputStreamReader(new FileInputStream(file)));
        Object record = null;
        BeanCfonb160 beanCfonb160 = new BeanCfonb160();
        int lastBeanCfonb160Recipient = 0;
        
        while ((record = in.read()) != null) {
        	if (record instanceof BeanCfonb160Sender) {
        		beanCfonb160.setSender((BeanCfonb160Sender) record);
			}else if (record instanceof BeanCfonb160Recipient) {
				lastBeanCfonb160Recipient = ((BeanCfonb160Recipient) record).hashCode();
				beanCfonb160.addRecipient(lastBeanCfonb160Recipient, (BeanCfonb160Recipient) record);
			}else if (record instanceof BeanCfonb160RecipientAdditional ){
				beanCfonb160.addAdditionnalToRecipient(lastBeanCfonb160Recipient, (BeanCfonb160RecipientAdditional) record);
			}else if (record instanceof BeanCfonb160Total ){
				beanCfonb160.setTotal((BeanCfonb160Total) record);
			}
        }	        
        in.close();
		return beanCfonb160;
    }
	
}
