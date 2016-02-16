package test.java.org.bankio;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;
import main.java.org.bankio.bean.BeanCfonb120;
import main.java.org.bankio.bean.BeanCfonb120Additional;
import main.java.org.bankio.bean.BeanCfonb120Movement;
import main.java.org.bankio.bean.BeanCfonb120NewAmount;
import main.java.org.bankio.bean.BeanCfonb120OldAmount;

public class Cfonb120Test extends TestCase {
	
	private BeanCfonb120 beanCfonb120;
	
	@BeforeClass
	private void onceExecutedBeforeAll() {
		BeanCfonb120OldAmount beanCfonb120OldAmount = new BeanCfonb120OldAmount();
		beanCfonb120OldAmount.setTypeEnregistrementCode("01");
		
		List<BeanCfonb120Movement> beanCfonb120Movements = new ArrayList<BeanCfonb120Movement>();
		
		beanCfonb120Movements.add(generateMovements());		
		beanCfonb120Movements.add(generateMovements());
		
		BeanCfonb120NewAmount beanCfonb120NewAmount = new BeanCfonb120NewAmount();
		beanCfonb120NewAmount.setTypeEnregistrementCode("07");
		
		beanCfonb120.setOldAmount(beanCfonb120OldAmount);
		beanCfonb120.setMovements(beanCfonb120Movements);
		beanCfonb120.setNewAmount(beanCfonb120NewAmount);
	}

	private BeanCfonb120Movement generateMovements() {
		BeanCfonb120Movement beanCfonb120Movement = new BeanCfonb120Movement();
		beanCfonb120Movement.setTypeEnregistrementCode("04");
		beanCfonb120Movement.setAdditionals(generateAdditionals());
		return beanCfonb120Movement;
	}

	private List<BeanCfonb120Additional> generateAdditionals() {
		List<BeanCfonb120Additional> beanCfonb120Additionals = new ArrayList<BeanCfonb120Additional>();
		BeanCfonb120Additional beanCfonb120Additional = new BeanCfonb120Additional();
		beanCfonb120Additional.setTypeEnregistrementCode("05");
		beanCfonb120Additionals.add(beanCfonb120Additional);
		return beanCfonb120Additionals;
	}

	@Test
	private void cfonb120Test() {
		assertNotNull(beanCfonb120);
		assertNotNull(beanCfonb120.getMovements());
		assertNotNull(beanCfonb120.getNewAmount());
		assertNotNull(beanCfonb120.getOldAmount());
	}
	
	@Test
	private void MovementTest() {
		assertTrue(!beanCfonb120.getMovements().isEmpty());
		List<BeanCfonb120Movement> beanCfonb120Movements =beanCfonb120.getMovements();
		for (BeanCfonb120Movement beanCfonb120Movement : beanCfonb120Movements) {
			assertEquals(beanCfonb120Movement.getTypeEnregistrementCode(), "04");
		}
	}
	
	@Test
	private void AdditionalTest() {
		List<BeanCfonb120Movement> beanCfonb120Movements =beanCfonb120.getMovements();
		for (BeanCfonb120Movement beanCfonb120Movement : beanCfonb120Movements) {
			List<BeanCfonb120Additional> beanCfonb120Additionals = beanCfonb120Movement.getAdditionals();
			for (BeanCfonb120Additional beanCfonb120Additional : beanCfonb120Additionals) {
				assertEquals(beanCfonb120Additional.getTypeEnregistrementCode(), "05");
			}
		}
	}
	
	@Test
	private void oldAmountTest() {
		assertEquals(beanCfonb120.getOldAmount().getTypeEnregistrementCode(), "01");
	}
	
	@Test
	private void newAmountTest() {
		assertEquals(beanCfonb120.getOldAmount().getTypeEnregistrementCode(), "07");
	}
}
