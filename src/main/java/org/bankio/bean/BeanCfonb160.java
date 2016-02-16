package main.java.org.bankio.bean;

import java.util.ArrayList;
import java.util.List;

public class BeanCfonb160{
	
    private BeanCfonb160Sender sender;
    private List<BeanCfonb160Recipient> recipients = new ArrayList<BeanCfonb160Recipient>();
    private BeanCfonb160Total total;

    public void setEmetteur(BeanCfonb160Sender emetteur) {
        this.sender = emetteur;
    }

    public void setDestinataires(List<BeanCfonb160Recipient> destinataires) {
        this.recipients = destinataires;
    }

    public void setTotal(BeanCfonb160Total total) {
        this.total = total;
    }

    public BeanCfonb160Sender getEmetteur() {
        return sender;
    }

    public List<BeanCfonb160Recipient> getDestinataires() {
        return recipients;
    }

    public BeanCfonb160Total getTotal() {
        return total;
    }
}
