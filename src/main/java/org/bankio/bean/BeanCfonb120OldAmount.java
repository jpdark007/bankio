package main.java.org.bankio.bean;

import java.util.Date;

public class BeanCfonb120OldAmount {

	private String typeEnregistrementCode;

	private String codeBanque;

	private String zone1;
	
	private String codeGuichet;

	private String devise;

	private String nbDecimal;

	private String zone2;
	
	private String numCompte;

	private String zone3;
	
	private Date soldeDate;

	private String zone4;
	
	private String soldeMontant;

	private String zone5;
	
	@Override
	public String toString() {
		return "BeanCfonb120OldAmount [typeEnregistrementCode=" + typeEnregistrementCode + ", codeBanque=" + codeBanque
				+ ", zone1=" + zone1 + ", codeGuichet=" + codeGuichet + ", devise=" + devise + ", nbDecimal="
				+ nbDecimal + ", zone2=" + zone2 + ", numCompte=" + numCompte + ", zone3=" + zone3 + ", soldeDate="
				+ soldeDate + ", zone4=" + zone4 + ", soldeMontant=" + soldeMontant + ", zone5=" + zone5 + "]";
	}
	
	public String getTypeEnregistrementCode() {
		return typeEnregistrementCode;
	}

	public void setTypeEnregistrementCode(String typeEnregistrementCode) {
		this.typeEnregistrementCode = typeEnregistrementCode;
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

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Date getSoldeDate() {
		return soldeDate;
	}

	public void setSoldeDate(Date soldeDate) {
		this.soldeDate = soldeDate;
	}

	public String getSoldeMontant() {
		return soldeMontant;
	}

	public void setSoldeMontant(String soldeMontant) {
		this.soldeMontant = soldeMontant;
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

	public String getZone4() {
		return zone4;
	}

	public void setZone4(String zone4) {
		this.zone4 = zone4;
	}

	public String getZone5() {
		return zone5;
	}

	public void setZone5(String zone5) {
		this.zone5 = zone5;
	}
}
