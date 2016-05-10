/**
 * 
 */
package types.currency;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author schavras
 *
 */
public class CurrencyTest {

	
	@Test
	public void testCurrencyChange() {
		 Currency testObj = new Currency(2.0f ,CurrencyNamesEnum.EURO);
		 testObj.currencyChange(CurrencyNamesEnum.DOLLAR);
		Assert.assertEquals("2.2894", String.format("%.4f", testObj.getValue()) );
		
	}
	
	@Test
	public void  setterTest(){
		 Currency testObj = new Currency(2.0f ,CurrencyNamesEnum.EURO);
		 testObj.setcName(CurrencyNamesEnum.EURO);
		 testObj.setValue(4.20f);
		 
	}
	
	@Test
	public void getterTest(){
		Currency testObj = new Currency(2.0f ,CurrencyNamesEnum.EURO);
		testObj.getcName();
		testObj.getValue();
	}
	
	@Test
	public void hashCodeTest(){
		Currency testObj = new Currency(2.0f ,CurrencyNamesEnum.EURO);
		testObj.hashCode();
		
		testObj.setcName(null);
		testObj.hashCode();
	}

	@Test
	public void EnumCurrencyTest(){
		CurrencyNamesEnum c = CurrencyNamesEnum.DOLLAR; 
		c.setConversionRate(0.2f);
		c.getAbbreviation();
		c.getConversionRate();
		c.getSign();
	}
}
