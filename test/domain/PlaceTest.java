package domain;

import org.junit.Test;

import domain.AddressPlace;
import domain.Place;

@SuppressWarnings("unused")
public class PlaceTest {

	@Test
	public void defaultConstructor(){
		
		
		Place pl = new Place();
	}
	
	@Test
	public void Constructor1(){
		Place pl = new Place("as", "df", "gf");
	}
	
	@Test
	public void Constructor2(){
		Place pl = new Place("as", "df", "gf","hj");
	}
	
	@Test
	public void setterTest(){
		Place pl = new Place("as", "df", "gf","hj");
		pl.setComment("qw");
		pl.setCountry("ds");
		pl.setRegion("as");
		pl.setTown("ds");
	}
	
	@Test
	public void getterTest(){
		Place pl = new Place("as", "df", "gf","hj");
		pl.getComment();
		pl.getCountry();
		pl.getRegion();
		pl.getTown();
	}
	
	@Test
	public void hashCodeTest(){
		Place pl = new Place("as", "df", "gf","hj");
		pl.hashCode();
		
		pl.setComment(null);
		pl.setCountry(null);
		pl.setRegion(null);
		pl.setTown(null);
		
		pl.hashCode();
	}
	
	@Test
	public void AddDefaultConstructor(){
		AddressPlace pl = new AddressPlace();
	}
	
	@Test
	public void AddConstructor1(){
		AddressPlace pl = new AddressPlace("as", "df", "gf", "sd", "as", 1, 2);
				
	}
	
	@Test
	public void AddConstructor2(){
		AddressPlace pl = new AddressPlace("as", "df", "gf","hj", "as", 1, 2);
	}
	
	@Test
	public void AddsetterTest(){
		AddressPlace pl = new AddressPlace("as", "df", "gf", "sd", "as", 1, 2);
		pl.setComment("qw");
		pl.setCountry("ds");
		pl.setRegion("as");
		pl.setTown("ds");
		pl.setNumber(0);
		pl.setPostCode(12);
		pl.setRoad("as");
		
	}
	
	@Test
	public void AddgetterTest(){
		AddressPlace pl = new AddressPlace("as", "df", "gf", "sd", "as", 1, 2);
		pl.getComment();
		pl.getCountry();
		pl.getRegion();
		pl.getTown();
		pl.getRoad();
		pl.getNumber();
		pl.getPostCode();
		
	}
	
	@Test
	public void AddhashCodeTest(){
		AddressPlace pl = new AddressPlace("as", "df", "gf", "sd", "as", 1, 2);
		pl.hashCode();
		
		pl.setComment(null);
		pl.setCountry(null);
		pl.setRegion(null);
		pl.setTown(null);
		pl.setRoad(null);
		
		pl.hashCode();
	}
}
