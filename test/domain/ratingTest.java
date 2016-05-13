package domain;

import org.junit.Test;

import domain.Rating;

public class ratingTest {
	
	@Test
	public void testDefault(){
		@SuppressWarnings("unused")
		Rating rating = new Rating();
	}
	
	@Test
	public void testConstructor(){
		@SuppressWarnings("unused")
		Rating rating = new Rating(5, "abc");
	}
	
	@Test
	public void setterTest(){
		Rating rating = new Rating(5, "abc");
		rating.setComment("cd");
		rating.setNumber(2);
	}
	
	@Test
	public void getterTest(){
		Rating rating = new Rating(5, "abc");
		rating.getComment();
		rating.getNumber();
	}
	
	@Test
	public void testHashCode(){
		Rating rating = new Rating(5, "abc");
		rating.hashCode();
		
		rating.setComment(null);
		rating.hashCode();
	}
}
