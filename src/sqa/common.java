package sqa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class common {

	static WebDriver driver;
	static FileInputStream fis;

	protected static Properties or;
	static Properties config;

	static String ProjectPath;

	@BeforeSuite
	static void initial() {
		try {
			ProjectPath = System.getProperty("user.dir");

			// projectpath= F:\eclipse-workspace\finalSqa

			fis = new FileInputStream(ProjectPath + "\\src\\OR\\OR.properties");
			or = new Properties();
			or.load(fis);
			fis = new FileInputStream(ProjectPath + "\\src\\OR\\config.properties");
			config = new Properties();
			config.load(fis);

			if (config.getProperty("BROWSER").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "binaries\\chromedriver.exe");

				driver = new ChromeDriver();
			}
			System.out.println("initial");

		} catch (IOException ex) {

		} /*
			 * catch(FileNotFoundException ex) {
			 * 
			 * }
			 */

		// System.setProperty("webdriver.gecko.driver", "binaries\\geckodriver.exe");
		// WebDriver driver;

		// FirefoxDriver driver=new FirefoxDriver();

	}

	@BeforeClass
	static void login() {
		System.out.println("login");
		// initial();
		// WebDriver driver = new ChromeDriver();
		driver.get(config.getProperty("BASE_URL"));
//		driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("username")).sendKeys("Admin");
		// elementClick(By.cssSelector("input[class='form-control']"));
		//SendKeys(By.cssSelector(or.getProperty("USERNAMECSS")), "Super_Admin");
  	driver.findElement(By.name("password")).sendKeys("123456");
		//driver.findElement(By.name("password")).sendKeys("Super!31");
//		// login
		// driver.findElement(By.name("login")).click();
		elementClick(By.xpath(or.getProperty("LOGIN")));

	}

	protected static void elementClick(By locator) {
		driver.findElement(locator).click();
	}

	protected static boolean elementDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	protected static boolean elementEnabled(By locator) {
		return driver.findElement(locator).isEnabled();
	}

	static void SendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	protected static void elementClickCss(By locator) {
		driver.findElement(locator).click();
	}
}
