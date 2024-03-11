

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SHADI_TEST/Software/WebDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		List< WebElement>rows = driver.findElements(By.cssSelector(".table-display tr"));
		List< WebElement>columns = driver.findElements(By.cssSelector(".table-display th"));
		System.out.println("The Number of Rows is "+rows.size());
		System.out.println("The Number of Columns is "+columns.size());
		List< WebElement> data = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		for (int i = 0; i < data.size(); i++)
		{
			System.out.println(data.get(i).getText());
		}
			

	}

}
