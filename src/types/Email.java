package types;

/**
 * @version     0.1             
 * @since       30/04/2016
 * @author Stavros Zarpas
 *
 */
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fullEmailAdress == null) ? 0 : fullEmailAdress.hashCode());
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
		Email other = (Email) obj;
		if (fullEmailAdress == null) {
			if (other.fullEmailAdress != null)
				return false;
		} else if (!fullEmailAdress.equals(other.fullEmailAdress))
			return false;
		return true;
	}
	
	
	
}
