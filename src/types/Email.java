package types;

public class Email {

	/**
	 * full e-mail address
	 */
	String fullEmailAdress;
	
	/**
	 * Standar Constractor
	 * @param fullEmailAdress: String  
	 */
	public Email(String fullEmailAdress){
		this.fullEmailAdress= fullEmailAdress;
	}
	
	/**
	 * Default Constractor
	 */
	public Email(){
		fullEmailAdress="";
	}
	
	/**
	 * fullEmailAdress getter
	 * @return fullEmailAdress: String
	 */
	public String getFullEmailAdress() {
		return fullEmailAdress;
	}
	
	/**
	 * fullEmailAdress setter
	 * @param fullEmailAdress: String
	 */
	public void setFullEmailAdress(String fullEmailAdress) {
		this.fullEmailAdress = fullEmailAdress;
	}
	
	
}
