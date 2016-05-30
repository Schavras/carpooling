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
		ratings.add(rating);
		
	}

	@Override
	public void remove(Rating rating) {
		ratings.remove(rating);
		
	}

	@Override
	public void remove(int index) {
		ratings.remove(ratings.get(index));
		
	}

	@Override
	public double getAverage(User user) {
		RatingsSummary ave=new  RatingsSummary();
		for (int i = 0; i<UserMemoryDAO.users.size(); i++){
			if(UserMemoryDAO.users.get(i)==user){
				ave.setRatings(UserMemoryDAO.users.get(i).getRatings().getRatings());
				ave.setsize(UserMemoryDAO.users.get(i).getRatings().getRatings().size());
				ave.updateAverage();
			}
		}
		return ave.getAverage();
	}

	@Override
	public RatingsSummary getRatingsSummary(User user) {
		for (int i = 0; i<UserMemoryDAO.users.size(); i++){
			if(UserMemoryDAO.users.get(i)==user){
				return UserMemoryDAO.users.get(i).getRatings();
			}
		}
		return null;
	}

}
