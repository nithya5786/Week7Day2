package pages;

import hooks.TestNgHooks;


public class UserSelfService extends TestNgHooks {
	
	public UserNewRecord clickNew() {
		click(locateElement("xpath","//button[text()='New']"));
		return new UserNewRecord();
	}
		
		public UserSelfService verifyCreatedCaller() throws InterruptedException
		{
			click(locateElement("xpath", "//input[@placeholder='Search']"));
			TypeAndEnter(locateElement("xpath", "//input[@placeholder='Search']"),fstName);
				verifyExactText(locateElement("xpath", "(//td[@class='vt'])[2]"),fstName);
				return this;
			}



}


