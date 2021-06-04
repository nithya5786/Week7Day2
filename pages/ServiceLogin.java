package pages;

import hooks.TestNgHooks;

public class ServiceLogin extends TestNgHooks {
	
	public ServiceLogin typeUName(String data) {
		// switchToFrame(0);
		clearAndType(locateElement("id", "user_name"), data);

		return this;
	}

	
	public ServiceLogin typePwd(String data) {

		clearAndType(locateElement("id", "user_password"), data);

		return this;
	}

	public ServiceHome clickLoginButton() {
		click(locateElement("xpath", "//button[text()='Log in']"));
		return new ServiceHome();
	}

}
