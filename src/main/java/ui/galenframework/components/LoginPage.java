package ui.galenframework.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

  @FindBy(css = "#login-page")
  private WebElement loginHeader;

  @FindBy(css = "input[name='login.username']")
  private WebElement usernameTextField;

  @FindBy(css = "input[name='login.password']")
  private WebElement passwordTextField;

  @FindBy(css = ".button-login")
  private WebElement logInButton;
  
  @FindBy(css= "#login-error-message")
  private WebElement loginErrorMessage;

  public void clickLoginButton() {
    logInButton.click();
  }

  public boolean isLoginHeaderDisplayed() {
    return loginHeader.isDisplayed();
  }
  
  public boolean isLoginErrorDisplayed() {
	    return loginErrorMessage.isDisplayed();
	  }
  
  public void typeUserName(String User) {
	  usernameTextField.sendKeys(User);
	  }
  
  public void typePassword(String Password) {
	  passwordTextField.sendKeys(Password);
	  }
  
  
}
