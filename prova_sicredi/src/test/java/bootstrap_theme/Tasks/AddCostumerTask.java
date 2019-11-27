package bootstrap_theme.Tasks;

import org.openqa.selenium.WebDriver;

import bootstrap_theme.AppObjects.AddCostumerAppObject;

public class AddCostumerTask {
	private WebDriver driver;
	private AddCostumerAppObject addCostumerAppObject;
	
	public AddCostumerTask(WebDriver driver){
		this.driver = driver;
		this.addCostumerAppObject = new AddCostumerAppObject(driver);
	}
	
	public void AddCostumer(){
		
		
	}
}
