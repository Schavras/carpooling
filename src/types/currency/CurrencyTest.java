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

}
