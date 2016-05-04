package Pickup;


import java.util.Date;

import place.AdressPlace;
import place.Place;
public class PickUp {

		private AdressPlace place;
		
		private Date PickUpDateAndTime;
		
		private Date GetOffDateAndTime;
		
		private double cost;

		public PickUp(AdressPlace place, Date pickUpDateAndTime, Date getOffDateAndTime, double cost) {
			this.place = place;
			PickUpDateAndTime = pickUpDateAndTime;
			GetOffDateAndTime = getOffDateAndTime;
			this.cost = cost;
		}

		public AdressPlace getPlace() {
			return place;
		}

		public void setPlace(AdressPlace place) {
			this.place = place;
		}

		public Date getPickUpDateAndTime() {
			return PickUpDateAndTime;
		}

		public void setPickUpDateAndTime(Date pickUpDateAndTime) {
			PickUpDateAndTime = pickUpDateAndTime;
		}

		public Date getGetOffDateAndTime() {
			return GetOffDateAndTime;
		}

		public void setGetOffDateAndTime(Date getOffDateAndTime) {
			GetOffDateAndTime = getOffDateAndTime;
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
			result = prime * result + ((GetOffDateAndTime == null) ? 0 : GetOffDateAndTime.hashCode());
			result = prime * result + ((PickUpDateAndTime == null) ? 0 : PickUpDateAndTime.hashCode());
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
			if (GetOffDateAndTime == null) {
				if (other.GetOffDateAndTime != null)
					return false;
			} else if (!GetOffDateAndTime.equals(other.GetOffDateAndTime))
				return false;
			if (PickUpDateAndTime == null) {
				if (other.PickUpDateAndTime != null)
					return false;
			} else if (!PickUpDateAndTime.equals(other.PickUpDateAndTime))
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
