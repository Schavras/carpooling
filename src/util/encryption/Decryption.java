package util.encryption;

/**
 * The interface for Decryption
 * @author      Stavros Zarpas
 * @version     0.1             
 * @since       30/04/2016
 */
public interface Decryption {

	/**
	 * The Decryption method for strings
	 * @param toEncprypt
	 * @param seed
	 * @return
	 */
	public String decrypt(String toEncprypt, int seed);
	
	/**
	 * The Decryption method for integers
	 * @param toEncprypt
	 * @param seed
	 * @return
	 */
	public int decrypt(int  toEncprypt, int seed);
}

