package G3SnowboardShopTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterTestClass {

	WebDriver driver;

	public RegisterTestClass(WebDriver driver) {
		super();
		this.driver = driver;
	}
	@FindBy(name="register.firstname")
	private WebElement firstNameBox;
	
	@FindBy(name="register.lastname")
	private WebElement familyNameBox;
	
	@FindBy(name="register.email")
	private WebElement emailBox;
	
	@FindBy(name="register.password")
	private WebElement passwordBox;
	
	public void enterFirstName(String enterFirstNameString) {
		firstNameBox.sendKeys(enterFirstNameString);
	}
	
	public void enterFamilyName(String enterFamilyNameString) {
		familyNameBox.sendKeys(enterFamilyNameString);
	}
	
	public void enterEmail(String enterEmailString) {
		emailBox.sendKeys(enterEmailString);
	}
	
	public void enterPassword(String enterPasswordString) {
		passwordBox.sendKeys(enterPasswordString);
	}
	

	
	public void registering(String firstname, String lastname, String email, String password) {
		
		enterFirstName(firstname);
		enterFamilyName(lastname);
		enterEmail(email);
		enterPassword(password);
		
	}

	
	
}