package memorydao;

import java.util.ArrayList;
import dao.RequestDAO;
import domain.EnumStatus;
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

	@Override
	public ArrayList<Request> getPendingRequestsByTrip(Trip trip) {
		
		ArrayList<Request> requests1 = new ArrayList<Request>();
		
		for (int i = 0; i<TripMemoryDAO.trips.size(); i++){
			if(TripMemoryDAO.trips.get(i).equals(trip)){
				for(int k=0 ; k<TripMemoryDAO.trips.get(i).getPendingRequest().size();k++ ){
					if(TripMemoryDAO.trips.get(i).getPendingRequest().get(k).getStatus()==EnumStatus.PENDING){
						requests1.add(TripMemoryDAO.trips.get(i).getPendingRequest().get(k));
					}
				}
			}
		} 
		return requests1;
	}
	
	@Override
	public ArrayList<Request> getPendingRequestByUser(User user) {
		
		ArrayList<Request> requests1 = new ArrayList<Request>();
		
		for (int i = 0; i<UserMemoryDAO.users.size(); i++){
			if(UserMemoryDAO.users.get(i).equals(user)){
				for (int k = 0; k<UserMemoryDAO.users.get(i).getRequests().size(); k++){
					if(UserMemoryDAO.users.get(i).getRequests().get(k).getStatus()==EnumStatus.PENDING){
						requests1.add(UserMemoryDAO.users.get(i).getRequests().get(k));
					}
				}
			}
		}
		return requests1;
	}

	
	 
}
