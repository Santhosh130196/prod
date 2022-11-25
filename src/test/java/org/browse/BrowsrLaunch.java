package org.browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowsrLaunch {
public static void main(String[] args) {
	LibGlobal global = new LibGlobal();
	WebDriver driver = global.launchBrowser();
	global.loadUrl("https://www.facebook.com/");
	loginPage page =new loginPage();
	page.login("sandy", "passda");
	
}
}
