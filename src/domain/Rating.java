package domain;

/**
 * 
 * The class for rating, with a number, and text comment
 */
public class Rating {
	 
	/**
	 * The number of rating
	 */
	private int number;
	
	/**
	 * The comments
	 */
	private String comment;
	
	/**
	 * The user who does the rating
	 */
	private User from;
	
	/**
	 * The user who receives the rating
	 */
	private User to;
	/**
	 * @param number
	 * @param comment
	 */
	public Rating(int number, String comment,User from,User to) {
		this.number = number;
		this.comment = comment;
		this.setFrom(from);
		this.setTo(to);
	}

	/**
	 * 
	 */
	public Rating() {
		number=0;
		comment="";
		setFrom(null);
		setTo(null);
	}
	
	

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
		
	}

	/**
	 * @return the to
	 */
	public User getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(User to) {
		this.to = to;
		to.getRatings().add(this);
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + number;
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
		Rating other = (Rating) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	
	
	
}
