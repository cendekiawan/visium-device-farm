package visium
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType
import groovy.json.JsonSlurper
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

class SetCapability {

	@Keyword
	def android(String DeviceName, String UdId, String PlatformVersion){
		//		Object apps = WS.sendRequest(findTestObject('Object Repository/WS/getApps - Android'))
		//		def jsonResponse = new JsonSlurper().parseText(apps.getResponseText())
		//		def lastIndex = jsonResponse.size() - 1
		//		def lastText = jsonResponse[lastIndex].id
		//		GlobalVariable.appID = lastText
		//		println(GlobalVariable.appID)
		String webDriverVisiumFarmHub = "https://farmdemo.visiumlabs.com/wd/hub"
		DesiredCapabilities capabilities = new DesiredCapabilities()

		capabilities.setCapability("deviceName", DeviceName)
		capabilities.setCapability("automationName", "uiautomator2")
		capabilities.setCapability("udid", UdId)
		capabilities.setCapability("platformName", "ANDROID")
		capabilities.setCapability("platformVersion", PlatformVersion)
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
	}

	@Keyword
	def iOS(String DeviceName, String UdId, String PlatformVersion){
		String webDriverVisiumFarmHub = "https://farmdemo.visiumlabs.com/wd/hub"
		DesiredCapabilities capabilities = new DesiredCapabilities()
		capabilities.setCapability("deviceName", DeviceName)
		capabilities.setCapability("automationName", "xcuitest")
		capabilities.setCapability("udid", UdId)
		capabilities.setCapability("platformName", "IOS")
		capabilities.setCapability("platformVersion", PlatformVersion)
		capabilities.setCapability("noReset", true)
		capabilities.setCapability("vf:accessKey", "brian:3b7e2401-0e46-4efb-9a06-193c1086b797")
		capabilities.setCapability("bundleId", "com.apple.calculator")
		capabilities.setCapability("vf:saveSession", true)
		capabilities.setCapability("vf:saveVideoRecord", true)
		capabilities.setCapability("vf:saveAppiumLog", true)
		capabilities.setCapability("vf:saveDeviceLog", true)
		capabilities.setCapability("vf:sessionName", "iOS Automation DDL")
		AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, capabilities, new URL(webDriverVisiumFarmHub))
	}
}