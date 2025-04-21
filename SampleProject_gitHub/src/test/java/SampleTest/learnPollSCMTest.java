package SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class learnPollSCMTest
{
	
	@Test
	public void sampledemoTest()
	{
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("SampledemoTest",true);
		
	}

}
