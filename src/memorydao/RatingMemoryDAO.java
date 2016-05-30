package memorydao;

import java.util.ArrayList;

import dao.RatingDAO;
import domain.Rating;
import domain.RatingsSummary;
import domain.User;

public class RatingMemoryDAO implements RatingDAO {

	protected static ArrayList<Rating> ratings = new ArrayList<Rating>();
	protected static ArrayList<Rating> ratingsum = new ArrayList<Rating>();
	
	@Override
	public ArrayList<Rating> getAllRatings(User user) {
		for (int i = 0; i<ratings.size(); i++){
			if(ratings.get(i).getTo().equals(user)){
					ratingsum.add(ratings.get(i));
			}
		}
		return ratingsum;
	}

	@Override
	public void add(Rating rating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Rating rating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAverage(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RatingsSummary getRatingsSummary(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
