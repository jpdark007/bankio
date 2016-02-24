package main.java.org.bankio.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BeanCfonb160RecipientAdditional {

	private String codeEnregistrement ="07";

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

    public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
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

	public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
}
