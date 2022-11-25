package org.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
	public WebDriver launchBrowser() {
WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
return driver;


}
	public void loadUrl(String url) {
	driver.get(url);

}
	public void sendText(WebElement el,String data) {
	el.sendKeys(data);

}
	public void textclick(WebElement el) {
 el.click();

}
	public void quitBrowser() {
	driver.quit();

}
	
}

