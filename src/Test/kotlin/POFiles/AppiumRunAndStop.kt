package POFiles

import io.appium.java_client.service.local.AppiumServiceBuilder

import java.io.File


object AppiumRunAndStop {

    lateinit var service: AppiumServiceBuilder

    fun startAppiumServer() {
        service = AppiumServiceBuilder().usingDriverExecutable(File("C:\\Program Files (x86)\\Appium\\node.exe")).withAppiumJS(
                File("C:/Program Files (x86)/Appium/node_modules/appium/bin/appium.js"))
        service.build().start()
        println("Appium Server is at Thou service, sir")
    }

    fun stopAppiumServer() {
        print("Trying to stop Appium!")
        try {
            service.build().stop()
        } catch (e: Exception) {
            print("Appium Server is already stopped")
        }

        println("Appium server has been stopped")


    }

}
