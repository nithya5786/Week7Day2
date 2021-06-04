package pages;

import hooks.TestNgHooks;

public class UserNewRecord extends TestNgHooks {
	
	public UserNewRecord assignFirstName(String firstName) {
		clearAndType(locateElement("id", "sys_user.first_name"), firstName);
		return this;
	}
	public UserNewRecord getFstName()
	{
	fstName=getTypedText(locateElement("id", "sys_user.first_name"));
	System.out.println(getTypedText(locateElement("id", "sys_user.first_name")));
			return this;
	
    }
	public UserNewRecord assignlastName(String lastName) {
		clearAndType(locateElement("id", "sys_user.last_name"), lastName);
		return this;
	}
	public UserSelfService clickOnSubmitButton() {
		click(locateElement("id", "sysverb_insert_bottom"));
		return new UserSelfService();
	}
	
}
