package main.java.org.bankio.bean;

import java.util.ArrayList;
import java.util.List;

public class BeanCFONBRemise{
	
    private BeanCFONBEmetteur emetteur;
    private List<BeanCFONBDestinataire> destinataires = new ArrayList<BeanCFONBDestinataire>();
    private BeanCFONBTotal total;

    public void setEmetteur(BeanCFONBEmetteur emetteur) {
        this.emetteur = emetteur;
    }

    public void setDestinataires(List<BeanCFONBDestinataire> destinataires) {
        this.destinataires = destinataires;
    }

    public void setTotal(BeanCFONBTotal total) {
        this.total = total;
    }

    public BeanCFONBEmetteur getEmetteur() {
        return emetteur;
    }

    public List<BeanCFONBDestinataire> getDestinataires() {
        return destinataires;
    }

    public BeanCFONBTotal getTotal() {
        return total;
    }
}
