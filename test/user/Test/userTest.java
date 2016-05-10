package user.Test;


import org.junit.Test;

import types.CreditCard;
import types.Email;
import types.Password;
import user.User;

public class userTest {
	

	

	@Test
	public void testDeafult() {
		@SuppressWarnings("unused")
		User user = new User();
	}
	
	@Test
	public void testFullConstractor(){
		Password pass = new Password("abc");
		Email email = new Email("def");
		CreditCard cd = new CreditCard(5,"gh");
		@SuppressWarnings("unused")
		User user = new User(1,"abc","dfg", email , pass , 5 , cd , true  );
		
	}
	
	@Test
	public void testMinConstractor(){
		Password pass = new Password("abc");
		Email email = new Email("def");
		@SuppressWarnings("unused")
		User user = new User(0, "a", "b", email, pass, true);
		
	}
	
	@Test
	public void testSetters(){
		User user = new User();
		user.setAge(0);
		user.setCredit(new CreditCard());
		user.setEmail(new Email());
		user.setId(0);
		user.setName("abc");
		user.setSurname("dfg");
		user.setValid(true);
	}
	
	@Test
	public void testGetters(){
		User user = new User();
		user.getAge();
		user.getCredit();
		user.getEmail();
		user.getId();
		user.getName();
		user.getSurname();
		user.getPassword();
	}
	
	@Test
	public void testHashCode(){
		Password pass = new Password("abc");
		Email email = new Email("def");
		CreditCard cd = new CreditCard(5,"gh");
		@SuppressWarnings("unused")
		User user = new User(1,"abc","dfg", email , pass , 5 , cd , true  );
		
		int hash = user.hashCode();
	}

}
