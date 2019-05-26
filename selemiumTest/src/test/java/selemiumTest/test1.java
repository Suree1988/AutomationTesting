package selemiumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class test1 extends AbstractChromeWebDriverTest{
  
	@Test
	public void TC_4_1() {
		
		driver.get("https://www.zalando.se/kvinna-home/");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Carhartt WIP");
		element.submit();
		
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.className("cat_main-1dxBH")));

	    List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\'z-nvg-cognac-root\']/div[1]/z-grid/z-grid-item[2]/div/div[1]"));

	    for (WebElement webElement : findElements)
	    {
	        System.out.println(webElement.findElement(By.cssSelector(".cat_filler-LplA4.cat_ellipsis-MujnT")).getText());
	    }
	}
}
