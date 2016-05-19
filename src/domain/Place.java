/**
 * 
 */
package domain;

/**
 * @author schavras
 *
 */
public class Place {
	
	/**
	 * The country of the place
	 */
	private String country;
	
	/**
	 * the region of the place
	 */
	private String region;
	
	/**
	 * the town of the place
	 */
	private String town;
	
	/**
	 * Any comments about this place
	 */
	private String comment;

	/**
	 * @param country
	 * @param region
	 * @param town
	 * @param comment
	 */
	public Place(String country, String region, String town, String comment) {
		this.country = country;
		this.region = region;
		this.town = town;
		this.comment = comment;
	}

	/**
	 * 
	 */
	public Place() {
	}

	public Place(String country, String region, String town) {
		this.country = country;
		this.region = region;
		this.town = town;
		this.comment = "";
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((town == null) ? 0 : town.hashCode());
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
		Place other = (Place) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		return true;
	}
	
	
}
