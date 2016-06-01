package service;

import memorydao.UserMemoryDAOStub;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import service.interfaces.SignUpService;

public class SignUpTest {

	UserMemoryDAOStub mem;
	SignUpService su;
	SignUpServiceImp sq;
	
	long id;
	String name;
	String surname;
	String email;
	String password;
	int age;
	String ccNumber;
	String ccBank;

	boolean result;
	
	 
	@Before
	public void setUp() throws Exception {
		mem = new UserMemoryDAOStub();
		su = new SignUpServiceImp(mem);
		sq=new SignUpServiceImp();
		name = "name";
		surname = "surname";
		email = "new@email";
		password = "password";
		age = 20;
		ccNumber = "123";
		ccBank = "bank";
	}

	@Test
	public void successSignUpTest() {
		result = su.newUser(name, surname, email, password, age, ccNumber, ccBank);
		Assert.assertTrue(result);
				
	}
	
	@Test
	public void existingUser(){
		email = "stavros.z@hotmail.com";
		result = su.newUser(name, surname, email, password, age, ccNumber, ccBank);
		Assert.assertFalse(result);
	}
	 
	@Test
	public void ExceptionTest(){
		ccNumber = "123a";
		result = su.newUser(name, surname, email, password, age, ccNumber, ccBank);
		Assert.assertFalse(result);
	}

}
