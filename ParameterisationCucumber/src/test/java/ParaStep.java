import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParaStep {
	
	String fullTitle = "";
	
	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
	    driver.get(arg1);
	}

	@When("^I search for \"([^\"]*)\" searchterm$")
	public void i_search_for(String arg1) {
		SearchPage sp = PageFactory.initElements(driver, SearchPage.class);
		sp.search(arg1);
		
		fullTitle = arg1 + " - Bing";
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() throws Throwable {
	    assertEquals(fullTitle, driver.getTitle());
	}
	
	@After 
	public void teardown() {
		driver.quit();
	}
}
