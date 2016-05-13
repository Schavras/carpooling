package memorydao;

import memorydao.MemoryLoader;

import org.junit.Test;

public class MemoryLoaderTest {
	
	@Test
	public void testLoad(){
		MemoryLoader mem = new MemoryLoader();
		mem.initialize();
		mem.load();
	}
}
