package domain;

import java.util.Date;


 

public class Request {
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
