package main.java.org.bankio.reader;

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

public class BeanReaderCfonb {
	
	private static final String CFONB120 = "cfonb120";
	private static final String CFONB120_XML = "cfonb120.xml";

	public static void getBeanCfonb120FromFile(File file) throws BeanIOConfigurationException, IOException {
	        // create a StreamFactory
	        StreamFactory factory = StreamFactory.newInstance();
	        // load the mapping file
	        factory.load(BeanReaderCfonb.class.getClassLoader().getResourceAsStream(CFONB120_XML));
	        	        
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
	    }
}