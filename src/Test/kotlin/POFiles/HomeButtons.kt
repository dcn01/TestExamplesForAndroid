package POFiles

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class HomeButtons(driver: AppiumDriver<WebElement>): Config() {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @FindBy(xpath = "//android.view.View[@resource-id='com.twitter.android:id/drawer_icon']")
    lateinit var usersIcon: WebElement
    @FindBy(xpath = "//android.view.View[@content-desc='Selected. Home Tab']")
    lateinit var homeTabSelected: WebElement


    fun iconIsPresent(){
        usersIcon.isDisplayed
    }

    fun verifyHomeTabSelected(){
        homeTabSelected.isSelected
    }

    fun usersIconTap(){
        usersIcon.click()
    }

}