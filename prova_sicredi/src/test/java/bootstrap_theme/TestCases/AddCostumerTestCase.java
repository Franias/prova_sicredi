package bootstrap_theme.TestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import bootstrap_theme.Tasks.AddCostumerTask;
import frameworks.utils.BaseTestFw;

public class AddCostumerTestCase extends BaseTestFw {
	private WebDriver driver = getDriver();
	
	private AddCostumerTask addCostumerTask = new AddCostumerTask(driver);

	@Before
	public void setUp() {
		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme_v4");
	}
	
	@Test
	public void save() {		
		addCostumerTask.AddCostumer();
	}
}
