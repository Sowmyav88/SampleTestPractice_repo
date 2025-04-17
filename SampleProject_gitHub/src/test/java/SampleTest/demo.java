package SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	
	@Test
	public void sampleDemo()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Demo is launched",true);
	}

}
