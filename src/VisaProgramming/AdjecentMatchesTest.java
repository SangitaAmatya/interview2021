package VisaProgramming;

import org.junit.Assert;
import org.junit.Test;

public class AdjecentMatchesTest {
	@Test
	public void testCase1() {
		final int expected = 1;
		AdjecentMatches ob1 = new AdjecentMatches();
		final int actual = ob1.singleOccurence("Sangeeta");
		Assert.assertEquals(actual, expected);

	}

	public void testCase2() {
		final int expected = 0;
		AdjecentMatches ob1 = new AdjecentMatches();
		final int actual = ob1.singleOccurence("Sangeta");
		Assert.assertEquals(actual, expected);

	}

	public void testCase3() {
		final int expected = 0;
		AdjecentMatches ob1 = new AdjecentMatches();
		final int actual = ob1.singleOccurence("Saangeeta");
		Assert.assertEquals(actual, expected);

	}

	public void testCase4() {
		final int expected = 0;
		AdjecentMatches ob1 = new AdjecentMatches();
		final int actual = ob1.singleOccurence("SaangEeta");
		Assert.assertEquals(actual, expected);

	}

}
