import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SHADI_TEST/Software/WebDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String optionText = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		optionText.trim();
		//System.out.println(optionText);
		 WebElement DropDown = driver.findElement(By.id("dropdown-class-example"));
		Select options = new Select(DropDown);
		options.selectByVisibleText(optionText);
		driver.findElement(By.name("enter-name")).sendKeys(optionText);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String[] text =alert.getText().split(",");
		String[] text1 = text[0].split(" ");
		System.out.println(text1[1]);
		Assert.assertEquals(text1[1], "Option2");

		

	}

}
