package TestSuite1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {

	public static void main(String[] args) {

		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\naresh\\chromedriver-win64\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.amazon.com");
		        
		      //driver.quit();
		        System.out.print("Test Passed");
		    }
	}

