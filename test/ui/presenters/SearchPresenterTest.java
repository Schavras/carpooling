package ui.presenters;

import org.junit.Assert;

import memorydao.TripMemoryDAOStub;

import org.junit.Before;
import org.junit.Test;

import ui.stubs.SearchUIStub;

public class SearchPresenterTest{

	private TripMemoryDAOStub mem;
	private SearchPresenter presenter;
	public SearchUIStub search;
	String country,region,town;
	
	String[] list;
	
	@Before
	public void setUp(){
		mem = new TripMemoryDAOStub();
		search = new SearchUIStub();
		presenter = new SearchPresenter(search,mem);
		
	}
	
	@Test
	public void updateTest(){
		country= search.getCountry();
		region = search.getRegion();
		town = search.getTown();
		list = presenter.updateList(country, region, town);
		Assert.assertEquals(3, list.length);
		
	}
	
	@Test
	public void updateEmptyTest(){
		country = "wrong";
		region = "wrong";
		town = "wrong";
		list = presenter.updateList(country, region, town);
		Assert.assertEquals(1, list.length);
		
		
	}
	
	@Test
	public void printTest(){
		country= search.getCountry();
		region = search.getRegion();
		town = search.getTown();
		list = presenter.updateList(country, region, town);
		String str = "0. by first user Rating: 0.0 Cost/Traveller: 100.0 €";
		Assert.assertEquals(str, list[0]);
	}
	
	@Test
	public void printEmptyTest(){
		country = "wrong";
		region = "wrong";
		town = "wrong";
		list = presenter.updateList(country, region, town);
		Assert.assertEquals("No results.", list[0]);
		
		
	}

	
}
