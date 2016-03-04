package test.java.org.bankio;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.beanio.BeanIOConfigurationException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import main.java.org.bankio.bean.BeanCfonb120;
import main.java.org.bankio.bean.BeanCfonb120Additional;
import main.java.org.bankio.bean.BeanCfonb120Movement;
import main.java.org.bankio.bean.BeanCfonb120NewAmount;
import main.java.org.bankio.bean.BeanCfonb120OldAmount;
import main.java.org.bankio.cfonb.ReaderCfonb;
import main.java.org.bankio.cfonb.WriterCfonb;

public class Cfonb120Test {
	
	private static  BeanCfonb120 beanCfonb120;
		
	private static String getRandomNum() {
		Random rand = new Random();
		return String.valueOf(rand.nextInt(500000000) + 1);
	}
	
	private static String getRandomAlphaNum() {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	}
	
	@BeforeClass
	public static  void onceExecutedBeforeAll() {
		BeanCfonb120OldAmount beanCfonb120OldAmount = new BeanCfonb120OldAmount();
		beanCfonb120OldAmount.setTypeEnregistrementCode("01");
		beanCfonb120OldAmount.setSoldeDate(new Date());
		beanCfonb120OldAmount.setNumCompte(getRandomAlphaNum());
		beanCfonb120OldAmount.setCodeBanque(getRandomNum());
		beanCfonb120OldAmount.setDevise(getRandomAlphaNum());
		beanCfonb120OldAmount.setCodeGuichet(getRandomNum());
		beanCfonb120OldAmount.setSoldeMontant(getRandomNum());
		beanCfonb120OldAmount.setNbDecimal("2");
			
		BeanCfonb120Movement beanCfonb120Movement = generateMovements(getRandomNum());
		BeanCfonb120Movement beanCfonb120Movement2 = generateMovements(getRandomNum());
		
		BeanCfonb120NewAmount beanCfonb120NewAmount = new BeanCfonb120NewAmount();
		beanCfonb120NewAmount.setTypeEnregistrementCode("07");
		beanCfonb120NewAmount.setSoldeDate(new Date());
		beanCfonb120NewAmount.setSoldeMontant(getRandomNum());
		beanCfonb120NewAmount.setNumCompte(getRandomAlphaNum());
		beanCfonb120NewAmount.setNbDecimal("2");
		beanCfonb120NewAmount.setCodeBanque(getRandomNum());
		beanCfonb120NewAmount.setDevise(getRandomAlphaNum());
		beanCfonb120NewAmount.setCodeGuichet(getRandomNum());
		
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
		beanCfonb120Movement.setOperationInterneCode(getRandomAlphaNum());
		beanCfonb120Movement.setMontantMvt(getRandomNum());
		beanCfonb120Movement.setOperationInterBancCode(getRandomNum());
		beanCfonb120Movement.setNumCompte(getRandomAlphaNum());
		beanCfonb120Movement.setNbDecimal("2");
		beanCfonb120Movement.setLibelle(getRandomAlphaNum());
		beanCfonb120Movement.setCodeGuichet(getRandomNum());
		beanCfonb120Movement.setNumEcriture(getRandomNum());
		return beanCfonb120Movement;
	}

	private static BeanCfonb120Additional generateAdditionals() {
		BeanCfonb120Additional beanCfonb120Additional = new BeanCfonb120Additional();
		beanCfonb120Additional.setTypeEnregistrementCode("05");
		beanCfonb120Additional.setOperationInterBancCode(getRandomNum());
		beanCfonb120Additional.setNumCompte(getRandomAlphaNum());
		beanCfonb120Additional.setNbDecimal("2");
		beanCfonb120Additional.setCodeBanque(getRandomNum());
		beanCfonb120Additional.setDevise(getRandomAlphaNum());
		beanCfonb120Additional.setQualifiantDetail(getRandomAlphaNum());
		beanCfonb120Additional.setLibelleDetail(getRandomAlphaNum());
		beanCfonb120Additional.setCodeGuichet(getRandomNum());
		beanCfonb120Additional.setOperationDate(new Date());
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
		assertTrue(beanCfonb120.getMovements().equals(beanCfonb120.getMovements()));
		assertEquals(beanCfonb120.getMovements().toString(), beanCfonb120.getMovements().toString());

		
		File output = WriterCfonb.setBeanCfonb120ToFile(beanCfonb120);
		assertTrue(output.exists());
		assertTrue(output.isFile());
		ReaderCfonb.getBeanCfonb120FromFile(output);
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
