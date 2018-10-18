import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingDetails {
	
	@FindBy (xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement Menu;
	
	@FindBy (xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
	private WebElement checkoutTab;
	
	@FindBy (xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement CheckOutbtn;
	
	@FindBy (id = "wsb-element-00000000-0000-0000-0000-000453230000")
	private WebElement GreenTea;
	
	@FindBy (id = "wsb-element-00000000-0000-0000-0000-000453231072")
	private WebElement RedTea;
	
	@FindBy (id = "wsb-element-00000000-0000-0000-0000-000453231735")
	private WebElement OolongTea;
	
	
	public void getMenu() {
		 Menu.click();
	}
	
	public void checkoutbtn() {
		CheckOutbtn.click();
	}
	
	public void checkoutTab() {
		checkoutTab.click();
	}
	
	public WebElement greenTea() {
		return GreenTea;
	}
	
	public WebElement redTea() {
		return RedTea;
	}
	
	public WebElement oolongTea() {
		return OolongTea;
	}
}
