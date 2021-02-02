/**
 * 
 */
/**
 * @author MY020429
 *
 */
package SF_PU_ORDER;
import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
 

public class PickupOrder
{
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\libs\\chromedriver.exe");
                  ChromeDriver driver = new ChromeDriver();
                  driver.get("https://www.uat1.amway.com.ph/ph/?site=amwayphilippines");
                  driver.manage().window().maximize();
                  WebDriverWait wait=new WebDriverWait(driver, 20);
                  
            //Login      
                  driver.findElementByXPath("(//*[@class=\"fas fa-user\"])[1]").click(); 
                  driver.findElementByXPath("//*[@class=\"btn-primary button login-form__submit\"]").click();
                  driver.findElementByXPath("//*[@class=\"position-2-label\"]").click();
                  driver.findElementByXPath("//*[@class=\"ng-pristine ng-valid ng-touched\"]").sendKeys("+639223456789");
                  driver.findElementByXPath("//*[@id=\"pass1_password\"]").sendKeys("hybris2020");
                  driver.findElementByXPath("//*[@class=\"btn btn-block baseButton btn-primary activated\"]").click();
                  Thread.sleep(10000);
           //Deliverytype       
                  driver.findElementByXPath("//*[@class=\"header-volume\"]").click();
                  Thread.sleep(10000);
                  driver.findElementByXPath("//*[@class=\"plaza-label\"]").click();
                  Thread.sleep(5000);
                  driver.findElementByXPath("//*[@class=\"shipping-delivery-address-change\"]").click();
                  driver.findElementByXPath("//*[@class=\"search-box searchPOS-header\"]").click();
                  Thread.sleep(1000);
                  driver.findElementByXPath("//*[@class=\"pick-list-name\" and contains(text(),'ADC DAVAO')]").click();
                  Thread.sleep(1000);
                  driver.findElementByXPath("//*[@class=\"header-volume\"]").click();
                  Thread.sleep(1000);
            //Minicart 
                 
                  WebElement miniCart;
                  WebElement viewCart;
                  viewCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"mini-cart-icon\"])[1]")));
                  viewCart.click();
                    
                   
                   
                if(driver.findElement(By.xpath("//*[@href=\"/ph/cart\"]")).getText().equalsIgnoreCase("START SHOPPING"))
                      
    				{
    				    //PDP Navigation
   				//driver.findElement(By.xpath("//*[@href=\"/ph/cart\"]")).click();

    						 driver.findElementByXPath("(//*[@class=\"fa fa-angle-down\"])[2]").click();
    						 Thread.sleep(1000);
    	                     driver.findElementByXPath("(//*[@href=\"/ph/c/weightmanagement\"])").click();
    	                     Thread.sleep(10000);
	                         driver.findElementByXPath("(//*[@class=\"product-list__item-content amwahover\"])[1]").click();

	                   //Add to Cart
	                      WebElement addToCart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(),'Add to cart')]")));
	                      addToCart.click();
	                      miniCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(),'VIEW CART')]")));
	                      miniCart.click();   
	                      Thread.sleep(10000);
	                    //Checkout
	                      driver.findElementByXPath("//*[@class=\"btn btn-primary btn-block btn--continue-checkout  fontWeight600\"]").click();
	                      Thread.sleep(10000);
	                      driver.findElementByXPath("//*[@class=\"btn primary btn-block btn--continue-checkout checkout-payment-step place-order hidden-xs\" and contains (text() , 'CONFIRM PAYMENT')]").click();
	                      Thread.sleep(10000);
	                      WebElement orderNum =driver.findElementByXPath("//*[@class=\"confirm-box-message-sub-bold\"]");
	                      String ordnum = orderNum.getText();
	                      System.out.println("The order number is "+ordnum);
    				}
                else if(driver.findElement(By.xpath("//*[@href=\"/ph/cart\"]")).getText().equalsIgnoreCase("VIEW CART"))
                   			{
                	  miniCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(),'VIEW CART')]")));
                      miniCart.click();  
                      Thread.sleep(10000);
                      driver.findElementByXPath("(//*[@class=\"_checkbox-element-global-span shopping-list-header-checkbox\"])[1]").click();
                      driver.findElementByXPath("(//*[contains (text(),'Delete Selected')])[1]").click();
                      Thread.sleep(5000);
                      driver.findElementByXPath("(//*[@class=\"fa fa-angle-down\"])[2]").click();;
                      driver.findElementByXPath("(//*[@href=\"/ph/c/weightmanagement\"])").click();
                      Thread.sleep(10000);
                      driver.findElementByXPath("(//*[@class=\"product-list__item-content amwahover\"])[1]").click();
                      WebElement addToCart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(),'Add to cart')]")));
                      addToCart.click();
                      
                      miniCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(),'VIEW CART')]")));
                      miniCart.click();  
                      Thread.sleep(10000);
                      driver.findElementByXPath("//*[@class=\"btn btn-primary btn-block btn--continue-checkout  fontWeight600\"]").click();
                      Thread.sleep(10000);
                      driver.findElementByXPath("//*[@class=\"btn primary btn-block btn--continue-checkout checkout-payment-step place-order hidden-xs\" and contains (text() , 'CONFIRM PAYMENT')]").click();
                      Thread.sleep(10000);
                      WebElement orderNum =driver.findElementByXPath("//*[@class=\"confirm-box-message-sub-bold\"]");
                      String ordnum = orderNum.getText();
                      System.out.println("The order number is "+ordnum);
    
                  }
	 }
	 

}
	 
	 

            