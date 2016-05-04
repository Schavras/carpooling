package request.test;
import request.DriverRequestList;
import request.EnumStatus;
import request.Request;
import user.Traveller;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class DriverRequestListTest {

	@Test
	public void DefaultConstractorTest(){
		DriverRequestList test = new DriverRequestList();
	}
	
	@Test
	public void ConstractorTest(){
		ArrayList<Traveller> trav = new ArrayList<Traveller>();
		trav.add(new Traveller());
		trav.add(new Traveller());
		DriverRequestList test = new DriverRequestList(trav);
	}
	
	@Test
	public void getTest(){
		ArrayList<Traveller> trav = new ArrayList<Traveller>();
		Traveller temp1 = new Traveller();
		trav.add(temp1);
		trav.add(new Traveller());
		DriverRequestList test = new DriverRequestList(trav);
		Traveller temp2 = test.get(0);
		Assert.assertEquals(temp1, temp2);
		
	}
	
}