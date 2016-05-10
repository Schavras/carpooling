package types.tests;

import org.junit.Assert;
import org.junit.Test;

import types.Email;

public class EmailTest {

	@Test
	public void testDefault() {
		Email email = new Email();
		Assert.assertEquals(email.getFullEmailAdress(), "");
		
	}
	
	@Test
	public void testConstractor(){
		Email email = new Email("abc");
		Assert.assertEquals(email.getFullEmailAdress(), "abc");
	}

}
