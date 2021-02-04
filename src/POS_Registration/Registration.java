/**
 * 
 */
/**
 * @author MY020429
 *
 */
package POS_Registration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration
{
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\libs\\chromedriver.exe");
                  ChromeDriver driver = new ChromeDriver();
                  driver.get("https://pos.uat4.amway.com.ph/registration");
                  System.out.println("checkbranch");

                  driver.get("https://pos.uat4.amway.com.ph/registration");
                  driver.get("https://pos.uat4.amway.com.ph/registration");

                  driver.manage().window().maximize();
                  driver.manage().window().maximize();
                  driver.manage().window().maximize();
                  
                  
                  
         Thread.sleep(10000);
	 }
}