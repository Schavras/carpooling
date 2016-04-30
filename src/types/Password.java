package types;

import util.encryption.*;
/**
 * @version     0.1             
 * @since       30/04/2016
 * @author Stavros Zarpas
 *
 */
public class Password {
	
	/**
	 * the encrypted password;
	 */
	String password;

	/**
	 * Standar Constractor
	 */
	public Password(String password){
		setPassword(password);
	}
	
	
	public Password() {
		password = "";
	}


	public String getPassword() {
		Decryption dec  =  new ReverseDecryption();
		return dec.decrypt(password,0);
	}


	public void setPassword(String password) {
		Encryption enc = new ReverseEncryption();
		this.password = enc.encrypt(password, 0);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
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
		Password other = (Password) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
