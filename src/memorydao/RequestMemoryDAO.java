package memorydao;

import java.util.List;

import dao.RequestDAO;
import domain.Request;
import domain.Trip;
import domain.User;

public class RequestMemoryDAO implements RequestDAO {

	@Override
	public boolean addRequest(Request req) {
		
		return false;
	}

	@Override
	public boolean removeRequest(Request req) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Request> getRequestsByTrip(Trip trip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> getRequestsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
