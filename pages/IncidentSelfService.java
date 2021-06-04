package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;



public class IncidentSelfService extends TestNgHooks {
	public IncidentNewRecord clickNewButton() throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(By.id("sysverb_new")).click();
		click(locateElement("id","sysverb_new"));
		
		return new IncidentNewRecord();
	}
	
	public IncidentSelfService verifyCreatedIncident() throws InterruptedException
	{
		click(locateElement("xpath", "//input[@placeholder='Search']"));
		TypeAndEnter(locateElement("xpath", "//input[@placeholder='Search']"),incidentnumber);
			verifyExactText(locateElement("xpath", "//a[@class='linked formlink']"),incidentnumber);
			return this;
		}

	}
	
	


