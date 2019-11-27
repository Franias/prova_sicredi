package bootstrap_theme.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class AddCostumerAppObject {
	private static WebDriver driver;
	public AddCostumerAppObject(WebDriver driver) {
		 this.driver = driver;
	}
	
	public Select getChildComboBox() {
		WaitElementFw.elementToBeClickable(driver, By.id("switch-version-select"));
		return new Select(this.driver.findElement(By.id("switch-version-select")));
	}
}
