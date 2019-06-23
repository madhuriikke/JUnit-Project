import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJUnit {

	@BeforeClass
	public static void LoadingDriver() {
		System.out.println("Driver loaded");
		Assume.assumeTrue( dbconnection());
	}
	 
	public static boolean dbconnection() {
		
		return true;
		
		
	}

	@Before //
	public void validate() {
		System.out.println("data validate");
	}

	@Test // it mens create test case
	public void openBrowser() {
		System.out.println("Browser is opened");
	}

	// @Ignore //its mens if you dont want rune this test case used ignore
	@Test
	public void getTitle() {
		System.out.println("Getting page title");
	}

	@After
	public void closeTransetion() {
		System.out.println("Transection closed");
	}

	@AfterClass
	public static void CloseingDriver() {
		System.out.println("Driver closed");
	}

}
