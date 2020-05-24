package selenium.qa.auto.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import selenium.qa.auto.helper.BowserFactory;
import selenium.qa.auto.helper.FunctionlLibrary;
import selenium.qa.auto.pages.AuthenticationPage;
import selenium.qa.auto.pages.HomePage;
import selenium.qa.auto.pages.MyAccount;
import selenium.qa.auto.pages.Order;
import selenium.qa.auto.pages.PersonalInfoPage;



public class Hooks {

	
	public static RemoteWebDriver driver;
    public static FunctionlLibrary misc;
	
	public static HomePage homePage = new HomePage();
	public static AuthenticationPage ap = new AuthenticationPage();
	public static PersonalInfoPage pi = new PersonalInfoPage();
	public static MyAccount myAccount =  new MyAccount();
	public static Order order =  new Order();
	@Before
	public void setUp() {
		driver = BowserFactory.getDriver();
		driver.manage().window().maximize();
		misc = new FunctionlLibrary(driver);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		PageFactory.initElements(driver, homePage);
		PageFactory.initElements(driver, ap);
		PageFactory.initElements(driver, pi);
		PageFactory.initElements(driver, myAccount);
		PageFactory.initElements(driver, order);

	}

	
	  @After public void tearDown() {
		  driver.quit();
		  }
	 
}