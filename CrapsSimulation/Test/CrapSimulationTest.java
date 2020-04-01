import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrapSimulationTest
{

	@Test
	void test_static_1()
	{
		Die die = new CrookedDie1();
		assertEquals("Die.testStatic()", die.testStatic());
	//	fail("Not yet implemented");
	}
	
	@Test
	void test_static_1()
	{
		CrookedDie1 die = new CrookedDie1();
		assertEquals("CrookedDie1.testStatic()", die.testStatic());
	//	fail("Not yet implemented");
	}

}
