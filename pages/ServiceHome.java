package pages;

import hooks.TestNgHooks;

public class ServiceHome extends TestNgHooks{

	
	public IncidentSelfService filterNavigatorIncident(String filterNav) throws InterruptedException {

		TypeAndEnter(locateElement("id", "filter"), filterNav);
		click(locateElement("xpath", "//div[text()='Incidents']"));
		switchToFrame(0);

		return new IncidentSelfService();
	}
	
	public UserSelfService filterNavigatorCaller(String filterNav) throws InterruptedException {

		TypeAndEnter(locateElement("id", "filter"), filterNav);
		click(locateElement("xpath", "//div[text()='Callers']"));
		switchToFrame(0);

		return new UserSelfService();
	}

}
