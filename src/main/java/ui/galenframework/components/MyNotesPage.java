package ui.galenframework.components;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyNotesPage {
	
	 @FindBy(css = "#my-notes-page")
	  private  WebElement myNotesPage;
	 
	 @FindBy(css = "#my-notes-page button")
	  private  WebElement addNotesButton;
	 


	 public   boolean isMyNotesDisplayed() {
		 return myNotesPage.isDisplayed();
		 
	 }
	 
	 public void clickAddNoteButton() {
		 addNotesButton.click();
	 }
	 
	 
	 
	 
	 



}
