import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SHADI_TEST/Software/WebDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> ite = windows.iterator();
		String Home = ite.next();
		String Child = ite.next();
		driver.switchTo().window(Child);
		System.out.println(driver.findElement(By.xpath("//html/body/div/h3")).getText());
		driver.switchTo().window(Home);
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
		

	}

}
