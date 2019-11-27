package bootstrap_theme.Tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bootstrap_theme.AppObjects.AddCostumerAppObject;

public class AddCostumerTask {
	private WebDriver driver;
	private AddCostumerAppObject addCostumerAppObject;
	
	public AddCostumerTask(WebDriver driver){
		this.driver = driver;
		addCostumerAppObject = new AddCostumerAppObject(driver);
	}
	
	public void AddCostumer(){		
//		LEMBRAR DE DESOCMENTAR O SELECT E MUDAR A URL
//		addCostumerAppObject.getThemeComboBox().selectByVisibleText("Bootstrap V4 Theme");
		addCostumerAppObject.getAddCostumerButton().click();
		addCostumerAppObject.getCostumerNameTextField().sendKeys("Teste Sicredi");
		addCostumerAppObject.getLastNameTextField().sendKeys("Teste");
		addCostumerAppObject.getContactNameTextField().sendKeys("Francielli");
		addCostumerAppObject.getPhoneTextField().sendKeys("51 9999-9999");
		addCostumerAppObject.getAdress1TextField().sendKeys("Av Assis Brasil, 3970");
		addCostumerAppObject.getAdress2TextField().sendKeys("Torre D");
		addCostumerAppObject.getCityTextField().sendKeys("Porto Alegre");
		addCostumerAppObject.getStateTextField().sendKeys("RS");
		addCostumerAppObject.getPostalCodeTextField().sendKeys("91000-000");
		addCostumerAppObject.getCountryTextField().sendKeys("Brasil");
		addCostumerAppObject.getCountryTextField().sendKeys(Keys.TAB);
		
		addCostumerAppObject.getEmployeerButton().click();
		addCostumerAppObject.getEmployeerTextField().click();
		addCostumerAppObject.getEmployeerTextField().sendKeys("Fixter");
		addCostumerAppObject.getEmployeerTextField().sendKeys(Keys.ENTER);		
		addCostumerAppObject.getCreditLimitTextField().sendKeys("200");		
		addCostumerAppObject.getSaveButton().click();
	}	
}
