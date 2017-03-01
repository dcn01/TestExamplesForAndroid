package POFiles

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import java.net.URL


open class Config {

    lateinit var driver: AppiumDriver<WebElement>

    @BeforeTest
    fun runApp() {
        AppiumRunAndStop.stopAppiumServer()
        AppiumRunAndStop.startAppiumServer()
        val capa = DesiredCapabilities()
        capa.setCapability("automationName", "Appium")
        capa.setCapability("platformName", "Android")
        capa.setCapability("platformVersion", "6.0.1")
        capa.setCapability("deviceName", "Galaxy_Tab_S2")
        capa.setCapability("appPackage", "com.twitter.android")
        capa.setCapability("appActivity", "LoginActivity")
        driver = AndroidDriver(URL("http://127.0.0.1:4723/wd/hub"), capa)
        //Thread.sleep(2000)

    }


    @AfterTest
    fun driverClose() {
        driver.quit()
        AppiumRunAndStop.stopAppiumServer()
    }

}
