package main.java.org.bankio.bean;

import java.util.HashMap;

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
}
