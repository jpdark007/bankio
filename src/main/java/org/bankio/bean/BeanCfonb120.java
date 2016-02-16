package main.java.org.bankio.bean;

import java.util.ArrayList;
import java.util.List;

public class BeanCfonb120{
	
    private BeanCfonb120OldAmount oldAmount;
    private List<BeanCfonb120Movement> movements = new ArrayList<BeanCfonb120Movement>();
    private BeanCfonb120NewAmount  newAmount;
    
	public BeanCfonb120OldAmount getOldAmount() {
		return oldAmount;
	}
	public void setOldAmount(BeanCfonb120OldAmount oldAmount) {
		this.oldAmount = oldAmount;
	}
	public List<BeanCfonb120Movement> getMovements() {
		return movements;
	}
	public void setMovements(List<BeanCfonb120Movement> movements) {
		this.movements = movements;
	}
	public BeanCfonb120NewAmount getNewAmount() {
		return newAmount;
	}
	public void setNewAmount(BeanCfonb120NewAmount newAmount) {
		this.newAmount = newAmount;
	}
    
}
