package TestPakage;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;


public class TestActiTimeLogout extends BaseTest{
	
	@Test
	public void actiTimeValidLogin() throws IOException, InterruptedException
	{
		pagePakage.LoginPage lp = new pagePakage.LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		lp.actiTimevalidLogin(validUsername, validPassword);
		pagePakage.HomePage hp = new pagePakage.HomePage(driver);
		hp.clickLogout();
		
	}

}