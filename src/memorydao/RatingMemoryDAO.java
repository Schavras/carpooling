package memorydao;

import java.util.ArrayList;

import dao.RatingDAO;
import domain.Rating;
import domain.User;

public class RatingMemoryDAO implements RatingDAO {

	protected static ArrayList<Rating> ratings = new ArrayList<Rating>();
	protected static ArrayList<Rating> ratingsum = new ArrayList<Rating>();
	
	@Override
	public ArrayList<Rating> getSummary(User user) {
		for (int i = 0; i<ratings.size(); i++){
			if(ratings.get(i).getTo().equals(user)){
					ratingsum.add(ratings.get(i));
			}
		}
		return ratingsum;
	}

}
