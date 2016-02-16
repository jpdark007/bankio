package test.java.org.bankio;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import main.java.org.bankio.bean.BeanCfonb120;
import main.java.org.bankio.bean.BeanCfonb120Additional;
import main.java.org.bankio.bean.BeanCfonb120Movement;
import main.java.org.bankio.bean.BeanCfonb120NewAmount;
import main.java.org.bankio.bean.BeanCfonb120OldAmount;

public class Cfonb120Test {
	
	private static BeanCfonb120 beanCfonb120;
	
	@BeforeClass
	public static  void onceExecutedBeforeAll() {
		BeanCfonb120OldAmount beanCfonb120OldAmount = new BeanCfonb120OldAmount();
		beanCfonb120OldAmount.setTypeEnregistrementCode("01");
		
		List<BeanCfonb120Movement> beanCfonb120Movements = new ArrayList<BeanCfonb120Movement>();
		
		beanCfonb120Movements.add(generateMovements());		
		beanCfonb120Movements.add(generateMovements());
		
		BeanCfonb120NewAmount beanCfonb120NewAmount = new BeanCfonb120NewAmount();
		beanCfonb120NewAmount.setTypeEnregistrementCode("07");
		
		beanCfonb120 = new BeanCfonb120();
		beanCfonb120.setOldAmount(beanCfonb120OldAmount);
		beanCfonb120.setMovements(beanCfonb120Movements);
		beanCfonb120.setNewAmount(beanCfonb120NewAmount);
	}

	private static BeanCfonb120Movement generateMovements() {
		BeanCfonb120Movement beanCfonb120Movement = new BeanCfonb120Movement();
		beanCfonb120Movement.setTypeEnregistrementCode("04");
		beanCfonb120Movement.setAdditionals(generateAdditionals());
		return beanCfonb120Movement;
	}

	private static List<BeanCfonb120Additional> generateAdditionals() {
		List<BeanCfonb120Additional> beanCfonb120Additionals = new ArrayList<BeanCfonb120Additional>();
		BeanCfonb120Additional beanCfonb120Additional = new BeanCfonb120Additional();
		beanCfonb120Additional.setTypeEnregistrementCode("05");
		beanCfonb120Additionals.add(beanCfonb120Additional);
		return beanCfonb120Additionals;
	}

	@Test
	public void testCfonb120() {
		assertNotNull(beanCfonb120);
		assertNotNull(beanCfonb120.getMovements());
		assertNotNull(beanCfonb120.getNewAmount());
		assertNotNull(beanCfonb120.getOldAmount());
	}
	
	@Test
	public void testMovement() {
		assertTrue(!beanCfonb120.getMovements().isEmpty());
		List<BeanCfonb120Movement> beanCfonb120Movements =beanCfonb120.getMovements();
		for (BeanCfonb120Movement beanCfonb120Movement : beanCfonb120Movements) {
			assertEquals("04", beanCfonb120Movement.getTypeEnregistrementCode());
		}
	}
	
	@Test
	public void testAdditional() {
		List<BeanCfonb120Movement> beanCfonb120Movements =beanCfonb120.getMovements();
		for (BeanCfonb120Movement beanCfonb120Movement : beanCfonb120Movements) {
			List<BeanCfonb120Additional> beanCfonb120Additionals = beanCfonb120Movement.getAdditionals();
			for (BeanCfonb120Additional beanCfonb120Additional : beanCfonb120Additionals) {
				assertEquals("05", beanCfonb120Additional.getTypeEnregistrementCode());
			}
		}
	}
	
	@Test
	public void testOldAmount() {
		assertEquals("01", beanCfonb120.getOldAmount().getTypeEnregistrementCode());
	}
	
	@Test
	public void testNewAmount() {
		assertEquals("07", beanCfonb120.getNewAmount().getTypeEnregistrementCode());
	}
}
