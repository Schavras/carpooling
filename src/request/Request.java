package request;

import place.AddressPlace;
import trip.Trip;
import user.User;

public class Request {
	/**
	 * the comment that the passenger sends to the driver
	 */
	private String comment;
	
	/**
	 * the approval code 
	 */
	private int approvalCode;
	
	private EnumStatus status;
	 
	public Request(String comment) {
		this.comment = comment;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + approvalCode;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Request other = (Request) obj;
		if (approvalCode != other.approvalCode)
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	
	

	
	 
}
