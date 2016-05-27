/**
 * 
 */
package types.currency;

import java.util.spi.CurrencyNameProvider;

import org.omg.CORBA.portable.ValueBase;

/**
 * @author schavras
 *
 */
public class Currency {
	/**
	 * double value of money
	 */
	private float value;
	
	/**
	 * the currency name
	 */
	private CurrencyNamesEnum cName;

	/**
	 * @param value
	 * @param cName
	 */
	public Currency(float value, CurrencyNamesEnum cName) {
		this.value = value;
		this.cName = cName;
	}

	

	/**
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(float value) {
		this.value = value;
	}

	/**
	 * @return the cName
	 */
	public CurrencyNamesEnum getcName() {
		return cName;
	}

	/**
	 * @param cName the cName to set
	 */
	public void setcName(CurrencyNamesEnum cName) {
		this.cName = cName;
	}
	
	/**
	 * change the currency to new Currency, 
	 * and calculate the value
	 * @param newCurrency
	 */
	public void currencyChange(CurrencyNamesEnum newCurrency){
		float euroValue= value*cName.getConversionRate();
		value = euroValue * newCurrency.getConversionRate();
		cName = newCurrency;
	
	}

	public String print(){
		return value + " "+ cName.getSign();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + Float.floatToIntBits(value);
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (cName != other.cName)
			return false;
		if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value))
			return false;
		return true;
	}
	
	
	
}
