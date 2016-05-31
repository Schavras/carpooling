package domain;

import java.util.Date;


 

public class Request {
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Request other = (Request) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (status != other.status)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Request [comment=" + comment + ", user=" + user + ", status="
				+ status + "]";
	}

	/**
	 * the comment that the passenger sends to the driver
	 */
	private String comment;
	
	/**
	 * the approval code 
	 */
	private int approvalCode;
	
	private AddressPlace place;
	
	private Date pickUpDateAndTime;
	
	private User user;
	
	private EnumStatus status;
	 
	public Request(String comment, Date pickUpDateAndTime, AddressPlace place, User user ) {
		this.comment = comment;
		this.status = EnumStatus.PENDING;
		this.pickUpDateAndTime = pickUpDateAndTime;
		this.place = place;
		this.user = user;
		
		
	}
	
	public Request(String comment, User user){
		this.comment = comment;
		this.user = user;
		this.status = EnumStatus.PENDING;
	}

	public Request(){
		comment="";
		approvalCode=0;
		status=EnumStatus.PENDING;
	}
	
	public boolean isApproved(){
		return (status.equals(EnumStatus.APPROVED) )? true : false;
	}
	
	public boolean isRejected(){
		return (status.equals(EnumStatus.REJECTED) )? true : false;
	}
	
	public boolean isPending(){
		return (status.equals(EnumStatus.PENDING) )? true : false;
	}
	
	
	
	//TODO des to teleftaio approval code
	public  int nextApprovalCode() {
		approvalCode++;
		return approvalCode;
	}
	
	public Date getPickUpDateAndTime(){
		return pickUpDateAndTime;
	}
	
	public void setPickUpDateAndTime(Date pickUpDateAndTime){
		this.pickUpDateAndTime=pickUpDateAndTime;
	}
	
	public AddressPlace getPlace(){
		return place;
	}
	
	public void setPlace(AddressPlace place){
		this.place=place;
	}

	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public int getApprovalCode() {
		return approvalCode;
	}



	public void setApprovalCode(int approvalCode) {
		this.approvalCode = approvalCode;
	}



	public EnumStatus getStatus() {
		return status;
	}



	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user=user;
	}
 
}
