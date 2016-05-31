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
	int count = 0;
	@Override
	public ArrayList<Request> getPendingRequestByUser(User user) {
		ArrayList<Request> result = new ArrayList<Request>();
	
	
		
		for(int i = 0 ; i < TripMemoryDAO.trips.size(); i ++){

			if(TripMemoryDAO.trips.get(i).getDriver().equals(user)){
				
				for(int j = 0 ; j < TripMemoryDAO.trips.get(i).getPendingRequest().size(); j++){
					
					result.add(TripMemoryDAO.trips.get(i).getPendingRequest().get(j));
			
				}
			}
		}
		return result;
	}

	@Override
	public Trip getTripOfRequest(Request request) {
		
		for (int i = 0 ; i < TripMemoryDAO.trips.size() ; i++ ){
			
			for( int j = 0 ; j < TripMemoryDAO.trips.get(i).getPendingRequest().size(); j ++ ){
				System.out.println(j);
				if (TripMemoryDAO.trips.get(i).getPendingRequest().get(j).equals(request)){
					return TripMemoryDAO.trips.get(i);
				}
		
			}
		}
		return null;
	}
}

