import junit.framework.TestCase;

public class LeapYearCheckerTest extends TestCase{

	public void testCreateLeapYearTestObject() throws Exception {
		LeapYearChecker testObject = new LeapYearChecker();
		assertNotNull(testObject);
	}
	
	public void testLearYear_YesLeapYear() throws Exception {
		LeapYearChecker testObject = new LeapYearChecker();
		assertTrue(testObject.isLeapYear(2008));
	}

}
