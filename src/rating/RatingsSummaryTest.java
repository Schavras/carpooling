package rating;

import org.junit.Assert;
import org.junit.Test;


public class RatingsSummaryTest {

	@Test
	public void Constractor() {
		@SuppressWarnings("unused")
		RatingsSummary test = new RatingsSummary() ;
	}
	
	@Test
	public void RatingTest(){
		@SuppressWarnings("unused")
		Rating temp = new Rating(5,"abc");
	}
	
	@Test
	public void testAdd() {
		RatingsSummary test = new RatingsSummary() ;
		Rating temp = new Rating(5,"abc");
		
		test.add(temp);
		
	}
	
	@Test
	public void testIsEmpty(){
		RatingsSummary test = new RatingsSummary() ;
		Assert.assertTrue(test.isEmpty());
	}
	
	@Test
	public void testRemove(){
		RatingsSummary test = new RatingsSummary() ;
		Rating temp = new Rating(5,"abc");
		test.add(temp);
		
		Rating temp2 = new Rating(10,"dfg");
		test.add(temp2);
		
		test.remove(1);
		Assert.assertEquals(1,test.getSize());
		
		test.remove(0);
		Assert.assertEquals(0,test.getSize());	
				
		test.add(temp);
		test.remove(test.getByRating(temp));
		Assert.assertEquals(0,test.getSize());
	}
	
	@Test
	public void testGetByID() {
		RatingsSummary test = new RatingsSummary() ;
		Rating temp = new Rating(5,"abc");
		test.add(temp);
		
		Rating temp2 = new Rating(10,"dfg");
		test.add(temp2);
		
		Rating rating = test.getByIndex(0);
		Assert.assertEquals(temp,rating);
		
		Rating rating2 =  test.getByIndex(1);
		Assert.assertEquals(temp2,rating2);
	}
	
	@Test
	public void testGetByRating() {
		RatingsSummary test = new RatingsSummary() ;
		Rating temp = new Rating(5,"abc");
		test.add(temp);
		
		Rating temp2 = new Rating(10,"dfg");
		test.add(temp2);
		
		Rating test1 = new Rating(5,"abc");
		Rating test2 = new Rating(10,"dfg");
		
		
		Rating rating = test.getByRating(test1);
		Assert.assertEquals(temp,rating);
		
		Rating rating2 = test.getByRating(test2);
		Assert.assertEquals(temp2,rating2);
		
	}
	
	@Test
	public void testUpdateAverage(){
		RatingsSummary test = new RatingsSummary() ;
		Assert.assertEquals(Double.doubleToLongBits(0),Double
				.doubleToLongBits(test.getAverage()));
		
		Rating temp = new Rating(5,"abc");
		test.add(temp);
		Assert.assertEquals(Double.doubleToLongBits(5),Double
				.doubleToLongBits(test.getAverage()));
		
		Rating temp2 = new Rating(11,"dfg");
		test.add(temp2);
		Assert.assertEquals(Double.doubleToLongBits(8),Double
				.doubleToLongBits(test.getAverage()));
		
		Rating temp3 = new Rating(1,"dfg");
		test.add(temp3);
		Assert.assertEquals("5.6667", String.format("%.4f",test.getAverage()));
		
		test.remove(1);
		Assert.assertEquals(Double.doubleToLongBits(3),Double.doubleToLongBits(test.getAverage()));
	}

}
