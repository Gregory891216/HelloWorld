package com.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Products {
	private WebDriver driver;

	/***
	 * Custom constructor
	 * @param driver - WebDriver
	 */
	public Products(WebDriver driver){
		this.driver = driver;
	}

	/**
	 * Add any 2 product to cart
	 * @param desiredItem - String
	 * @throws InterruptedException
	 */
	public void addToCart(String desiredItem) throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(text(), '"+ desiredItem +"')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(@value, 'Add to Cart')]")).click();
		Thread.sleep(2000);
		Reporter.log(desiredItem + " is added to cart.<br>");


	}
	
	/***
	 * Check the products are in the cart
	 * @param desiredItem - String
	 * @throws InterruptedException 
	 */
	public void checkCart(String desiredItem) throws InterruptedException {
		// Get the titles of item in the cart
		List<WebElement> itemName = driver.findElements(By.xpath("//*[@class='title fk-font-14']"));
		for (WebElement webElement : itemName) {
			if(webElement.getText().contains(desiredItem)){
				Reporter.log("<font color='green'><b>Success: " + desiredItem + " is in the cart.</b></font><br>");
			}
		}

	}
	
	public void navigateToCart() throws InterruptedException {
		// Get to the cart
		driver.findElement(By.xpath("//*[normalize-space()='Cart']")).click();
		Thread.sleep(2000);
	}
	
}
