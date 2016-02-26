package test.java.org.bankio;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.beanio.BeanIOConfigurationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import main.java.org.bankio.bean.BeanCfonb120;
import main.java.org.bankio.bean.BeanCfonb120Additional;
import main.java.org.bankio.bean.BeanCfonb120Movement;
import main.java.org.bankio.bean.BeanCfonb120NewAmount;
import main.java.org.bankio.bean.BeanCfonb120OldAmount;
import main.java.org.bankio.writer.WriterCfonb;

public class Cfonb120Test {
	
	private static BeanCfonb120 beanCfonb120;
	
	@BeforeClass
	public static  void onceExecutedBeforeAll() {
		BeanCfonb120OldAmount beanCfonb120OldAmount = new BeanCfonb120OldAmount();
		beanCfonb120OldAmount.setTypeEnregistrementCode("01");
			
		BeanCfonb120Movement beanCfonb120Movement = generateMovements("00010");
		BeanCfonb120Movement beanCfonb120Movement2 = generateMovements("00011");
		
		BeanCfonb120NewAmount beanCfonb120NewAmount = new BeanCfonb120NewAmount();
		beanCfonb120NewAmount.setTypeEnregistrementCode("07");
		
		beanCfonb120 = new BeanCfonb120();
		beanCfonb120.setOldAmount(beanCfonb120OldAmount);
		beanCfonb120.addMovement(beanCfonb120Movement.hashCode(), beanCfonb120Movement);
		beanCfonb120.addMovement(beanCfonb120Movement2.hashCode(), beanCfonb120Movement2);
		beanCfonb120.addAdditionnalToMovement(beanCfonb120Movement.hashCode(), generateAdditionals());
		beanCfonb120.addAdditionnalToMovement(beanCfonb120Movement2.hashCode(), generateAdditionals());

		beanCfonb120.setNewAmount(beanCfonb120NewAmount);
	}

	private static BeanCfonb120Movement generateMovements(String codeBanque) {
		BeanCfonb120Movement beanCfonb120Movement = new BeanCfonb120Movement();
		beanCfonb120Movement.setTypeEnregistrementCode("04");
		beanCfonb120Movement.setCodeBanque(codeBanque);
		beanCfonb120Movement.setOperationInterneCode("00000000000000000000000");
		return beanCfonb120Movement;
	}

	private static BeanCfonb120Additional generateAdditionals() {
		BeanCfonb120Additional beanCfonb120Additional = new BeanCfonb120Additional();
		beanCfonb120Additional.setTypeEnregistrementCode("05");
		return beanCfonb120Additional;
	}

	@Test
	public void testCfonb120() throws BeanIOConfigurationException, IOException {
		assertNotNull(beanCfonb120);
		assertNotNull(beanCfonb120.getMovements());
		assertNotNull(beanCfonb120.getNewAmount());
		assertNotNull(beanCfonb120.getOldAmount());
		assertTrue(beanCfonb120.equals(beanCfonb120));
		assertEquals(beanCfonb120.toString(), beanCfonb120.toString());
		
		File output = WriterCfonb.setBeanCfonb120ToFile(beanCfonb120);
		assertTrue(output.exists());
		assertTrue(output.isFile());
		assertTrue(output.delete());
	}
	
	@Test
	public void testMovement() {
		assertTrue(!beanCfonb120.getMovements().isEmpty());
		HashMap<Integer, BeanCfonb120Movement> beanCfonb120Movements = beanCfonb120.getMovements();
		for (BeanCfonb120Movement beanCfonb120Movement : beanCfonb120Movements.values()) {
			assertEquals("04", beanCfonb120Movement.getTypeEnregistrementCode());
		}
	}
	
	@Test
	public void testAdditional() {
		HashMap<Integer, BeanCfonb120Movement> beanCfonb120Movements =beanCfonb120.getMovements();
		for (BeanCfonb120Movement beanCfonb120Movement : beanCfonb120Movements.values()) {
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
