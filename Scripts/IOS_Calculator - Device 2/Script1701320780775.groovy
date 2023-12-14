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

CustomKeywords.'visium.SetCapability.iOS'("3b910746a893bfff0ffb98026b47239f0776bcee","3b910746a893bfff0ffb98026b47239f0776bcee","12.3.1")

//Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Reset'), 30)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 8'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 6/Kali'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 2'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 6/Total'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 6/Tambah'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 9'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 6/Total'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 6/Bagi'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 8/Angka 5'), 10)

Mobile.tap(findTestObject('Object Repository/iOS - iPhone 6/Total'), 10)

Mobile.delay(5)