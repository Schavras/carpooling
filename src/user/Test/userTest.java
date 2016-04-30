package user.Test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import types.CreditCard;
import types.Email;
import types.Password;
import user.User;

public class userTest {
	

	

	@Test
	public void testDeafult() {
		User user = new User();
	}
	
	public void testFullConstractor(){
		Password pass = new Password("abc");
		Email email = new Email("def");
		CreditCard cd = new CreditCard(5,"gh");
		
		User user = new User(1,"abc","dfg", email , pass , 5 , cd , true , true );
		
	}

}
