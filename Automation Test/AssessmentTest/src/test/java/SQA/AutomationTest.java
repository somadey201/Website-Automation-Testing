package SQA;

import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.awt.Button;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AutomationTest {

	WebDriver driver = new FirefoxDriver();
	String name, address1, address2, city, state, zipcode, mobile_number, first, last, country, viewcartReview;
	// ChromeDriver driver = new ChromeDriver();

	@Test
	public void test() throws InterruptedException, NoSuchElementException {

		WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");

		/* Verify that home page is visible successfully */

		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Home Page is visible successfuly");

		} else {
			System.out.println("Home Page is not visible successfuly");
		}

		/* Add products to cart */

		driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Continue Shopping'])[1]")).click();
		Thread.sleep(2000);

		/* Click 'Cart' button */

		driver.findElement(By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")).click();

		/* Verify that cart page is displayed */

		if (driver.getTitle().equals("Automation Exercise - Checkout")) {
			System.out.println("Cart page is Visible");
		} else {
			System.out.println("Cart page is not visible");
		}

		/* Click Proceed To Checkout */

		driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue On Cart']")).click();
		Thread.sleep(2000);
		/* Click 'Register / Login' button */

		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		/* Fill all details in Sign up and create account */

		Random rn = new Random();
		int ranint = rn.nextInt(10000);

		// set data
		name = "Soma Dey" + ranint;
		first = "Soma";
		last = "Dey";
		address1 = "Kalkata,India";
		address2 = "Kalkata,India";
		city = "vellore";
		state = "Tamilnaru";
		zipcode = "1234";
		country = "India";
		mobile_number = "1234435567";

		driver.findElement(By.xpath("(//input[@placeholder='Name'])[1]")).sendKeys(name);

		driver.findElement(By.xpath("(//input[@data-qa='signup-email'])[1]"))
				.sendKeys("somadey" + ranint + "@gmail.com");

		driver.findElement(By.xpath("(//button[normalize-space()='Signup'])[1]")).click();

		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("days")).sendKeys("17");
		driver.findElement(By.id("months")).sendKeys("July");
		driver.findElement(By.id("years")).sendKeys("1993");

		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("optin")).click();

		driver.findElement(By.id("first_name")).sendKeys(first);
		driver.findElement(By.id("last_name")).sendKeys(last);
		driver.findElement(By.id("address1")).sendKeys(address1);

		Thread.sleep(2000);
		driver.findElement(By.id("address2")).sendKeys(address2);

		driver.findElement(By.id("country")).sendKeys("India");

		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);
		driver.findElement(By.id("mobile_number")).sendKeys(mobile_number);

		driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).submit();
		Thread.sleep(2000);
		/* Verify 'ACCOUNT CREATED!' and click 'Continue' button */

		if (driver.getTitle().equals("Automation Exercise - Account Created")) {
			System.out.println("ACCOUNT CREATED!");
		} else {
			System.out.println("ACCOUNT NOT CREATED!");
		}

		/* Verify 'ACCOUNT CREATED!' and click 'Continue' button */
		driver.findElement(By.xpath("(//a[normalize-space()='Continue'])[1]")).click();
		Thread.sleep(2000);

		/* Verify ' Logged in as username' at top */

		String userName = driver.findElement(By.cssSelector("ul[class='nav navbar-nav'] li a b")).getText();
		if (userName.equals(name)) {
			System.out.println("User name validation successful");
		} else {
			System.out.println("User name validation failed");
		}

		/* Click 'Cart' button */

		driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
		viewcartReview = driver.findElement(By.xpath("(//tr[@id='product-1'])[1]")).getText();
		driver.findElement(By.xpath("(//a[normalize-space()='Proceed To Checkout'])[1]")).click();

		/* Verify Address Details and Review Your Order */
		addressReviewValidation();

		/* Enter description in comment text area and click 'Place Order' */
		driver.findElement(By.name("message")).click();
		driver.findElement(By.name("message")).sendKeys("Expecting good product quality.Thank You.");
		driver.findElement(By.xpath("(//a[normalize-space()='Place Order'])[1]")).click();
		/*
		 * Enter payment details: Name on Card, Card Number, CVC, Expiration date
		 */

		driver.findElement(By.name("name_on_card")).sendKeys("Visa");
		driver.findElement(By.name("card_number")).sendKeys("12334545665778");
		driver.findElement(By.name("cvc")).sendKeys("123");
		driver.findElement(By.name("expiry_month")).sendKeys("09");
		driver.findElement(By.name("expiry_year")).sendKeys("2024");
		/*
		 * Click 'Pay and Confirm Order' button
		 */
		driver.findElement(By.id("submit")).submit();

		/*
		 * 18. Verify the success message 'Your order has been placed successfully!'
		 */
		String successMessage = driver.findElement(By.id("success_message")).getText();

		if (successMessage.equals("Your order has been placed successfully!")) {
			System.out.println(successMessage);
		} else {
			System.out.println("Test case failed, unsuccessful order.");
		}

	}

	public void addressReviewValidation() {
		String getName = driver
				.findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_firstname address_lastname']"))
				.getText();
		if (getName.contains(first + " " + last)) {
			System.out.println("Name validation successful in address");
		} else {
			System.out.println("Name validation failed in address");
		}

		String getaddress1 = driver.findElement(By.cssSelector("ul[id='address_delivery'] li:nth-child(4)")).getText();
		if (getaddress1.equals(address1)) {
			System.out.println("address1 validation successful in address");
		} else {
			System.out.println("address1 validation failed in address");
		}
		String getaddress2 = driver.findElement(By.cssSelector("ul[id='address_delivery'] li:nth-child(4)")).getText();
		if (getaddress2.equals(address2)) {
			System.out.println("address2 validation successful in address");
		} else {
			System.out.println("address2 validation failed in address");
		}
		String getcity = driver
				.findElement(By.cssSelector(
						"ul[id='address_delivery'] li[class='address_city address_state_name address_postcode']"))
				.getText();
		if (getcity.contains(city + " " + state + " " + zipcode)) {
			System.out.println("State, city, zipcode validation successful in address");
		} else {
			System.out.println("State, city, zipcode validation failed in address");
		}

		String getcountry = driver
				.findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_country_name']")).getText();
		if (getcountry.equals(country)) {
			System.out.println("country validation successful in address");
		} else {
			System.out.println("country validation failed in address");
		}

		String getmobile_number = driver
				.findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_phone']")).getText();
		if (getmobile_number.equals(mobile_number)) {
			System.out.println("mobile_number validation successful in address");
		} else {
			System.out.println("mobile_number validation failed in address");
		}

		String review = driver.findElement(By.xpath("(//tr[@id='product-1'])[1]")).getText();
		if (review.equals(viewcartReview)) {
			System.out.println("Review validation successful");
		} else {
			System.out.println("Review validation failed");
		}

	}

}
