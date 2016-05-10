package car;

import org.junit.Test;

public class carTest {
	
	@Test
	public void testDefault(){
		Car car = new Car();
		
	}
	
	@Test
	public void testConstructor(){
		Car car =  new Car("as12", "ab", "df", 2010);
		
	}
	
	@Test
	public void testSetter(){
		Car car =  new Car("as12", "ab", "df", 2010);
		car.setId("asd");
		car.setManufacturer("asd");
		car.setModel("ad");
		car.setYear(2001);
		
	}
	
	@Test
	public void testGetter(){
		Car car =  new Car("as12", "ab", "df", 2010);
		car.getId();
		car.getManufacturer();
		car.getModel();
		car.getYear();
	}
	
	@Test
	public void testHashCode(){
		Car car =  new Car("as12", "ab", "df", 2010);
		
		car.hashCode();
		
		car.setId(null);
		car.setManufacturer(null);
		car.setModel(null);
		
		car.hashCode();
	}
}
