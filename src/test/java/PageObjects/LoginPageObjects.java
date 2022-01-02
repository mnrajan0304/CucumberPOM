package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects extends Baseclass{
	
	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnlogin;
	
	
	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void login(String enterusername, String enterpassword) {
		sendKeys(getTxtusername(), enterusername);
		sendKeys(getTxtpassword(), enterpassword);
		click(getBtnlogin());
	}
	
	public LoginPageObjects(){
		PageFactory.initElements(driver, this );
	}

}
