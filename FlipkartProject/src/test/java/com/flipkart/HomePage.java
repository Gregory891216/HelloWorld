package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage {
	private WebDriver driver;
	
	/***
	 * Custom constructor
	 * @param driver - WebDriver
	 */
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	/***
	 * Open the url of flipkart
	 */
	public void openUrl() {
//		driver.get("http://www.flipkart.com/");
		
		try {
			driver.navigate().to("http://www.flipkart.com/");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/***
	 * Navigate to target department's product category at menu bar
	 * @param department - String
	 * @param category - String	 
	*/
	public void NavigateTo(String department, String category) {
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[normalize-space()='Electronics']"))).perform();
		driver.findElement(By.xpath("//*[contains(text(), 'HP')]")).click();
	}
}
