package rating;

import java.util.ArrayList;


public abstract class RatingsSummary {
	
	
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
		ratings.remove(rating);
		size--;
		updateAverage();
		
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
		return  (size == 0 ) ?  true : false;
		
	}
	

}
