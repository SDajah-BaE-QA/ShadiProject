import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locatores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome browser
		System.setProperty("webdriver.chrome.driver", "D:/SHADI_TEST/Software/WebDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Microsoft Edge
		//System.setProperty("webdriver.edg.driver", "D:/SHADI_TEST/Software/WebDriver/edgedriver_win64/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("shadi");
		driver.findElement(By.name("inputPassword")).sendKeys("test");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shadi");
	}

}
