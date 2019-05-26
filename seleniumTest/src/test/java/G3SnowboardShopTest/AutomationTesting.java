package G3SnowboardShopTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import extentReportDemo.ExtentReportsClass1;

public class AutomationTesting extends ExtentReportsClass1 {
	
	
	@Test(enabled = false)
	public void TC_4_2() {
		
		driver.get("https://www.zalando.se/kvinna-home/");
		
		logger = extent.createTest("TC-4-2");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("C");
		element.submit();
		
	   String url = driver.getCurrentUrl();
	   System.out.println(url);
	   AssertJUnit.assertEquals(url, "https://www.zalando.se/kvinna-home/");
	    
	}
	
	@Test
	public void TC_5_1 () throws Exception {
		
		logger = extent.createTest("TC-5-1");
		driver.get("https://www.amazon.co.uk/gp/deals/?ie=UTF8&ref_=sv_uk_1&nocache=1558642373334");
		WebElement myDynamicElement = (new WebDriverWait(driver, 2))
	              .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Today's Deals")));
		logger.createNode("Tryck på \\\"Köp\\\" på en eller flera produkter.");
		driver.findElement(By.linkText("NESCAFÉ DOLCE GUSTO Cafe au lait Coffee Pods, 16 Capsules (Pa...")).click();
		driver.findElement(By.id("mbc-buybutton-addtocart-1-announce")).click();
		
		Thread.sleep(2000);
		driver.navigate().back(); 
		driver.navigate().back();
		
		logger.createNode("Tryck på \\\"Köp\\\" på en eller flera produkter.");
		driver.findElement(By.linkText("Save £10 on Fire TV Stick 4K")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		logger.createNode("Tryck på \"Köp\" på en eller flera produkter.");
		driver.findElement(By.linkText("45% off Rimmel Slay Kit")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.id("nav-cart")).click();
		
		logger.createNode("Produkterna ska visas i varukorgen efter att man tryckt på \"Köp\"");
		String shop = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/h2")).getText();
		System.out.println(shop);
		AssertJUnit.assertEquals(shop, "Shopping Basket");
		
	}

}
