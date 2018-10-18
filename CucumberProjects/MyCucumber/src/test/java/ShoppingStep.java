
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingStep {
	
	public WebDriver driver = null;
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		}

	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {		
		ShoppingDetails sd = PageFactory.initElements(driver, ShoppingDetails.class);
		driver.get("http://www.practiceselenium.com/welcome.html");
		assertEquals("Welcome", driver.getTitle());
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
		ShoppingDetails sd = PageFactory.initElements(driver, ShoppingDetails.class);
		driver.get("http://www.practiceselenium.com/menu.html");
		assertEquals("Menu", driver.getTitle());
		Thread.sleep(500);
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		ShoppingDetails sd = PageFactory.initElements(driver, ShoppingDetails.class);
		assertEquals(sd.greenTea(), driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000453230000")));
		assertEquals(sd.redTea(), driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000453231072")));
		assertEquals(sd.oolongTea(), driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000453231735")));
	}
	
	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
		ShoppingDetails sd = PageFactory.initElements(driver, ShoppingDetails.class);
		driver.get("http://www.practiceselenium.com/menu.html");
		sd.checkoutTab();

	    }

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
		ShoppingDetails sd = PageFactory.initElements(driver, ShoppingDetails.class);
		driver.get("http://www.practiceselenium.com/check-out.html");
		assertEquals("Check Out", driver.getTitle());
	}

@After
public void teardown() {
	driver.quit();
	
}
	
}
