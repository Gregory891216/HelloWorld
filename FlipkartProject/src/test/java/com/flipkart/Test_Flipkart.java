package com.flipkart;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_Flipkart {

	@Test
	public void testng() throws Exception {
		FirefoxDriver driver = new FirefoxDriver();

		HomePage hp = new HomePage(driver);
		Products prod = new Products(driver);
		
		hp.openUrl();
		hp.NavigateTo("Electronics", "HP");
		prod.addToCart("HP Compaq 15-s008TU Notebook");
		
		hp.openUrl();
		hp.NavigateTo("Electronics", "HP");
		prod.addToCart("HP 240 G3 (Notebook)");
		
		prod.navigateToCart();
		prod.checkCart("HP 240 G3 (Notebook)");
		prod.checkCart("HP Compaq 15-s008TU Notebook");
	}
}
