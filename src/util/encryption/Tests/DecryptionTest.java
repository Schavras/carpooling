package util.encryption.Tests;

import org.junit.*;

import util.encryption.Decryption;
import util.encryption.ReverseDecryption;


public class DecryptionTest {


	

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testDefault() {
		@SuppressWarnings("unused")
		Decryption testObject = new ReverseDecryption();
	}
	

	
	@Test
	public void testStringEncyprion() {
		Decryption testObject = new ReverseDecryption();
		String temp="";
		temp = testObject.decrypt("cba", 0);
		Assert.assertEquals("abc", temp);
		
	}
	
	@Test
	public void testIntEncyprion() {
		Decryption testObject = new ReverseDecryption();
		int temp=0;
		temp = testObject.decrypt(5, 0);
		Assert.assertEquals(5, temp);
		
	}
	



}
