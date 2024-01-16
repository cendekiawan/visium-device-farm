import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.mobile.driver.MobileDriverType as MobileDriverType
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import org.openqa.selenium.WebDriver as WebDriver
import io.appium.java_client.MobileElement as MobileElement
import java.net.URL as URL
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

String webDriverVisiumFarmHub = "https://farmdemo.visiumlabs.com/wd/hub"
DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability("deviceName", "Mi MIX 2")
capabilities.setCapability("automationName", "uiautomator2")
capabilities.setCapability("udid", "bbbb52ab")
capabilities.setCapability("platformName", "ANDROID")
capabilities.setCapability("platformVersion", "7.1.1")
capabilities.setCapability("noReset", true)
capabilities.setCapability("vf:accessKey", "brian:3b7e2401-0e46-4efb-9a06-193c1086b797")
//capabilities.setCapability("vf:appId", "${GlobalVariable.appID}")
capabilities.setCapability("appium:appPackage", "com.rimhimstudios.register")
capabilities.setCapability("appium:appActivity", "com.rimhimstudios.register.MainActivity")
capabilities.setCapability("vf:saveSession", true)
capabilities.setCapability("vf:saveVideoRecord", true)
capabilities.setCapability("vf:saveAppiumLog", true)
capabilities.setCapability("vf:saveDeviceLog", true)
capabilities.setCapability("vf:sessionName", "Android Automation DDL")
AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(webDriverVisiumFarmHub))

Mobile.tap(findTestObject('Object Repository/Demo/Add - Button'), 10)

Mobile.setText(findTestObject('Object Repository/Demo/Name - Text Input'), 'DDL AUTOMATION', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Phone - Text Input'), '0857623527283', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Alternate Phone - Text Input'), '0813623527283', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Email - Text Input'), 'AUTOMATION@DDL.COM', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Alternate Email - Text Input'), 'ROBOT@DDL.COM', 10)

Mobile.tap(findTestObject('Object Repository/Demo/Save - Button'), 10)

Mobile.delay(5)

Mobile.closeApplication()