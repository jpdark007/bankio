package main.java.org.bankio.cfonb;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.beanio.BeanIOConfigurationException;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import main.java.org.bankio.bean.BeanCfonb120;
import main.java.org.bankio.bean.BeanCfonb120Additional;
import main.java.org.bankio.bean.BeanCfonb120Movement;
import main.java.org.bankio.bean.BeanCfonb160;
import main.java.org.bankio.bean.BeanCfonb160Recipient;

public class WriterCfonb {
	private static final String CFONB120 = "cfonb120";
	private static final String CFONB120_XML = "cfonb120.xml";
	private static final String CFONB160 = "cfonb160";
	private static final String CFONB160_XML = "cfonb160.xml";
	
	public static File setBeanCfonb120ToFile(BeanCfonb120 beanCfonb120) throws BeanIOConfigurationException, IOException {
	        // create a StreamFactory
	        StreamFactory factory = StreamFactory.newInstance();
	        factory.load(ReaderCfonb.class.getClassLoader().getResourceAsStream(CFONB120_XML));
	        
	        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	        Date date = new Date();
	        File outputFile = new File(CFONB120 + dateFormat.format(date));
	        	        
	        // set writer mapping file
	        BeanWriter writer = factory.createWriter(CFONB120,outputFile );
	        
	        writer.write(beanCfonb120.getOldAmount());
	        
	        HashMap<Integer, BeanCfonb120Movement> beanCfonb120Movements = beanCfonb120.getMovements();
	        for (BeanCfonb120Movement beanCfonb120Movement : beanCfonb120Movements.values()) {
	        	writer.write(beanCfonb120Movement);
	        	List<BeanCfonb120Additional> lstBeanCfonb120Additional = beanCfonb120Movement.getAdditionals();
	        	for (BeanCfonb120Additional beanCfonb120Additional : lstBeanCfonb120Additional) {
	        		 writer.write(beanCfonb120Additional);
				}
	        }
	        
	        writer.write(beanCfonb120.getNewAmount());
	        
	        closeWriter(writer);
	        
	        return outputFile; 
	    }

	public static File setBeanCfonb160ToFile(BeanCfonb160 beanCfonb160) throws BeanIOConfigurationException, IOException {
        // create a StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        factory.load(ReaderCfonb.class.getClassLoader().getResourceAsStream(CFONB160_XML));
        
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        File outputFile = new File(CFONB160 + dateFormat.format(date));
        
        // set writer mapping file
        BeanWriter writer = factory.createWriter(CFONB160, outputFile);
        
        writer.write(beanCfonb160.getSender());
        
        HashMap<Integer, BeanCfonb160Recipient> beanCfonb160Recipients = beanCfonb160.getRecipients();
        for (BeanCfonb160Recipient beanCfonb160Recipient : beanCfonb160Recipients.values()) {
        	writer.write(beanCfonb160Recipient);
        	writer.write(beanCfonb160Recipient.getRecipientAdditional());
        }
        
        writer.write(beanCfonb160.getTotal());
        
        closeWriter(writer);
        
        return outputFile; 
    }
	
	private static void closeWriter(BeanWriter writer) {
		writer.flush();
		writer.close();
	}
}
