import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SHADI_TEST/Software/WebDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Shadi Aldaajah");
		driver.findElement(By.name("email")).sendKeys("shadi@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		 WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("13/07/1986");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.print(driver.findElement(By.cssSelector(".alert-success")).getText());
				
	}

}
