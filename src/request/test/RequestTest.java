package request.test;
import request.EnumStatus;
import request.Request;
import org.junit.Assert;
import org.junit.Test;


public class RequestTest {

@Test
public void testConstactor(){
	Request req = new Request("abc");
	Assert.assertEquals("abc",req.getComment());
	Assert.assertEquals(EnumStatus.PENDING,req.getStatus());
}


	
}
