package com.TcsDevops.SeleniumProject;
import org.openqa.selenium.JavascriptExecutor;


/**
 * Hello world!
 *
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class App
{
 @Test

 public static void main(String[] args) {


 System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver/chromedriver.exe");
 ChromeOptions chromeOptions = new ChromeOptions();
 WebDriver driver = new ChromeDriver(chromeOptions);

 System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
 driver.get("https://www.facebook.com/");
 System.out.println(driver.getTitle());

 
//WebElement ImageFile = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/img"));
//Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
//driver.quit();
 //working
WebElement ImageFile = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div/img"));
Assert.assertTrue(ImageFile.isDisplayed(), "image is not displayed");
//Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
//System.out.println(ImagePresent);
/* driver.manage().window().setSize(new Dimension(991, 1100));
// System.out.println(img.isDisplayed()); 
//
// driver.manage().window().setSize(new Dimension(800, 600));
// System.out.println(img.isDisplayed()); 
 Boolean isDisplayed =driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/img")).isDisplayed();
 System.out.println(isDisplayed);*/
//driver.quit();

// WebElement ImageFile = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/img1"));
// Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
// driver.quit();

// driver.get("http://localhost:8090/addressbook");
//
// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
// driver.findElement(By.className("v-button")).click();
// driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
// driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
// driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
// driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
// driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
// driver.findElement(By.className("v-button-primary")).click();
 //Thread.sleep(5000);
// driver.quit();
 }

}