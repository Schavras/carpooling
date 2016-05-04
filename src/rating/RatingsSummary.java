package rating;

import java.util.ArrayList;


public class RatingsSummary {
	
	
	private ArrayList<Rating> ratings;
	
	private double average;
	
	private int size;
	
	public RatingsSummary(){
		ratings = new ArrayList<Rating>();
		average = 0.0 ;
		size=0;
	}
	
	
	
	public void add(Rating rating){
		ratings.add(rating);
		size++;
		updateAverage();
		
	}
	
	public void remove(Rating rating){
		try{
			ratings.remove(rating);
			size--;
			updateAverage();
		}catch(IndexOutOfBoundsException e){
			System.err.println("Ratings Summary: IndexOutOfBoundsException: " + e.getMessage());
		}
		
	}
	
	public void remove(int index){
		try{
			ratings.remove(index);
			size--;
			updateAverage();
		}catch(IndexOutOfBoundsException e){
			System.err.println("Ratings Summary: IndexOutOfBoundsException: " + e.getMessage());
		}
		
	}
	
	
	public  void updateAverage(){
		if(!isEmpty()){
			double average = 0.0;
			for(int i=0; i < size; i++){
				average+=ratings.get(i).getNumber();							
			}
			
			this.average = average / size;
			return;
		}
			this.average = 0;
			
		
	}
	
	public boolean isEmpty(){
		return  (size == 0 && ratings.isEmpty() ) ?  true : false;
		
	}
	
	public Rating getByIndex(int index){
		return (size!=0 ) ? ratings.get(index) : null;
	}
	
	public Rating getByRating(Rating rating){
		
		for (int i = 0 ; i < size ; i++){
			if (ratings.get(i).equals(rating)){
				return ratings.get(i);
			}
		}
		System.out.println("null");
		return null;
	}



	/**
	 * @return the ratings
	 */
	public ArrayList<Rating> getRatings() {
		return ratings;
	}



	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}



	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}



	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}



	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}



	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(average);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ratings == null) ? 0 : ratings.hashCode());
		result = prime * result + size;
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatingsSummary other = (RatingsSummary) obj;
		if (Double.doubleToLongBits(average) != Double
				.doubleToLongBits(other.average))
			return false;
		if (ratings == null) {
			if (other.ratings != null)
				return false;
		} else if (!ratings.equals(other.ratings))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	
	

}
