package sqa;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class test extends common {
	// static WebDriver driver;
	// ChromeDriver driver = new ChromeDriver();

	public static void main(String[] args) throws IOException {

		

		initial();

		// TODO Auto-generated method stub

		// System.setProperty("webdriver.gecko.driver", "binaries\\geckodriver.exe");
		// WebDriver driver;

		// FirefoxDriver(); driver.get("http://test.nrbcplanet.com/nrbcbo/");
		login();
		System.out.println(ProjectPath);
		
		//LogoDisplayed();
		
		
		
		//Test_Super_Admin_Active.verify_super_admin();
		/*
		 * driver.get("http://test.nrbcplanet.com/nrbcbo/");
		 * 
		 * driver.findElement(By.name("username")).sendKeys("admin");
		 * driver.findElement(By.name("password")).sendKeys("123456");
		 * 
		 * driver.findElement(By.name("login")).click();
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver", "binaries\\chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver();
		 */

		/*
		 * elementClick(By.id("dropModules"));
		 * //driver.findElement(By.id("dropModules")).click();
		 * 
		 * elementClick(By.linkText("Add Location"));
		 * //driver.findElement(By.linkText("Add Location")).click();
		 * 
		 * 
		 * // Create object of the Select class
		 * driver.findElement(By.linkText("Select Near You")).click();
		 * 
		 * 
		 * //select near u xpath
		 * driver.findElement(By.xpath("//*[@id='field_eblNearYou_chosen']/div/ul/li[1]"
		 * )).click(); //elementClick(By.xpath(or.getProperty("SELECTNEARYOU_XPATH")));
		 * 
		 * 
		 * 
		 * //driver.findElementByXPath("//input[@id='field-branchCode']").sendKeys(
		 * "1234"); driver.findElement(By.name("ATMName")).sendKeys("tejgaon C/A");
		 * 
		 * 
		 * ////*[@id="field_eblDivision_chosen"]/a
		 * 
		 * 
		 * 
		 * //*[@id=\"field_eblDivision_chosen\"]/a"
		 * 
		 * driver.findElement(By.xpath("//div[@id='field_eblDivision_chosen']")).click()
		 * ; //elementClick(By.xpath(or.getProperty("EBLDIVISION_CHOSEN_XPATH")));
		 * 
		 * 
		 * ////*[@id="field_eblDivision_chosen"]/div/ul/li[3]
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"field_eblDivision_chosen\"]/div/ul/li[3]")).click();
		 * driver.findElement(By.name("Priority")).click();
		 * 
		 * SendKeys(By.id("field-AddressLine1"),"tejgaon");
		 * //driver.findElement(By.id("field-AddressLine1")).sendKeys("tejgaon");
		 * driver.findElement(By.id("field-AddressLine2")).sendKeys("Dhanmondi");
		 * 
		 * driver.findElement(By.id("field-ManagerName")).sendKeys("abcd");
		 * driver.findElement(By.id("field-Email")).sendKeys("abc@gmail.com");
		 * driver.findElement(By.id("field-Mobile")).sendKeys("1234567890");
		 * driver.findElement(By.id("field-PriorityManager")).sendKeys("adfcg");
		 * driver.findElement(By.id("field-PriorityEmail")).sendKeys("abc@gmail.com");
		 * driver.findElement(By.id("field-PriorityMobile")).sendKeys("3354773");
		 * 
		 * driver.findElement(By.id("form-button-save")).click();
		 * 
		 * 
		 * 
		 * //Select se=new Select (list) ; //se.selectByValue("1");
		 * 
		 * // ("//select[@id='field-eblNearYou']")));
		 * 
		 * 
		 * 
		 * // Select the option by index // se.selectByIndex(3);
		 * 
		 * //
		 * driver.findElementByXPath("//select[@id='field-eblNearYou']/option").click();
		 * //
		 * driver.findElementByXPath("//select[@name='eblDivision']/option[6]").click();
		 * // List<WebElement> //
		 * options=driver.findElementsByXPath("//select[@id='field-eblNearYou']/option")
		 * ;
		 * 
		 * 
		 * for(WebElement option:options) { String t=option.getText();
		 * System.out.print(t); }
		 */
		
	}
	


}
