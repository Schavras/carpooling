package memorydao;

import java.util.ArrayList;

import dao.RequestDAO;
import domain.Request;
import domain.Trip;
import domain.User;
  
public class RequestMemoryDAO implements RequestDAO {

	protected static ArrayList<Request> requests = new ArrayList<Request>();
	
	@Override
	public boolean addRequest(Request req) {
		return requests.add(req);
	}

	@Override
	public boolean removeRequest(Request req) {
		return requests.remove(req);
	}

	@Override
	public ArrayList<Request> getRequestsByTrip(Trip trip) {
		for (int i = 0; i<TripMemoryDAO.trips.size(); i++){
			if(TripMemoryDAO.trips.get(i).equals(trip)){
				return trip.getPendingRequest();
			}
		} 
		return null;
	}
	@Override
	public ArrayList<Request> getRequestsByUser(User user) {
		for (int i = 0; i<UserMemoryDAO.users.size(); i++){
			if(UserMemoryDAO.users.get(i).equals(user)){
				return user.getRequests();
			}
		}
		return null;
	}

	
	 
}
