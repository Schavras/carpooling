package util.encryption.Tests;

import org.junit.*;

import util.encryption.Encryption;
import util.encryption.ReverseEncryption;


public class encryptionTest {


	

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testDefault() {
		Encryption testObject = new ReverseEncryption();
	}
	


	@Test
	public void testStringEncyprion() {
		Encryption testObject = new ReverseEncryption();
		String temp="";
		temp = testObject.encrypt("abc", 0);
		Assert.assertEquals("cba", temp);
		
	}
	
	@Test
	public void testIntEncyprion() {
		Encryption testObject = new ReverseEncryption();
		int temp=0;
		temp = testObject.encrypt(5, 0);
		Assert.assertEquals(5, temp);
		
	}
	



}
