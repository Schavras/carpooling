package memorydao;

import org.junit.Before;
import org.junit.Test;

import domain.Rating;
import domain.User;

public class RatingMemoryDAOTest {
	
	private RatingMemoryDAO sample;
	
	@Before 
	 public void loadBaseTest() {                
	    	MemoryInitializer base = new MemoryInitializer();
	    	base.initialize();
	        sample = new RatingMemoryDAO();  
	        
	    }
	
	@Test
	public void getAllRatings(){
		sample.getAllRatings(UserMemoryDAO.users.get(1));
		sample.getAllRatings(UserMemoryDAO.users.get(5));
	}
	
	@Test
	public void AddAndRemoveRatings(){
		sample.add(new Rating(1,"",UserMemoryDAO.users.get(0),UserMemoryDAO.users.get(1)));
		sample.remove(new Rating(1,"",UserMemoryDAO.users.get(0),UserMemoryDAO.users.get(1)));
		sample.remove(1);
	}
	
	@Test
	public void AverageRatings(){
		sample.getAverage(UserMemoryDAO.users.get(1));
		sample.getRatingsSummary(UserMemoryDAO.users.get(1));
		User k=new User();
		sample.getRatingsSummary(k);
		
	}
	

	

}
