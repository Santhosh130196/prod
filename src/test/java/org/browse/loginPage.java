package org.browse;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends LibGlobal {
public loginPage() {
	PageFactory.initElements(driver, this);
	
}
@CacheLookup
@FindBys({@FindBy(id="email"), @FindBy(xpath="//input[contains(@type,'text')]")})
private WebElement txtUser;
@CacheLookup
@FindBys({@FindBy(id="pass"), @FindBy(xpath="pass")})
private WebElement txtPass;
@FindBy(name="login")
private WebElement btnclick;
public WebElement getTxtUser() {
	return txtUser;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnclick() {
	return btnclick;
}
public void login(String username,String password) {
 sendText(txtUser,username);
sendText(txtPass, password);
textclick(btnclick);
}

}
