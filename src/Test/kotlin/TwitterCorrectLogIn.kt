import POFiles.Config
import POFiles.HomeButtons
import POFiles.LogInButtons
import org.testng.annotations.Test

class TwitterCorrectLogIn : Config(){

    @Test
    fun fbLogIn(){
        val lgnB = LogInButtons(driver)
        val homeB = HomeButtons(driver)

        lgnB.verifyLogInMessage()
        lgnB.logInEnter()
        lgnB.pwdEnter()
        lgnB.logInTap()
        homeB.iconIsPresent()
        homeB.verifyHomeTabSelected()

    }
}