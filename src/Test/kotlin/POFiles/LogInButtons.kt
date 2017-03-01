package POFiles

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.testng.Assert.assertEquals

class LogInButtons(driver: AppiumDriver<WebElement>): Config() {

   init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.twitter.android:id/login_identifier']")
    lateinit var logIn: WebElement
    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.twitter.android:id/login_password']")
    lateinit var pwd: WebElement
    @FindBy(xpath = "//android.widget.Button[@resource-id='com.twitter.android:id/login_login']")
    lateinit var logInButton: WebElement
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.twitter.android:id/header_title']")
    lateinit var logInMsg: WebElement


    fun logInEnter(){
        logIn.sendKeys("hardcore.gentleman@gmail.com")
    }

    fun pwdEnter(){
        pwd.sendKeys("opeth1991")
    }

    fun logInTap(){
        logInButton.click()
        //It is possible to use Tap action but it can only be performed using Coordinates
        Thread.sleep(3000)
    }

    fun verifyLogInMessage(){
        val msg = logInMsg.text
        assertEquals(msg, "Log in to Twitter.")
    }
}