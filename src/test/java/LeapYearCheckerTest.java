import junit.framework.TestCase;

public class LeapYearCheckerTest extends TestCase{

	LeapYearChecker testObject;
	
	public void setUp() {
		testObject = new LeapYearChecker();
	}
	
	public void testCreateLeapYearTestObject() throws Exception {
		assertNotNull(testObject);
	}
	
	public void testLearYear_YesLeapYear() throws Exception {
		assertTrue(testObject.isLeapYear(2008));
	}
	
	public void testLeapYear_NotLeapYear() throws Exception {
		assertFalse(testObject.isLeapYear(2017));
	}

}
