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
public class ReverseDecryption implements Decryption {

	
	@Override
	/**
	 * String Decpryption
	 */
	public String decrypt(String toEncprypt, int seed){
			String temp="";
			for(int i=0; i < toEncprypt.length() ; i++){
				temp=toEncprypt.charAt(i)+temp;
			}
			
			return temp;
		}

	@Override
	/**
	 * integer Decpryption
	 */
	public int decrypt(int toEncprypt, int seed) {
		
		return toEncprypt;
	}
	
	

	

	
}
