package bootstrap_theme.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class AddCostumerAppObject {
	private static WebDriver driver;
	public AddCostumerAppObject(WebDriver driver) {
		 this.driver = driver;
	}
//	

	public Select getThemeComboBox() {
		WaitElementFw.elementToBeClickable(driver, By.xpath("//select[@onchange='switchVersionSelect()']"));
		return new Select(this.driver.findElement(By.xpath("//select[@onchange='switchVersionSelect()']")));
	}
	public WebElement getAddCostumerButton() {
		WaitElementFw.elementToBeClickable(driver, By.xpath("//a[@href='/demo/bootstrap_theme_v4/add']"));
		return driver.findElement(By.xpath("//a[@href='/demo/bootstrap_theme_v4/add']"));
	}
	//page /add
	public WebElement getCostumerNameTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-customerName"));
		return driver.findElement(By.id("field-customerName"));
	}
	
	public WebElement getLastNameTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-contactLastName"));
		return driver.findElement(By.id("field-contactLastName"));
		
	}
	public WebElement getContactNameTextField() {
		return driver.findElement(By.id("field-contactFirstName"));
	}
	
	public WebElement getPhoneTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-phone"));
		return driver.findElement(By.id("field-phone"));
	}
	public WebElement getAdress1TextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-addressLine1"));
		return driver.findElement(By.id("field-addressLine1"));
	}
	public WebElement getAdress2TextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-addressLine2"));
		return driver.findElement(By.id("field-addressLine2"));
	}	
	public WebElement getCityTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-city"));
		return driver.findElement(By.id("field-city"));
	}
	public WebElement getStateTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-state"));
		return driver.findElement(By.id("field-state"));
	}
	public WebElement getPostalCodeTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-postalCode"));
		return driver.findElement(By.id("field-postalCode"));
	}
	
	public WebElement getCountryTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("field-country"));
		return driver.findElement(By.id("field-country"));
	}
	
	public Select getEmployeerComboBox() {
		WaitElementFw.elementToBeClickable(driver, By.id("field-salesRepEmployeeNumber"));
		return new Select(this.driver.findElement(By.id("field-salesRepEmployeeNumber")));
	}
	
	
	
	public WebElement getCreditLimitTextField() {
		return driver.findElement(By.id("field-creditLimit"));
	}
	public WebElement getSaveButton() {
		return driver.findElement(By.id("form-button-save"));
	}
	
	
	
	
	
	
}
