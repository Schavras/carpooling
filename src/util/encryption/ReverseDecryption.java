/**
 * 
 */
package util.encryption;

/**
 * @author Σταύρος
 *
 */
public class ReverseDecryption implements Decryption {

	
	@Override
	/**
	 * 
	 */
	public String decrypt(String toEncprypt, int seed){
			String temp="";
			for(int i=0; i < toEncprypt.length() ; i++){
				temp+=toEncprypt.charAt(i);
			}
			
			return temp;
		}

	@Override
	public int decrypt(int toEncprypt, int seed) {
		
		return toEncprypt;
	}
	
	

	

	
}
