package sqa;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import sqa.common;

public class VerifyFooter extends common {

	// static void verify_super_admin() throws IOException {

	// initial();
	// login();
	// elementClick(By.linkText(" Super_Admin"));

	/*
	 * boolean isDisplayed =
	 * driver.findElement(By.linkText(" Super_Admin")).isDisplayed(); if
	 * (isDisplayed) System.out.println("Help menu is displayed"); else
	 * System.out.println("Help menu is NOT displayed"); //clickable
	 * 
	 * elementClick(By.xpath(or.getProperty("SUPERADMIN")));
	 * 
	 * //driver.findElement(By.linkText("help")).click();
	 * System.out.println("Help menu is clickable"); //driver.navigate().back();
	 */
	@Test
	static void footerdisplayed() {

		elementClick(By.xpath(or.getProperty("FOOTER")));
		Assert.assertTrue(elementDisplayed(By.xpath(or.getProperty("FOOTER"))) == true);
		System.out.println("footerdisplayed");
	}

	@Test
	static void footerenabled() {

		elementClick(By.xpath(or.getProperty("FOOTER")));
		Assert.assertTrue(elementEnabled(By.xpath(or.getProperty("FOOTER"))) == true);
		System.out.println("footerenabled");
	}

	// "//a[@class='navbar-brand']"

	/*
	 * if (isEnabled) System.out.println("Footer is Enabled"); else
	 * System.out.println("Footer is Disabled");
	 */

}
