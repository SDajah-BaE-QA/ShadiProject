import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.support.ui.FluentWait;


public class FC14 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//chrome browser
		//System.setProperty("webdriver.chrome.driver", "D:/SHADI_TEST/Software/WebDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Microsoft Edge
		System.setProperty("webdriver.edg.driver", "D:/SHADI_TEST/Software/WebDriver/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://10.2.12.42:8085/UNION/");
		driver.manage().window().maximize();
		ChromeOptions driverOptions = new ChromeOptions();
		driverOptions.setAcceptInsecureCerts(true);
		driver.findElement(By.id("details-button")).click();
		//driver.findElement(By.name("inputPassword")).sendKeys("test");
		//driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("loginContainer:txtUsername")).sendKeys("SD2023");
		driver.findElement(By.id("loginContainer:txtUserPasswordforshow")).sendKeys("Test@111");
		driver.findElement(By.id("loginContainer:Login")).click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("menu"));
		//driver.findElement(By.className("disclaimerButton")).click();
		//Thread.sleep(2000);
		//driver.switchTo().frame("menu");
		driver.findElement(By.id("btnCollaps")).click();
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("txt_id_1010000_10")).click();
		driver.switchTo().frame("mainTree");
		driver.findElement(By.xpath("//span[@id='1010010']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("MainFrame");
		driver.findElement(By.id("batchListCreateBatch")).click();
		driver.findElement(By.id("accountNo1")).sendKeys("0010100044115101");
		 WebElement inputFieldAmount = driver.findElement(By.id("create-totalAmount"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", inputFieldAmount);
		//driver.findElement(By.id("create-totalAmount")).clear();
		driver.findElement(By.id("create-totalAmount")).sendKeys("500");
		 WebElement inputFieldCount = driver.findElement(By.id("create-totalCount"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", inputFieldCount);
		driver.findElement(By.id("create-totalCount")).sendKeys("2");
		driver.findElement(By.id("create-batch-scan")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Batches']/tbody/tr[2]/td/table/tbody/tr[1]/td[contains(@onmouseover,'hand')]")));
		String sequence = driver.findElement(By.name("sequence")).getAttribute("value");
		driver.findElement(By.xpath("//*[@id='Batches']/tbody/tr[2]/td/table/tbody/tr[1]/td[contains(@onmouseover,'hand')]")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// Switch to the alert
        //Alert alert = driver.switchTo().alert();
        //Thread.sleep(1000);
        // Perform actions on the alert
        alert.accept(); 
        driver.findElement(By.xpath("//*[@id='ChequeInfoTagEditButton']")).click();
        Random random = new Random();
        // Generate a random 6-digit number
        int randomserial = 100000 + random.nextInt(900000);
        String serial = Integer.toString(randomserial);
        //LocalDate currentDate = LocalDate.now();
        // Format the date as DDMM
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMM");
        //String cheqSerial = currentDate.format(formatter);
        driver.findElement(By.id("serial")).sendKeys(serial);
        driver.findElement(By.id("payBankCodeInputFieldId")).sendKeys("09");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).sendKeys("1010");
        //Thread.sleep(1000);
        driver.findElement(By.id("payAccountNumber")).sendKeys("1111111111111111");
        driver.findElement(By.id("transactionCode")).sendKeys("001");
         WebElement chqAmount = driver.findElement(By.id("amount"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", chqAmount);
        driver.findElement(By.id("amount")).sendKeys("240");
        if (driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).getText()== null);
        {
            driver.findElement(By.id("payBankCodeInputFieldId")).sendKeys("09");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).sendKeys("1010");
            //Thread.sleep(1000);
        }
        //driver.findElement(By.id("payBankCodeInputFieldId")).clear();
        //driver.findElement(By.id("payBankCodeInputFieldId")).sendKeys("09");
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).clear();
        //driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).sendKeys("1010");
        //Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("MainFrame");
        driver.findElement(By.xpath("//*[@id='buttons'] //div[@class='toolbar'] //a[@id='ChequeInfoTagUpdateCell']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='buttons'] //div[@class='toolbar'] //a[@id='ChequeInfoTagNextCell']")).click();
        //Thread.sleep(3000);
		// Switch to the alert
        //Alert alert1 = driver.switchTo().alert();
        Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
        //Thread.sleep(1000);
        // Perform actions on the alert
        alert1.accept(); 
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ChequeInfoTagEditButton']"))).click();
        Random random1 = new Random();
        // Generate a random 6-digit number
        int randomserial1 = 100000 + random1.nextInt(900000);
        String serial1 = Integer.toString(randomserial1);
        driver.findElement(By.id("serial")).sendKeys(serial1);
        driver.findElement(By.id("payBankCodeInputFieldId")).sendKeys("09");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).sendKeys("1010");
        //Thread.sleep(1000);
        driver.findElement(By.id("payAccountNumber")).sendKeys("1111111111111111");
        driver.findElement(By.id("transactionCode")).sendKeys("001");
         WebElement chqAmount1 = driver.findElement(By.id("amount"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", chqAmount1);
        driver.findElement(By.id("amount")).sendKeys("260");
        if (driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).getText()== null);
        {
            driver.findElement(By.id("payBankCodeInputFieldId")).sendKeys("09");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).sendKeys("1010");
            //Thread.sleep(1000);
        }
        //driver.findElement(By.id("payBankCodeInputFieldId")).sendKeys("09");
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).clear();
        //driver.findElement(By.xpath("//*[@id='payBranchCodeTextField']")).sendKeys("1010");
        //Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("MainFrame");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='buttons'] //div[@class='toolbar'] //a[@id='ChequeInfoTagUpdateCell']"))).click();
        //Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Batches']/tbody/tr[1]/td[1]/table/tbody/tr/td[2]"))).click();
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id='BatchInfoApproveCell']")).isEnabled();
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='BatchInfoApproveCell']"))).click();
        Thread.sleep(1000);
        ////////////
        driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		driver.findElement(By.id("btnCollaps")).click();
		//driver.switchTo().defaultContent();
		driver.switchTo().frame("mainTree");
		driver.findElement(By.xpath("//span[@id='1010040']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("MainFrame");
		//Thread.sleep(3000);
		String xpath = String.format("//a[contains(@href,'%s')]", sequence);
		 WebElement element = driver.findElement(By.xpath(xpath));
		//driver.findElement(By.xpath(xpath)).click();
		element.click();
		//driver.findElement(By.linkText(serial1)).click();
		//Thread.sleep(3000);
        //System.out.println(driver.findElement(By.xpath("//*[@id='BatchInfoApproveCell']")).isEnabled());
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='BatchInfoApproveCell']"))).click();
        //Thread.sleep(1000);
        System.out.println("The Test is Success");

      
        //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //(//a[@class,'customButton'])[1]
        
        

	}

}
