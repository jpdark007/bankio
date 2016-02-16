package main.java.org.bankio.bean;

import java.util.ArrayList;
import java.util.List;

public class BeanCfonb160{
	
    private BeanCfonb160Sender sender;
    private List<BeanCfonb160Recipient> recipients = new ArrayList<BeanCfonb160Recipient>();
    private BeanCfonb160Total total;

    public void setSender(BeanCfonb160Sender sender) {
        this.sender = sender;
    }

    public void setRecipients(List<BeanCfonb160Recipient> recipients) {
        this.recipients = recipients;
    }

    public void setTotal(BeanCfonb160Total total) {
        this.total = total;
    }

    public BeanCfonb160Sender getSender() {
        return sender;
    }

    public List<BeanCfonb160Recipient> getRecipients() {
        return recipients;
    }

    public BeanCfonb160Total getTotal() {
        return total;
    }
}
