package main.java.org.bankio.sepa;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import iso.std.iso._20022.tech.xsd.pain_001_001.CustomerCreditTransferInitiationV07;
import iso.std.iso._20022.tech.xsd.pain_001_001.Document;
import iso.std.iso._20022.tech.xsd.pain_001_001.ObjectFactory;

public class CustomerCreditTransferInitiation {
	private Document document = new Document();
	private CustomerCreditTransferInitiationV07 customerCreditTransferInitiation;
	
	public CustomerCreditTransferInitiationV07 getCustomerCreditTransferInitiation() {
		return customerCreditTransferInitiation;
	}

	public CustomerCreditTransferInitiation(Document document) {
		this.document = document;
		customerCreditTransferInitiation= new CustomerCreditTransferInitiationV07();
		document.setCstmrCdtTrfInitn(customerCreditTransferInitiation);
	}
	
	public static CustomerCreditTransferInitiation read(InputStream is) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(Document.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
				
		StreamSource streamSource = new StreamSource(is);
		JAXBElement<Document> root = unmarshaller.unmarshal(streamSource, Document.class);
		
		return new CustomerCreditTransferInitiation(root.getValue());
	}
	
	public void write(OutputStream outputStream) throws JAXBException {
		JAXBContext jAXBContext = JAXBContext.newInstance(Document.class);
		Marshaller marshaller = jAXBContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        marshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.name());
        marshaller.marshal(new ObjectFactory().createDocument(document), outputStream);
	}
}
