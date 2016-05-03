package request.test;
import request.EnumStatus;
import request.Request;
import types.Password;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RequestTest {

	@Test
	public void testDeafult() {
		Request user = new Request();
	}
	
	@Test
	public void testConstractor(){
		Request req = new Request("lalalalal", 1313, EnumStatus.APPROVED);
		Assert.assertTrue(req.isApproved());
	}
	
}
