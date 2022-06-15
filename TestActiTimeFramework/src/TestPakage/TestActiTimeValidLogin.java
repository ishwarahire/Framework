package TestPakage;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagePakage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest{
	
	@Test
	public void actiTimeValidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		lp.actiTimevalidLogin(validUsername, validPassword);
		
		
		
	}

}