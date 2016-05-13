package domain;
import org.junit.Assert;
import org.junit.Test;

import domain.EnumStatus;
import domain.EnumTripStatus;
import domain.Request;

@SuppressWarnings("unused")
public class RequestTest {

@Test
public void testConstactor(){
	Request req = new Request("abc");
	Assert.assertEquals("abc",req.getComment());
	Assert.assertEquals(EnumStatus.PENDING,req.getStatus());
}

@Test
public void testStatusChange(){
	Request req = new Request("abc");
	Assert.assertTrue(req.isPending());
	
	req.setStatus(EnumStatus.APPROVED);
	Assert.assertTrue(req.isApproved());
	
	req.setStatus(EnumStatus.REJECTED);
	Assert.assertTrue(req.isRejected());
	
}

	
}
