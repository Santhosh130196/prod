package org.linnks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brlinks {
public static void main(String[] args) throws Throwable {
	WebDriverManager .chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	List<WebElement> alllinks = driver.findElements(By.tagName("//a"));
	for (int i = 0; i < alllinks.size(); i++) {
		WebElement crntlinks = alllinks.get(i);
	String attributelink = crntlinks.getAttribute("href");
	if (attributelink!=null) {
		if (attributelink.contains("http")) {
			URL url= new URL(attributelink);
			URLConnection openConnection = url.openConnection();
			HttpURLConnection con=(HttpURLConnection)openConnection;
			int rcode = con.getResponseCode();
			
			if (rcode==200) {
				System.out.println("success code="+attributelink);
			
			}else {
				System.out.println("broken code="+attributelink);
			}
		}
	}
	}
}
}
