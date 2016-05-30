package types.currency;

import java.util.spi.CurrencyNameProvider;

/**
 * @author schavras
 *
 */
public enum CurrencyNamesEnum {
	/**
	 * EURO 
	 */
	EURO ("EU",'\u20ac',1.0f),   // \u20ac = euro sign
	DOLLAR ("USD", '$',1.1447f);
	
	private final String abbreviation;
	private final char sign;
	private float conversionRate;
	
	CurrencyNamesEnum(String ab,char sign, float cr){
		abbreviation = ab;
		this.sign=sign;
		conversionRate=cr;
	}

	/**
	 * @return the conversionRate
	 */
	public float getConversionRate() {
		return conversionRate;
	}

	/**
	 * @param conversionRate the conversionRate to set
	 */
	public void setConversionRate(float conversionRate) {
		this.conversionRate = conversionRate;
	}

	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @return the sign
	 */
	public char getSign() {
		return sign;
	}
	
	public static CurrencyNamesEnum searchSign(String sign){
		if (sign.equals("Euros")){
			return CurrencyNamesEnum.EURO;
		}else if (sign.equals("Dollars")){
			return CurrencyNamesEnum.DOLLAR;
		}
		
		return null;
	}
	
	
}
