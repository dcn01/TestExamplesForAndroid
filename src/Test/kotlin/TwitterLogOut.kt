import POFiles.Config
import POFiles.HomeButtons
import POFiles.MenuButtons
import org.testng.annotations.Test

class TwitterLogOut : Config() {

    @Test
    fun logOut() {
        val homeB = HomeButtons(driver)
        val sMenu = MenuButtons(driver)

        homeB.usersIconTap()
        sMenu.settingsTap()
        sMenu.logOutTap()
        sMenu.verifyModalText()
        sMenu.tapOK()
    }
}
