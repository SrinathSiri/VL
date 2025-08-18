package com.sfly.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement TextUsername;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement TextPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement ButtonLogin;

    public void loginOHRM(String username,String passwd){
        TextUsername.sendKeys(username);
        TextPassword.sendKeys(passwd);
        ButtonLogin.click();
    }
}
