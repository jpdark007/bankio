package main.java.org.bankio.bean;

import java.util.Date;

public class BeanCFONBEmetteur {
    String codeEnregistrement="03";

    String codeOperation;

    String reserve1;

    String numeroEmetteur;

    String reserve2;

    String reserve3;

    Date dateReglement;

    String nomRemettant;

    String referenceRemiseClient;

    String reserve4;

    String reserve5;

    String indiceMonnaieOrigine;

    String reserve6;

    String emetteurCodeGuichet;

    String emetteurNumeroCompte;

    String reserve7;

    String reserve8;

    String emetteurCodeEtablissement;

    String reserve9;

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

    public Date getDateReglement() {
        return dateReglement;
    }

    public void setDateReglement(Date dateReglement) {
        this.dateReglement = dateReglement;
    }

    public String getNomRemettant() {
        return nomRemettant;
    }

    public void setNomRemettant(String nomRemettant) {
        this.nomRemettant = nomRemettant;
    }

    public String getReferenceRemiseClient() {
        return referenceRemiseClient;
    }

    public void setReferenceRemiseClient(String referenceRemiseClient) {
        this.referenceRemiseClient = referenceRemiseClient;
    }

    public String getIndiceMonnaieOrigine() {
        return indiceMonnaieOrigine;
    }

    public void setIndiceMonnaieOrigine(String indiceMonnaieOrigine) {
        this.indiceMonnaieOrigine = indiceMonnaieOrigine;
    }

    public String getEmetteurCodeGuichet() {
        return emetteurCodeGuichet;
    }

    public void setEmetteurCodeGuichet(String emetteurCodeGuichet) {
        this.emetteurCodeGuichet = emetteurCodeGuichet;
    }

    public String getEmetteurNumeroCompte() {
        return emetteurNumeroCompte;
    }

    public void setEmetteurNumeroCompte(String emetteurNumeroCompte) {
        this.emetteurNumeroCompte = emetteurNumeroCompte;
    }

    public String getEmetteurCodeEtablissement() {
        return emetteurCodeEtablissement;
    }

    public void setEmetteurCodeEtablissement(String emetteurCodeEtablissement) {
        this.emetteurCodeEtablissement = emetteurCodeEtablissement;
    }
}
