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
	
	public void testLeapYear_NotLeapYear2() throws Exception {
		assertFalse(testObject.isLeapYear(1700));
	}
	
	public void testLeapYear_NotLeapYear3() throws Exception {
		assertFalse(testObject.isLeapYear(2100));
	}
	
	public void testLearYear_YesLeapYear2() throws Exception {
		assertTrue(testObject.isLeapYear(2000));
	}

}
