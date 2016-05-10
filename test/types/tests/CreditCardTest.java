package types.tests;

import org.junit.Assert;
import org.junit.Test;

import types.CreditCard;

public class CreditCardTest {

	@Test
	public void testDefault() {
		CreditCard cd = new CreditCard();
		Assert.assertEquals(cd.getcNumber(), 0);
		Assert.assertEquals(cd.getBank(), "");
		
	}
	
	@Test
	public void testConstractor(){
		CreditCard cd = new CreditCard(15,"abc");
		Assert.assertEquals(cd.getcNumber(), 15);
		Assert.assertEquals(cd.getBank(), "abc");
	}

}
