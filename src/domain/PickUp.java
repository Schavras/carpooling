package domain;


import java.util.Date;
public class PickUp {

		private AddressPlace place;
		
		private Date pickUpDateAndTime;
		
		private Date disembarkDateAndTime;
		
		private double cost;
		
		private User traveler;
		
		private RatingsSummary ratings;

		public PickUp(AddressPlace place, Date pickUpDateAndTime, Date getOffDateAndTime, double cost , User traveler) {
			this.place = place;
			this.pickUpDateAndTime = pickUpDateAndTime;
			disembarkDateAndTime = getOffDateAndTime;
			this.cost = cost;
			this.traveler = traveler;
			RatingsSummary ratings=new RatingsSummary();
		}

		public User getTraveler() {
			return traveler;
		}

		public void setTraveler(User traveler) {
			this.traveler = traveler;
		}

		public AddressPlace getPlace() {
			return place;
		}

		public void setPlace(AddressPlace place) {
			this.place = place;
		}

		public Date getPickUpDateAndTime() {
			return pickUpDateAndTime;
		}

		public void setPickUpDateAndTime(Date pickUpDateAndTime) {
			this.pickUpDateAndTime = pickUpDateAndTime;
		}

		public Date getDisembarkDateAndTime() {
			return disembarkDateAndTime;
		}

		public void setDisembarkDateAndTime(Date disembarkDateAndTime) {
			this.disembarkDateAndTime = disembarkDateAndTime;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(cost);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime
					* result
					+ ((disembarkDateAndTime == null) ? 0
							: disembarkDateAndTime.hashCode());
			result = prime
					* result
					+ ((pickUpDateAndTime == null) ? 0 : pickUpDateAndTime
							.hashCode());
			result = prime * result + ((place == null) ? 0 : place.hashCode());
			result = prime * result
					+ ((traveler == null) ? 0 : traveler.hashCode());
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
			PickUp other = (PickUp) obj;
			if (Double.doubleToLongBits(cost) != Double
					.doubleToLongBits(other.cost))
				return false;
			if (disembarkDateAndTime == null) {
				if (other.disembarkDateAndTime != null)
					return false;
			} else if (!disembarkDateAndTime.equals(other.disembarkDateAndTime))
				return false;
			if (pickUpDateAndTime == null) {
				if (other.pickUpDateAndTime != null)
					return false;
			} else if (!pickUpDateAndTime.equals(other.pickUpDateAndTime))
				return false;
			if (place == null) {
				if (other.place != null)
					return false;
			} else if (!place.equals(other.place))
				return false;
			if (traveler == null) {
				if (other.traveler != null)
					return false;
			} else if (!traveler.equals(other.traveler))
				return false;
			return true;
		}

		
	    
		
		
		
		
}
