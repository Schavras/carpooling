package memorydao;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domain.User;
import types.CreditCard;
import types.Email;
import types.Password;




public class UserDAOTest { 
	
	private UserMemoryDAO sample;  
	
	 @Before 
	 public void loadBaseTest() {                
	    	MemoryInitializer base = new MemoryInitializer();
	    	base.initialize();
	        sample = new UserMemoryDAO();  
	        
	    }
	  
	 @Test
	 public void addNewUserTest(){
		 User fresh=new User(12,"Nikos","Papas", new Email("nikospapass@"), new Password("123321"), 21, new CreditCard(123456789, "Pireus"),true);
		 sample.newUser(fresh);
		 Assert.assertEquals("Nikos", fresh.getName());
		 
	 } 

	 @Test
	 public void findByEmailTest(){
		 User fresh=new User(12,"Nikos","Papas", new Email("nikospapass@"), new Password("123321"), 21, new CreditCard(123456789, "Pireus"),true);
		 sample.newUser(fresh);
		 sample.getByEmail("nikospapass@");
		 sample.getByEmail("nikospapass@123");
		 Assert.assertEquals(new Email("nikospapass@"), fresh.getEmail());
		 
	 }
	 
}
