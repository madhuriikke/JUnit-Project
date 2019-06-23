import org.junit.Test;

import junit.framework.Assert;

public class HandlingAssertion {

	@Test
	public void validateTitle() {
		String actualTitle = "Gmail Icn";
		String ExpectedTitle = "Gmail";
		try {
			System.out.println("Before chacking");
			Assert.assertEquals(ExpectedTitle, actualTitle);

		} catch (Throwable t) {
			System.out.println("error generated");
		}
		System.out.println("After Chacking");
		/*
		 * if (actualTitle == ExpectedTitle) { System.out.println("Title match"); } else
		 * { System.out.println("Title unmatched");
		 * }
		 */

	}

}
