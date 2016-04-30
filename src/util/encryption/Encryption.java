package util.encryption;

/**
 * The interface for Encryption
 * @author      Stavros Zarpas
 * @version     0.1             
 * @since       30/04/2016
 */
public interface Encryption {
	
	/**
	 *  The ecryption method for strings
	 * @param toEncprypt
	 * @param seed
	 * @return
	 */
	public String encrypt(String toEncprypt, int seed);
	
	/**
	 * The ecryption method for integers
	 * @param toEncprypt
	 * @param seed
	 * @return
	 */
	public int encrypt(int  toEncprypt, int seed);
}
