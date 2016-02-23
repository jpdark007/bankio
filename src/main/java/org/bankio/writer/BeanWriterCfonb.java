package main.java.org.bankio.writer;

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
import main.java.org.bankio.reader.BeanReaderCfonb;

public class BeanWriterCfonb {
	private static final String CFONB120 = "cfonb120";
	private static final String CFONB120_XML = "cfonb120.xml";

	public static void setBeanCfonb120ToFile(BeanCfonb120 beanCfonb120) throws BeanIOConfigurationException, IOException {
	        // create a StreamFactory
	        StreamFactory factory = StreamFactory.newInstance();
	        factory.load(BeanReaderCfonb.class.getClassLoader().getResourceAsStream(CFONB120_XML));
	        
	        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	        Date date = new Date();
	        
	        // set writer mapping file
	        BeanWriter writer = factory.createWriter(CFONB120, new File(CFONB120 + dateFormat.format(date)));
	        
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
	        
	        writer.flush();
	        writer.close();
	    }
}
