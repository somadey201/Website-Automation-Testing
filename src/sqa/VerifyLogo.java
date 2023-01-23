package sqa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import sqa.common;

public class VerifyLogo extends common {

	@Test
	static void Logodisplayed() {
		System.out.println("Logodisplayed");
		elementClick(By.xpath(or.getProperty("LOGO")));
		Assert.assertTrue(elementDisplayed(By.xpath(or.getProperty("LOGO"))) == true);
	}

	/*
	 * @Test static void LogoDisplayed() {
	 * 
	 * elementClick(By.xpath(or.getProperty("LOGO")));
	 * Assert.assertTrue(elementDisplayed(By.xpath(or.getProperty("LOGO")))==true);
	 * }
	 */

	@Test
	static void Logoenabled() {
		System.out.println("Logodisplayed");
		elementClick(By.xpath(or.getProperty("LOGO")));
		Assert.assertTrue(elementEnabled(By.xpath(or.getProperty("LOGO"))) == true);
	}

}
