package POFiles

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.testng.Assert.assertEquals

class MenuButtons(driver: AppiumDriver<WebElement>): Config() {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Settings']")
    private lateinit var settings: WebElement
    @FindBy(xpath = "//android.widget.TextView[@text='Sign out']")
    private lateinit var logOut: WebElement
    @FindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
    private lateinit var modalTxt: WebElement
    @FindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    private lateinit var okButton: WebElement


    fun settingsTap(){
        settings.click()
    }

    fun logOutTap(){
        logOut.click()
    }

    fun verifyModalText(){
        val txt = modalTxt.text
        assertEquals(txt, "Are you sure? Logging out will remove all Twitter data from this device.")
    }

    fun tapOK(){
        okButton.click()
    }
}