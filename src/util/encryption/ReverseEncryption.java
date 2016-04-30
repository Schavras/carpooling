/**
 * 
 */
package util.encryption;

/**
 * @author Σταύρος
 *
 */
public class ReverseEncryption implements Encryption {


	/**
	 * encrpypt the password by reversing it
	 * @param password: String
	 * @return temp: String encrpypted 
	 */
	@Override
	public String encrypt(String toEncprypt, int seed) {
		String temp="";
		for(int i=toEncprypt.length(); i > 0 ; i--){
			temp+=toEncprypt.charAt(i);
		}
		
		return temp;
	}

	@Override
	public int encrypt(int toEncprypt, int seed) {
		
		return toEncprypt;
	}
}
