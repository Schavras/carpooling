package types;
import util.encryption.*;
public class CreditCard {
	
	
	private int cNumber;
	private String bank;
	
	
	
	
	public CreditCard(){
		cNumber = 0;
		bank = "";
		
	}
	
	public CreditCard(int cNumber, String bank) {
		super();
		this.cNumber = cNumber;
		this.bank = bank;
	}
	
	
	public int getcNumber() {
		Decryption dec  =  new ReverseDecryption();
		return dec.decrypt(cNumber,0);
	}
	public String getBank() {
		return bank;
	}
	public void setcNumber(int cNumber) {
		Encryption enc = new ReverseEncryption();
		this.cNumber = enc.encrypt(cNumber, 0);
	}
	public void setBack(String bank) {
		this.bank = bank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + cNumber;
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
		CreditCard other = (CreditCard) obj;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (cNumber != other.cNumber)
			return false;
		return true;
	}
	
	
}
