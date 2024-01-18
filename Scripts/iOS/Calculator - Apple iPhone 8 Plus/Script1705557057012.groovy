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
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType

String webDriverVisiumFarmHub = "https://farmdemo.visiumlabs.com/wd/hub"
		DesiredCapabilities capabilities = new DesiredCapabilities()
		capabilities.setCapability("deviceName", "iPhone 8 Plus")
		capabilities.setCapability("automationName", "xcuitest")
		capabilities.setCapability("udid", "4488f63b32e9e5bc1b42799eff3f2cbe0d01936c")
		capabilities.setCapability("platformName", "iOS")
		capabilities.setCapability("platformVersion", "15.4")
		capabilities.setCapability("noReset", true)
		capabilities.setCapability("vf:accessKey", "brian:3b7e2401-0e46-4efb-9a06-193c1086b797")
		capabilities.setCapability("bundleId", "com.apple.calculator")
		capabilities.setCapability("vf:saveSession", true)
		capabilities.setCapability("vf:saveVideoRecord", true)
		capabilities.setCapability("vf:saveAppiumLog", true)
		capabilities.setCapability("vf:saveDeviceLog", true)
		capabilities.setCapability("vf:sessionName", "iOS Automation DDL")
		AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, capabilities, new URL(webDriverVisiumFarmHub))

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 8'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 8'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 2'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 5'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 5'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 9'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 9'), 10)

Mobile.delay(5)