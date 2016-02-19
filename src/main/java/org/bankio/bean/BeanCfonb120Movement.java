package main.java.org.bankio.bean;

import java.util.ArrayList;
import java.util.List;

public class BeanCfonb120Movement {

	private String typeEnregistrementCode;

	private String codeBanque;

	private String operationInterneCode;

	private String codeGuichet;

	private String devise;

	private String nbDecimal;

	private String zone1;

	private String numCompte;

	private String operationInterBancCode;

	private String operationDate;

	private String rejetMotifCode;

	private String valeurDate;

	private String libelle;

	private String zone2;

	private String numEcriture;

	private String indiceExoneration;

	private String indiceIndispo;

	private String montantMvt;

	private String zone3;
	
    private List<BeanCfonb120Additional> additionals = new ArrayList<BeanCfonb120Additional>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionals == null) ? 0 : additionals.hashCode());
		result = prime * result + ((codeBanque == null) ? 0 : codeBanque.hashCode());
		result = prime * result + ((codeGuichet == null) ? 0 : codeGuichet.hashCode());
		result = prime * result + ((devise == null) ? 0 : devise.hashCode());
		result = prime * result + ((indiceExoneration == null) ? 0 : indiceExoneration.hashCode());
		result = prime * result + ((indiceIndispo == null) ? 0 : indiceIndispo.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((montantMvt == null) ? 0 : montantMvt.hashCode());
		result = prime * result + ((nbDecimal == null) ? 0 : nbDecimal.hashCode());
		result = prime * result + ((numCompte == null) ? 0 : numCompte.hashCode());
		result = prime * result + ((numEcriture == null) ? 0 : numEcriture.hashCode());
		result = prime * result + ((operationDate == null) ? 0 : operationDate.hashCode());
		result = prime * result + ((operationInterBancCode == null) ? 0 : operationInterBancCode.hashCode());
		result = prime * result + ((operationInterneCode == null) ? 0 : operationInterneCode.hashCode());
		result = prime * result + ((rejetMotifCode == null) ? 0 : rejetMotifCode.hashCode());
		result = prime * result + ((typeEnregistrementCode == null) ? 0 : typeEnregistrementCode.hashCode());
		result = prime * result + ((valeurDate == null) ? 0 : valeurDate.hashCode());
		result = prime * result + ((zone1 == null) ? 0 : zone1.hashCode());
		result = prime * result + ((zone2 == null) ? 0 : zone2.hashCode());
		result = prime * result + ((zone3 == null) ? 0 : zone3.hashCode());
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
		BeanCfonb120Movement other = (BeanCfonb120Movement) obj;
		if (additionals == null) {
			if (other.additionals != null)
				return false;
		} else if (!additionals.equals(other.additionals))
			return false;
		if (codeBanque == null) {
			if (other.codeBanque != null)
				return false;
		} else if (!codeBanque.equals(other.codeBanque))
			return false;
		if (codeGuichet == null) {
			if (other.codeGuichet != null)
				return false;
		} else if (!codeGuichet.equals(other.codeGuichet))
			return false;
		if (devise == null) {
			if (other.devise != null)
				return false;
		} else if (!devise.equals(other.devise))
			return false;
		if (indiceExoneration == null) {
			if (other.indiceExoneration != null)
				return false;
		} else if (!indiceExoneration.equals(other.indiceExoneration))
			return false;
		if (indiceIndispo == null) {
			if (other.indiceIndispo != null)
				return false;
		} else if (!indiceIndispo.equals(other.indiceIndispo))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (montantMvt == null) {
			if (other.montantMvt != null)
				return false;
		} else if (!montantMvt.equals(other.montantMvt))
			return false;
		if (nbDecimal == null) {
			if (other.nbDecimal != null)
				return false;
		} else if (!nbDecimal.equals(other.nbDecimal))
			return false;
		if (numCompte == null) {
			if (other.numCompte != null)
				return false;
		} else if (!numCompte.equals(other.numCompte))
			return false;
		if (numEcriture == null) {
			if (other.numEcriture != null)
				return false;
		} else if (!numEcriture.equals(other.numEcriture))
			return false;
		if (operationDate == null) {
			if (other.operationDate != null)
				return false;
		} else if (!operationDate.equals(other.operationDate))
			return false;
		if (operationInterBancCode == null) {
			if (other.operationInterBancCode != null)
				return false;
		} else if (!operationInterBancCode.equals(other.operationInterBancCode))
			return false;
		if (operationInterneCode == null) {
			if (other.operationInterneCode != null)
				return false;
		} else if (!operationInterneCode.equals(other.operationInterneCode))
			return false;
		if (rejetMotifCode == null) {
			if (other.rejetMotifCode != null)
				return false;
		} else if (!rejetMotifCode.equals(other.rejetMotifCode))
			return false;
		if (typeEnregistrementCode == null) {
			if (other.typeEnregistrementCode != null)
				return false;
		} else if (!typeEnregistrementCode.equals(other.typeEnregistrementCode))
			return false;
		if (valeurDate == null) {
			if (other.valeurDate != null)
				return false;
		} else if (!valeurDate.equals(other.valeurDate))
			return false;
		if (zone1 == null) {
			if (other.zone1 != null)
				return false;
		} else if (!zone1.equals(other.zone1))
			return false;
		if (zone2 == null) {
			if (other.zone2 != null)
				return false;
		} else if (!zone2.equals(other.zone2))
			return false;
		if (zone3 == null) {
			if (other.zone3 != null)
				return false;
		} else if (!zone3.equals(other.zone3))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BeanCfonb120Movement [typeEnregistrementCode=" + typeEnregistrementCode + ", codeBanque=" + codeBanque
				+ ", operationInterneCode=" + operationInterneCode + ", codeGuichet=" + codeGuichet + ", devise="
				+ devise + ", nbDecimal=" + nbDecimal + ", zone1=" + zone1 + ", numCompte=" + numCompte
				+ ", operationInterBancCode=" + operationInterBancCode + ", operationDate=" + operationDate
				+ ", rejetMotifCode=" + rejetMotifCode + ", valeurDate=" + valeurDate + ", libelle=" + libelle
				+ ", zone2=" + zone2 + ", numEcriture=" + numEcriture + ", indiceExoneration=" + indiceExoneration
				+ ", indiceIndispo=" + indiceIndispo + ", montantMvt=" + montantMvt + ", zone3=" + zone3
				+ ", additionals=" + additionals + "]";
	}

	public void addAdditionnal(BeanCfonb120Additional beanCfonb120Additional) {
		this.additionals.add(beanCfonb120Additional);
	}
	
	public String getTypeEnregistrementCode() {
		return typeEnregistrementCode;
	}

	public void setTypeEnregistrementCode(String typeEnregistrementCode) {
		this.typeEnregistrementCode = typeEnregistrementCode;
	}

	public String getOperationInterneCode() {
		return operationInterneCode;
	}

	public void setOperationInterneCode(String operationInterneCode) {
		this.operationInterneCode = operationInterneCode;
	}

	public String getCodeBanque() {
		return codeBanque;
	}

	public void setCodeBanque(String codeBanque) {
		this.codeBanque = codeBanque;
	}

	public String getCodeGuichet() {
		return codeGuichet;
	}

	public void setCodeGuichet(String codeGuichet) {
		this.codeGuichet = codeGuichet;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public String getNbDecimal() {
		return nbDecimal;
	}

	public void setNbDecimal(String nbDecimal) {
		this.nbDecimal = nbDecimal;
	}

	public String getOperationInterBancCode() {
		return operationInterBancCode;
	}

	public void setOperationInterBancCode(String operationInterBancCode) {
		this.operationInterBancCode = operationInterBancCode;
	}

	public String getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	public String getRejetMotifCode() {
		return rejetMotifCode;
	}

	public void setRejetMotifCode(String rejetMotifCode) {
		this.rejetMotifCode = rejetMotifCode;
	}

	public String getValeurDate() {
		return valeurDate;
	}

	public void setValeurDate(String valeurDate) {
		this.valeurDate = valeurDate;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNumEcriture() {
		return numEcriture;
	}

	public void setNumEcriture(String numEcriture) {
		this.numEcriture = numEcriture;
	}

	public String getIndiceExoneration() {
		return indiceExoneration;
	}

	public void setIndiceExoneration(String indiceExoneration) {
		this.indiceExoneration = indiceExoneration;
	}

	public String getIndiceIndispo() {
		return indiceIndispo;
	}

	public void setIndiceIndispo(String indiceIndispo) {
		this.indiceIndispo = indiceIndispo;
	}

	public String getMontantMvt() {
		return montantMvt;
	}

	public void setMontantMvt(String montantMvt) {
		this.montantMvt = montantMvt;
	}
	
	public String getZone1() {
		return zone1;
	}

	public void setZone1(String zone1) {
		this.zone1 = zone1;
	}

	public String getZone2() {
		return zone2;
	}

	public void setZone2(String zone2) {
		this.zone2 = zone2;
	}

	public String getZone3() {
		return zone3;
	}

	public void setZone3(String zone3) {
		this.zone3 = zone3;
	}

	public List<BeanCfonb120Additional> getAdditionals() {
		return additionals;
	}

	public void setAdditionals(List<BeanCfonb120Additional> additionals) {
		this.additionals = additionals;
	}
}
