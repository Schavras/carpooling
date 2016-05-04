package request;

import java.util.ArrayList;

import user.Traveller;


public class DriverRequestList {
	private ArrayList<Traveller> requests;
	
	public DriverRequestList(){
		requests = new ArrayList<Traveller>();
	}
	
	public DriverRequestList (ArrayList<Traveller> req){
		requests = req;
	}
	
	
	
	public Traveller get(int i){
		if ( i >= 0 && i < requests.size()) return requests.get(i);
		return null;
	}

	

	public void add(Traveller req) {
		requests.add(req);
		
	}

	public void remove(int i) {
		requests.remove(i);		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((requests == null) ? 0 : requests.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DriverRequestList other = (DriverRequestList) obj;
		if (requests == null) {
			if (other.requests != null)
				return false;
		} else if (!requests.equals(other.requests))
			return false;
		return true;
	}

	public ArrayList<Traveller> getRequests() {
		return requests;
	}

	public void setRequests(ArrayList<Traveller> requests) {
		this.requests = requests;
	}
	
	
	
}
