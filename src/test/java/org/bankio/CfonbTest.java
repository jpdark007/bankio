package test.java.org.bankio;

import java.util.Random;

public abstract class CfonbTest {
	protected static String getRandomNum() {
		Random rand = new Random();
		return String.valueOf(rand.nextInt(500000000) + 1);
	}
	
	protected static String getRandomAlphaNum() {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	}
}
