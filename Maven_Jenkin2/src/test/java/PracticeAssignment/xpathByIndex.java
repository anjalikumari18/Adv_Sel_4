package PracticeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[title=\"Search for Products, Brands and More\"]")).sendKeys("iPhone", Keys.ENTER);

	    driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 16')])[7]")).click();

	    
	    
		

	}

}
