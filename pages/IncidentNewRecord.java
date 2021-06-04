package pages;

import hooks.TestNgHooks;

public class IncidentNewRecord extends TestNgHooks {
	
	public IncidentNewRecord getIncNumber() {
		incidentnumber = getTypedText(locateElement("name", "incident.number"));
		System.out.println(getTypedText(locateElement("name", "incident.number")));
		return this;
	}
	
	public IncidentNewRecord shortDesc(String data) {

		clearAndType(locateElement("id", "incident.short_description"), data);
		return this;
	}
	
	public IncidentSelfService clickOnSubmitButton() {
		click(locateElement("xpath", "(//button[@type='submit'])[3]"));
		return new IncidentSelfService();
	}

}
