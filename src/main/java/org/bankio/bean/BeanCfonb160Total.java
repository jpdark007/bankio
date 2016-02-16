package main.java.org.bankio.bean;

import java.math.BigDecimal;

public class BeanCfonb160Total {
	
    String codeEnregistrement="08";

    String codeOperation;

    String reserve1;

    String numeroEmetteur;

    String reserve2;

    BigDecimal montantTotalRemise;

    String reserve3;

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

    public BigDecimal getMontantTotalRemise() {
        return montantTotalRemise;
    }

    public void setMontantTotalRemise(BigDecimal montantTotalRemise) {
        this.montantTotalRemise = montantTotalRemise;
    }
}
