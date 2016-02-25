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
    


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((codeEnregistrement == null) ? 0 : codeEnregistrement.hashCode());
		result = prime * result + ((codeOperation == null) ? 0 : codeOperation.hashCode());
		result = prime * result
				+ ((destinataireCodeEtablissement == null) ? 0 : destinataireCodeEtablissement.hashCode());
		result = prime * result + ((destinataireCodeGuichet == null) ? 0 : destinataireCodeGuichet.hashCode());
		result = prime * result + ((destinataireNumeroCompte == null) ? 0 : destinataireNumeroCompte.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((libelleDomiciliation == null) ? 0 : libelleDomiciliation.hashCode());
		result = prime * result + ((montantVirement == null) ? 0 : montantVirement.hashCode());
		result = prime * result + ((nomDestinataire == null) ? 0 : nomDestinataire.hashCode());
		result = prime * result + ((numeroEmetteur == null) ? 0 : numeroEmetteur.hashCode());
		result = prime * result + ((recipientAdditional == null) ? 0 : recipientAdditional.hashCode());
		result = prime * result + ((referenceOperation == null) ? 0 : referenceOperation.hashCode());
		result = prime * result + ((reserve1 == null) ? 0 : reserve1.hashCode());
		result = prime * result + ((reserve2 == null) ? 0 : reserve2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanCfonb160Recipient other = (BeanCfonb160Recipient) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (codeEnregistrement == null) {
			if (other.codeEnregistrement != null)
				return false;
		} else if (!codeEnregistrement.equals(other.codeEnregistrement))
			return false;
		if (codeOperation == null) {
			if (other.codeOperation != null)
				return false;
		} else if (!codeOperation.equals(other.codeOperation))
			return false;
		if (destinataireCodeEtablissement == null) {
			if (other.destinataireCodeEtablissement != null)
				return false;
		} else if (!destinataireCodeEtablissement.equals(other.destinataireCodeEtablissement))
			return false;
		if (destinataireCodeGuichet == null) {
			if (other.destinataireCodeGuichet != null)
				return false;
		} else if (!destinataireCodeGuichet.equals(other.destinataireCodeGuichet))
			return false;
		if (destinataireNumeroCompte == null) {
			if (other.destinataireNumeroCompte != null)
				return false;
		} else if (!destinataireNumeroCompte.equals(other.destinataireNumeroCompte))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (libelleDomiciliation == null) {
			if (other.libelleDomiciliation != null)
				return false;
		} else if (!libelleDomiciliation.equals(other.libelleDomiciliation))
			return false;
		if (montantVirement == null) {
			if (other.montantVirement != null)
				return false;
		} else if (!montantVirement.equals(other.montantVirement))
			return false;
		if (nomDestinataire == null) {
			if (other.nomDestinataire != null)
				return false;
		} else if (!nomDestinataire.equals(other.nomDestinataire))
			return false;
		if (numeroEmetteur == null) {
			if (other.numeroEmetteur != null)
				return false;
		} else if (!numeroEmetteur.equals(other.numeroEmetteur))
			return false;
		if (recipientAdditional == null) {
			if (other.recipientAdditional != null)
				return false;
		} else if (!recipientAdditional.equals(other.recipientAdditional))
			return false;
		if (referenceOperation == null) {
			if (other.referenceOperation != null)
				return false;
		} else if (!referenceOperation.equals(other.referenceOperation))
			return false;
		if (reserve1 == null) {
			if (other.reserve1 != null)
				return false;
		} else if (!reserve1.equals(other.reserve1))
			return false;
		if (reserve2 == null) {
			if (other.reserve2 != null)
				return false;
		} else if (!reserve2.equals(other.reserve2))
			return false;
		return true;
	}

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
