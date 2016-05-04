/**
 * 
 */
package place;

/**
 * Extends Place, adding adress
 */
public class AdressPlace extends Place{
	
	/**
	 * The road of the adress
	 */
	private String road;
	
	/**
	 * the number of the adress
	 */
	private int number;
	
	/**
	 * The post code of the adress
	 */
	private int postCode;

	public AdressPlace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdressPlace(String country, String region, String town, String comment, String road, int number,int postCode) {
		super(country, region, town, comment);
		this.road=road;
		this.number=number;
		this.postCode=postCode;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + number;
		result = prime * result + postCode;
		result = prime * result + ((road == null) ? 0 : road.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdressPlace other = (AdressPlace) obj;
		if (number != other.number)
			return false;
		if (postCode != other.postCode)
			return false;
		if (road == null) {
			if (other.road != null)
				return false;
		} else if (!road.equals(other.road))
			return false;
		return true;
	}
	
	
	
	
}
