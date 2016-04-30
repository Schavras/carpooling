package util.encryption;

public interface Decryption {

	public String decrypt(String toEncprypt, int seed);
	public int decrypt(int  toEncprypt, int seed);
}

