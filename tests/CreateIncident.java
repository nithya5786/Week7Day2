package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.ServiceLogin;

public class CreateIncident extends TestNgHooks{
	
	@BeforeTest
	public void setData() {
		testCaseName = "Create New Incident";
		testDescription = "Create new incident on Service Now application";
		nodes = "Incident";
		dataSheetName = "TC_CreateIncident";
		category = "Sanity";
		authors = "Nithya";
	}

	@Test(dataProvider = "fetchData")
	public void createIncidentTest(String userName, String password, String filterNav, String shortDesc)
			throws InterruptedException {
		new ServiceLogin().typeUName(userName).typePwd(password).clickLoginButton().filterNavigatorIncident(filterNav)
		.clickNewButton().getIncNumber().shortDesc(shortDesc).clickOnSubmitButton().verifyCreatedIncident();
		
	}

}
