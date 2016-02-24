package main.java.org.bankio.bean;

import java.util.HashMap;

public class BeanCfonb160{
	
    private BeanCfonb160Sender sender;
    private HashMap<Integer, BeanCfonb160Recipient> recipients = new HashMap<Integer, BeanCfonb160Recipient>();
    private BeanCfonb160Total total;

    public void setSender(BeanCfonb160Sender sender) {
        this.sender = sender;
    }

    public void setRecipients(HashMap<Integer, BeanCfonb160Recipient> recipients) {
        this.recipients = recipients;
    }

    public void setTotal(BeanCfonb160Total total) {
        this.total = total;
    }

    public BeanCfonb160Sender getSender() {
        return sender;
    }

    public HashMap<Integer, BeanCfonb160Recipient> getRecipients() {
        return recipients;
    }

    public BeanCfonb160Total getTotal() {
        return total;
    }
    
	public void addRecipient(int hash, BeanCfonb160Recipient recipient) {
		this.recipients.put(hash, recipient);
	}
	
	public void addAdditionnalToRecipient(int hash, BeanCfonb160RecipientAdditional beanCfonb160RecipientAdditional) {
		this.recipients.get(hash).setRecipientAdditional(beanCfonb160RecipientAdditional);
	}
}
