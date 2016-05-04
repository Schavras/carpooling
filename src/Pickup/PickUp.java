package Pickup;


import java.util.Date;

import place.AddressPlace;
import place.Place;
public class PickUp {

		private AddressPlace place;
		
		private Date pickUpDateAndTime;
		
		private Date disembarkDateAndTime;
		
		private double cost;

		public PickUp(AddressPlace place, Date pickUpDateAndTime, Date getOffDateAndTime, double cost) {
			this.place = place;
			pickUpDateAndTime = pickUpDateAndTime;
			disembarkDateAndTime = getOffDateAndTime;
			this.cost = cost;
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
			pickUpDateAndTime = pickUpDateAndTime;
		}

		public Date getDisembarkDateAndTime() {
			return disembarkDateAndTime;
		}

		public void setDisembarkDateAndTime(Date getOffDateAndTime) {
			disembarkDateAndTime = getOffDateAndTime;
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
			result = prime * result + ((disembarkDateAndTime == null) ? 0 : disembarkDateAndTime.hashCode());
			result = prime * result + ((pickUpDateAndTime == null) ? 0 : pickUpDateAndTime.hashCode());
			long temp;
			temp = Double.doubleToLongBits(cost);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((place == null) ? 0 : place.hashCode());
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
			if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
				return false;
			if (place == null) {
				if (other.place != null)
					return false;
			} else if (!place.equals(other.place))
				return false;
			return true;
		}

		
	    
		
		
		
		
}
