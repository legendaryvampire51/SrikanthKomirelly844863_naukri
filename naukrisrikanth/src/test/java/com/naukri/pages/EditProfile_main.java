package com.naukri.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukri.testbase.Testbase;

public class EditProfile_main extends Testbase {


		@FindBy(xpath = "//div[contains(text(),'My Naukri')]")
		WebElement MyNaukri;
		
		@FindBy(xpath = "//div[contains(text(),'UPDATE PROFILE')]")
		WebElement UpdateProfile;
	
		public EditProfile_main() {
	
			PageFactory.initElements(driver, this);
		}


	public void setup() {
		initialization();
	}
	
	public void urla() {
		url();
	}
	
	public void logina() throws IOException, InterruptedException {
		login();
	}

	public void movetoMyNaukri() throws InterruptedException {


		System.out.println("ttyjryjr");

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement MyNaukri = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"));
		WebDriverWait wait = new WebDriverWait (driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(MyNaukri));


		MyNaukri.click();
		//		Thread.sleep(3000);
		//		Actions actions = new Actions(driver);
		//		actions.moveToElement(MyNaukri).perform();
	}
}
