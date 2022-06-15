package TestPakage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagePakage.LoginPage;


@Listeners(CustomListner.class)
public class TestActiTimeInvalidLogin extends BaseTest{

	@Test
	public void actiTimeInvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		Reporter.log(rc+"",true);
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			
		
			lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
			WebElement errorMsG = lp.getErrorMsg();
			
			boolean status = errorMsG.isDisplayed();
			AssertJUnit.assertEquals(status, true);
			
		}
	}
}