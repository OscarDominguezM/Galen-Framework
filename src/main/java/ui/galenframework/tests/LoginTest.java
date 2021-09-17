package ui.galenframework.tests;

import ui.galenframework.BaseTest;
import ui.galenframework.components.MyNotesPage;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

	/*
	 * @Test public void loginButtonShouldBePresent() {
	 * Assert.assertTrue(welcomePage.isWelcomeHeaderDisplayed()); }
	 */

	/*
	 * @Test public void clickingLoginButtonShouldRedirectYouToAnotherPage() {
	 * welcomePage.clickLoginButton();
	 * Assert.assertTrue(loginPage.isLoginHeaderDisplayed()); }
	 */
	@Test
	public void InvalidLogin() throws InterruptedException {
		welcomePage.clickLoginButton();
		loginPage.typeUserName("user");
		loginPage.typePassword("1234");
		loginPage.clickLoginButton();
		loginPage.isLoginErrorDisplayed();
		Thread.sleep(5000);
		Assert.assertTrue(loginPage.isLoginHeaderDisplayed());
	}
	
	@Test
	public void loginSucceed() throws InterruptedException {
		welcomePage.clickLoginButton();
		Assert.assertTrue(loginPage.isLoginHeaderDisplayed());
		loginPage.typeUserName("testuser@example.com");
		loginPage.typePassword("test123");
		loginPage.clickLoginButton();
		Assert.assertTrue(MyNotesPage.isMyNotesDisplayed());
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void addNoteTC01() throws InterruptedException {
		welcomePage.clickLoginButton();
		Assert.assertTrue(loginPage.isLoginHeaderDisplayed());
		loginPage.typeUserName("testuser@example.com");
		loginPage.typePassword("test123");
		loginPage.clickLoginButton();
		Assert.assertTrue(MyNotesPage.isMyNotesDisplayed());
		MyNotesPage.clickAddNoteButton();
		
		Thread.sleep(3000);
		
	}
	
	
}
