package pages.program;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.program.CreateProgramPage;
import webdriver.SeleniumDriverManager;
/**
 * @title  ProgramPage
 * @author Jose Cabrera
 * @description Is the page that contains information about programs in a table
 */
public class ProgramPage {
	WebDriver driver;
	@FindBy(id="j_id_y:j_id_1a")
	WebElement addNewProgramLink;
	@FindBy(id="j_id_t:nameInput_display")
	WebElement nameProgram;
	
	public ProgramPage(){
		this.driver=SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public CreateProgramPage clickAddNewProgramLink()
	{
		addNewProgramLink.click();
		return new CreateProgramPage(driver);
	}
	
	public Boolean isNameEnabled(String test){
		return nameProgram.isDisplayed();
	}
	
}
