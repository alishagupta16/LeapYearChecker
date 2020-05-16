
public class LeapYearChecker {

	public boolean isLeapYear(int year) {
		boolean result = year % 4 == 0 && year % 100 != 0;
		return result;
	}

}
