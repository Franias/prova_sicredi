package bootstrap_theme.Tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import bootstrap_theme.AppObjects.AddCostumerAppObject;

public class AddCostumerTask {
	private WebDriver driver;
	private AddCostumerAppObject addCostumerAppObject;
	
	public AddCostumerTask(WebDriver driver){
		this.driver = driver;
		addCostumerAppObject = new AddCostumerAppObject(driver);
	}
	
	public void AddNewCostumer(String CostumerName, String LastName, String FirstName,
			String Phone, String Adress1, String Adress2, String City, String State,
			String PostalCode, String Country, String Employeer, String CreditLimit){		
//		LEMBRAR DE DESOCMENTAR O SELECT E MUDAR A URL
//		addCostumerAppObject.getThemeComboBox().selectByVisibleText("Bootstrap V4 Theme");
		addCostumerAppObject.getAddCostumerButton().click();
		addCostumerAppObject.getCostumerNameTextField().sendKeys(CostumerName);
		addCostumerAppObject.getLastNameTextField().sendKeys(LastName);
		addCostumerAppObject.getContactNameTextField().sendKeys(FirstName);
		addCostumerAppObject.getPhoneTextField().sendKeys(Phone);
		addCostumerAppObject.getAdress1TextField().sendKeys(Adress1);
		addCostumerAppObject.getAdress2TextField().sendKeys(Adress2);
		addCostumerAppObject.getCityTextField().sendKeys(City);
		addCostumerAppObject.getStateTextField().sendKeys(State);
		addCostumerAppObject.getPostalCodeTextField().sendKeys(PostalCode);
		addCostumerAppObject.getCountryTextField().sendKeys(Country);
		addCostumerAppObject.getCountryTextField().sendKeys(Keys.TAB);
		
		addCostumerAppObject.getEmployeerButton().click();
		addCostumerAppObject.getEmployeerTextField().click();
		addCostumerAppObject.getEmployeerTextField().sendKeys(Employeer);
		addCostumerAppObject.getEmployeerTextField().sendKeys(Keys.ENTER);		
		addCostumerAppObject.getCreditLimitTextField().sendKeys(CreditLimit);		
		addCostumerAppObject.getSaveButton().click();
		
		
		//edit
		addCostumerAppObject.getEditButton().click();
	}	
	public void confirmData(String CostumerName, String LastName, String FirstName,
		String Phone, String Adress1, String Adress2, String City, String State,
		String PostalCode, String Country, String CreditLimit) {
		
		addCostumerAppObject.getEditButton().click();
		
		String costumerNameExpected = "Teste Sicredi";			
		String lastNameExpected = "Teste";
		String contactNameExpected = "Francielli";
		String phoneExpected = "51 9999-9999";
		String adress1Expected ="Av Assis Brasil, 3970" ;
		String adress2Expected = "Torre D";
		String cityExpected = "Porto Alegre";
		String stateExpected = "RS";
		String postalExpected = "91000-000";
		String countryExpected = "Brasil";
	
		String costumerNameActual = addCostumerAppObject.getCostumerNameTextField().getAttribute("value");		
		assertEquals(costumerNameExpected, costumerNameActual);
		String lastNameActual = addCostumerAppObject.getLastNameTextField().getAttribute("value");
		assertEquals(lastNameExpected, lastNameActual);
		String contactNameActual = addCostumerAppObject.getContactNameTextField().getAttribute("value");
		assertEquals(contactNameExpected, contactNameActual);
		String phoneActual = addCostumerAppObject.getPhoneTextField().getAttribute("value");
		assertEquals(phoneExpected, phoneActual);
		String adress1Actual = addCostumerAppObject.getAdress1TextField().getAttribute("value");
		assertEquals(adress1Expected, adress1Actual);
		String adress2Actual = addCostumerAppObject.getAdress2TextField().getAttribute("value");
		assertEquals(adress2Expected, adress2Actual);
		String cityActual = addCostumerAppObject.getCityTextField().getAttribute("value");
		assertEquals(cityExpected, cityActual);
		String stateActual = addCostumerAppObject.getStateTextField().getAttribute("value");
		assertEquals(stateExpected, stateActual);
		String postalActual = addCostumerAppObject.getPostalCodeTextField().getAttribute("value");
		assertEquals(postalExpected, postalActual);
		String countryActual = addCostumerAppObject.getCountryTextField().getAttribute("value");
		assertEquals(countryExpected, countryActual);
	}
}
