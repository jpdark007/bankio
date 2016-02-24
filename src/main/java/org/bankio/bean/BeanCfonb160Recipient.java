package main.java.org.bankio.bean;

import java.math.BigDecimal;

public class BeanCfonb160Recipient {

	private String codeEnregistrement ="06";

	private String codeOperation;

	private String reserve1;

	private String numeroEmetteur;

	private String referenceOperation;

	private String nomDestinataire;

	private String libelleDomiciliation;

	private String balance;

	private String destinataireCodeGuichet;

	private String destinataireNumeroCompte;

	private BigDecimal montantVirement;

	private String libelle;

	private String destinataireCodeEtablissement;

	private String reserve2;
	
	private BeanCfonb160RecipientAdditional recipientAdditional;
    
    public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getReserve3() {
		return reserve2;
	}

	public void setReserve3(String reserve3) {
		this.reserve2 = reserve3;
	}

	public BeanCfonb160RecipientAdditional getRecipient() {
		return recipient;
	}

	public void setRecipient(BeanCfonb160RecipientAdditional recipient) {
		this.recipient = recipient;
	}

	private BeanCfonb160RecipientAdditional recipient;

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
        return balance;
    }

    public void setCodeNatureVirement(String codeNatureVirement) {
        this.balance = codeNatureVirement;
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

	public BeanCfonb160RecipientAdditional getRecipientAdditional() {
		return recipientAdditional;
	}

	public void setRecipientAdditional(BeanCfonb160RecipientAdditional recipientAdditional) {
		this.recipientAdditional = recipientAdditional;
	}
}
