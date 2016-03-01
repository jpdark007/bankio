package main.java.org.bankio.bean;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BeanCfonb120{
	
    private BeanCfonb120OldAmount oldAmount;
    private HashMap<Integer, BeanCfonb120Movement> movements = new HashMap<Integer, BeanCfonb120Movement>();
    private BeanCfonb120NewAmount  newAmount;
    
	@Override
	public String toString() {
		return "BeanCfonb120 [oldAmount=" + oldAmount + ", movements=" + movements + ", newAmount=" + newAmount + "]";
	}
	
	public BeanCfonb120OldAmount getOldAmount() {
		return oldAmount;
	}
	public void setOldAmount(BeanCfonb120OldAmount oldAmount) {
		this.oldAmount = oldAmount;
	}
	
	public HashMap<Integer, BeanCfonb120Movement> getMovements() {
		return movements;
	}
	public void setMovements(HashMap<Integer, BeanCfonb120Movement> movements) {
		this.movements = movements;
	}
	
	public void addMovement(int hash, BeanCfonb120Movement movement) {
		this.movements.put(hash, movement);
	}
	
	public void addAdditionnalToMovement(int hash, BeanCfonb120Additional beanCfonb120Additional) {
		this.movements.get(hash).addAdditionnal(beanCfonb120Additional);
	}
	
	public BeanCfonb120NewAmount getNewAmount() {
		return newAmount;
	}
	public void setNewAmount(BeanCfonb120NewAmount newAmount) {
		this.newAmount = newAmount;
	}
	
	/**
	 * Le montant du mouvement est cadré à droite, complété à gauche par des zéros; le
	 * montant étant signé, le signe est superposé au dernier caractère à droite.
	 * La valeur hexadécimale dans cette position est :
	 * - pour un montant créditeur "C0" à "C9" pour + 0 à + 9 } fichiers en EBCDIC
	 * - pour un montant débiteur "D0" à "D9" pour - 0 à - 9 }
	 * - pour un montant créditeur "7B" et "41" à "49" pour + 0 à + 9 } fichiers en ASCII
	 * - pour un montant débiteur "7D" et "4A" à "52" pour - 0 à - 9 }
	 * @param amount
	 * @param nbDecimal
	 * @return
	 */
	public Double convertCfonb120Amount(final String amount, final String nbDecimal) {
		   final Map<String, String>convertMap;

		   convertMap = new HashMap<String, String>();
		   convertMap.put("7D", "-0.1");
		   convertMap.put("4A", "-1");
		   convertMap.put("4B", "-2");
		   convertMap.put("4C", "-3");
		   convertMap.put("4D", "-4");
		   convertMap.put("4E", "-5");
		   convertMap.put("4F", "-6");
		   convertMap.put("50", "-7");
		   convertMap.put("51", "-8");
		   convertMap.put("52", "-9");
		   convertMap.put("7B", "0.1");
		   convertMap.put("41", "1");
		   convertMap.put("42", "2");
		   convertMap.put("43", "3");
		   convertMap.put("44", "4");
		   convertMap.put("45", "5");
		   convertMap.put("46", "6");
		   convertMap.put("47", "7");
		   convertMap.put("48", "8");
		   convertMap.put("49", "9");
		   
		   char lastChar = amount.charAt(amount.length()-1);
		   String asciiValue = Integer.toHexString((int) lastChar);
		   Double amountFinal = new Double(0);
				   
		   if (null != convertMap.get(asciiValue)) {
			   BigDecimal signatureAmount = new BigDecimal(convertMap.get(asciiValue));
				amountFinal = Double.parseDouble(amount.substring(0, amount.length() - 1) + signatureAmount.abs().intValue());
			   amountFinal = signatureAmount.signum() * amountFinal;
		   }else {
			   amountFinal = Double.parseDouble(amount);
		   }

		   amountFinal = amountFinal / (Math.pow(10, Integer.parseInt(nbDecimal)));
			
			return amountFinal;
	}
}
