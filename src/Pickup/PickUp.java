package Pickup;


import java.util.Date;

import place.Place;
public class PickUp {

		private String place;
		
		private Date PickUpDateAndTime;
		
		private Date GetOffDateAndTime;
		
		private double cost;

		private static class place extends Place {
	        private String adress;

			public place(String country, String region, String town, String comment,String adress) {
	            super(country,region,town,comment);
	            this.adress=adress;
	        }
	    }
		
		
		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
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
		
		
		
		
		
}
