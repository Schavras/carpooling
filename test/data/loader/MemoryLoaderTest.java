package data.loader;

import org.junit.Test;

public class MemoryLoaderTest {
	
	@Test
	public void testLoad(){
		new MemoryLoader();
		System.out.println(MemoryLoader.getUsers());
	}
}
