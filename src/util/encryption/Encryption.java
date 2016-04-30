package util.encryption;

public interface Encryption {
	
	
	public String encrypt(String toEncprypt, int seed);
	public int encrypt(int  toEncprypt, int seed);
}
