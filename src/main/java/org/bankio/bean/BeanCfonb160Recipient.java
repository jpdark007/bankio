package main.java.org.bankio.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BeanCfonb160Recipient {
    String codeEnregistrement="06";

    String codeOperation;

    String reserve1;

    String numeroEmetteur;

    String referenceOperation;

    String nomDestinataire;

    String libelleDomiciliation;

    String codeNatureVirement;

    String codePays;

    String reserve2;

    String destinataireCodeGuichet;

    String destinataireNumeroCompte;

    BigDecimal montantVirement;

    String libelle;

    String destinataireCodeEtablissement;

    String reserve3;

    private String iban;
    
    private List<BeanCfonb160Recipient> recipients = new ArrayList<BeanCfonb160Recipient>();

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
    public String getCodeEnregistrement() {
        return codeEnregistrement;
    }

    public void setCodeEnregistrement(String codeEnregistrement) {
        this.codeEnregistrement = codeEnregistrement;
    }

    public String getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(String codeOperation) {
        this.codeOperation = codeOperation;
    }

    public String getNumeroEmetteur() {
        return numeroEmetteur;
    }

    public void setNumeroEmetteur(String numeroEmetteur) {
        this.numeroEmetteur = numeroEmetteur;
    }

    public String getReferenceOperation() {
        return referenceOperation;
    }

    public void setReferenceOperation(String referenceOperation) {
        this.referenceOperation = referenceOperation;
    }

    public String getNomDestinataire() {
        return nomDestinataire;
    }

    public void setNomDestinataire(String nomDestinataire) {
        this.nomDestinataire = nomDestinataire;
    }

    public String getLibelleDomiciliation() {
        return libelleDomiciliation;
    }

    public void setLibelleDomiciliation(String libelleDomiciliation) {
        this.libelleDomiciliation = libelleDomiciliation;
    }

    public String getCodeNatureVirement() {
        return codeNatureVirement;
    }

    public void setCodeNatureVirement(String codeNatureVirement) {
        this.codeNatureVirement = codeNatureVirement;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public String getDestinataireCodeGuichet() {
        return destinataireCodeGuichet;
    }

    public void setDestinataireCodeGuichet(String destinataireCodeGuichet) {
        this.destinataireCodeGuichet = destinataireCodeGuichet;
    }

    public String getDestinataireNumeroCompte() {
        return destinataireNumeroCompte;
    }

    public void setDestinataireNumeroCompte(String destinataireNumeroCompte) {
        this.destinataireNumeroCompte = destinataireNumeroCompte;
    }

    public BigDecimal getMontantVirement() {
        return montantVirement;
    }

    public void setMontantVirement(BigDecimal montantVirement) {
        this.montantVirement = montantVirement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDestinataireCodeEtablissement() {
        return destinataireCodeEtablissement;
    }

    public void setDestinataireCodeEtablissement(String destinataireCodeEtablissement) {
        this.destinataireCodeEtablissement = destinataireCodeEtablissement;
    }

	public List<BeanCfonb160Recipient> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<BeanCfonb160Recipient> recipients) {
		this.recipients = recipients;
	}
}
