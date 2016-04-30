package types.tests;

import org.junit.Assert;
import org.junit.Test;

import types.Password;

public class PasswordTest {

	@Test
	public void testDefault() {
		Password pass = new Password();
		Assert.assertEquals(pass.getPassword(), "" );
		
	}
	
	@Test
	public void testConstractor(){
		Password pass = new Password("abc");
		Assert.assertEquals(pass.getPassword(), "abc");
	}
	
	@Test
	public void testEncryptedPassword(){
		Password pass = new Password("abc");
		Assert.assertEquals(pass.getRawPassword(), "cba");
	}
}
