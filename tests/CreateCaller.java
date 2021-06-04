package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.ServiceLogin;

public class CreateCaller extends TestNgHooks {
	
	@BeforeTest
	public void setData() {
		testCaseName = "Create New Caller";
		testDescription = "Create new Caller on Service Now application";
		nodes = "Caller";
		dataSheetName = "TC_CreateCaller";
		category = "Sanity";
		authors = "Nithya";
	}

	@Test(dataProvider = "fetchData")
	public void createNewCallerTest(String userName, String password, String filterNav, String firstName,
			String lastName) throws InterruptedException {
		
		new ServiceLogin().typeUName(userName).typePwd(password).clickLoginButton()
		.filterNavigatorCaller(filterNav).clickNew().assignFirstName(firstName)
		.getFstName().assignlastName(lastName).clickOnSubmitButton().verifyCreatedCaller();
	}


}
