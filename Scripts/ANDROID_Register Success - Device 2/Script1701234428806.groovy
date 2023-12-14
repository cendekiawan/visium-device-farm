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

CustomKeywords.'visium.SetCapability.android'("9321f298","9321f298","8.1.0")

Mobile.tap(findTestObject('Object Repository/Demo/Add - Button'), 10)

Mobile.setText(findTestObject('Object Repository/Demo/Name - Text Input'), 'DDL AUTOMATION', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Phone - Text Input'), '0857623527283', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Alternate Phone - Text Input'), '0813623527283', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Email - Text Input'), 'AUTOMATION@DDL.COM', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Alternate Email - Text Input'), 'ROBOT@DDL.COM', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Allergies - Text Input'), 'TEST AUTOMATION', 10)

Mobile.setText(findTestObject('Object Repository/Demo/Notes - Text Input'), 'AUTOMATION', 10)

Mobile.tap(findTestObject('Object Repository/Demo/Save - Button'), 10)

Mobile.delay(5)