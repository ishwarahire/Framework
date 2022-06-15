package pagePakage;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private static final SearchContext Drivers = null;
	//declaration
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath ="//a[.='Create new tasks']") private WebElement createNewTask;
	@FindBy(linkText = "Settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
	@FindBy(xpath="//td[.='Enter Time-Track']") private WebElement enterTimeTrack;
	private Object logout;
	
	
	//utilization
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    //initialization

	public static SearchContext getDrivers() {
		return Drivers;
	}


	public WebElement getLogoutLink() {
		return logoutLink;
	}


	public WebElement getCreateNewTask() {
		return createNewTask;
	}


	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}


	public WebElement getEnterTimeTrack() {
		return enterTimeTrack;
	}
	//operational method
		public void clickLogout() {
			
			logoutLink.click();
			
		}
		
	public void clickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}
	
	
}
