import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selintroduction {

	public static void main(String[] args) {
		// Invoking Browser
		//chrome browser
		//System.setProperty("webdriver.chrome.driver", "D:/SHADI_TEST/Software/WebDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Microsoft Edge
		System.setProperty("webdriver.edg.driver", "D:/SHADI_TEST/Software/WebDriver/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		
		driver.get("https://www.udemy.com/user/shadi-aldaajah/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
