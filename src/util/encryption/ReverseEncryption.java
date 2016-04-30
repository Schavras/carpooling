/**
 * 
 */
package util.encryption;

/**
 * Implements the Decryption interface. Change the order of letters
 * as encryption algorith
 * @author      Stavros Zarpas
 * @version     0.1             
 * @since       30/04/2016
 */
public class ReverseEncryption implements Encryption {


	/**
	 * encrpypt the string by reversing it
	 * @param toEncprypt: String for encryption
	 * @return temp: String encrpypted 
	 */
	@Override
	public String encrypt(String toEncprypt, int seed) {
		String temp="";
		for(int i=toEncprypt.length()-1; i >= 0 ; i--){
			temp+=toEncprypt.charAt(i);
		}
		
		return temp;
	}

	@Override
	/**
	 * encrpypt the int by reversing it
	 * @param toEncprypt : int to encryption
	 * @return temp: int encrpypted 
	 */
	public int encrypt(int toEncprypt, int seed) {
		
		return toEncprypt;
	}
}
