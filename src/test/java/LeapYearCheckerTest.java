import junit.framework.TestCase;

public class LeapYearCheckerTest extends TestCase{

	public void testCreateLeapYearTestObject() throws Exception {
		LeapYearChecker testObject = new LeapYearChecker();
		assertNotNull(testObject);
	}

}
