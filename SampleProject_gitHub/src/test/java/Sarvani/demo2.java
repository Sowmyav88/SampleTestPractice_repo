package Sarvani;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo2 {
	
	@Test
	public void sample() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("new browser launched",true);
		
	}
	
}
