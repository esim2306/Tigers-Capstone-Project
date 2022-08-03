package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " + scenario.getName() + " started");
		selectBrowser();
		openBrowser();
	}

	@After
	public void afterHooks(Scenario scenario) {
		
 
		if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Failed Scenario" + scenario.getName());
            driver.quit();
        }
        else {
            logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
            driver.quit();
        }
    }
		
	}


