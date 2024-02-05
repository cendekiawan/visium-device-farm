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
import io.appium.java_client.remote.MobileCapabilityType

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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.exception.StepFailedException
//import com.kms.katalon.core.mobile.driver.MobileDriverFactory


public class SetCapability {

	def static void startApplication(String DeviceName, String UdId, String PlatformVersion, String PlatformName){
		//		Object apps = WS.sendRequest(findTestObject('Object Repository/WS/getApps - Android'))
		//		def jsonResponse = new JsonSlurper().parseText(apps.getResponseText())
		//		def lastIndex = jsonResponse.size() - 1
		//		def lastText = jsonResponse[lastIndex].id
		//		GlobalVariable.appID = lastText
		//		println(GlobalVariable.appID)




		DesiredCapabilities capabilities = new DesiredCapabilities()
		String webDriverVisiumFarmHub = "https://farmdemo.visiumlabs.com/wd/hub"


		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceName)
		capabilities.setCapability(MobileCapabilityType.UDID, UdId)
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PlatformVersion)
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true)
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false)
		capabilities.setCapability("vf:accessKey", "brian:3b7e2401-0e46-4efb-9a06-193c1086b797")


		String os = PlatformName


		if(os.equals("Android")) {
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2")
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
			//capabilities.setCapability("vf:appId", "${GlobalVariable.appID}")
			capabilities.setCapability("appium:appPackage", "com.rimhimstudios.register")
			capabilities.setCapability("appium:appActivity", "com.rimhimstudios.register.MainActivity")
			//capabilities.setCapability("vf:saveSession", true)
			//capabilities.setCapability("vf:saveVideoRecord", true)
			//capabilities.setCapability("vf:saveAppiumLog", true)
			//capabilities.setCapability("vf:saveDeviceLog", true)
			//capabilities.setCapability("vf:sessionName", "Android Automation DDL")
			KeywordUtil.logInfo("Success Remote")
			AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(webDriverVisiumFarmHub))
		}else if(os.equals("iOS")) {
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "xcuitest")
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS")
			capabilities.setCapability("appium:bundleId", "com.apple.calculator")
			//capabilities.setCapability("vf:saveSession", true)
			//capabilities.setCapability("vf:saveVideoRecord", true)
			//capabilities.setCapability("vf:saveAppiumLog", true)
			//capabilities.setCapability("vf:saveDeviceLog", true)
			//capabilities.setCapability("vf:sessionName", "iOS Automation DDL")
			KeywordUtil.logInfo("Success Remote")
			AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, capabilities, new URL(webDriverVisiumFarmHub))
		}
	}


	//	def static AppiumDriver getDriver() {
	//		//		return AppiumDriverManager.getDriver()
	//		try {
	//			return AppiumDriverManager.getDriver()
	//		}catch (StepFailedException e) {
	//			KeywordUtil.logInfo(e.getMessage())
	//			return null
	//		}catch (Exception e) {
	//			KeywordUtil.logInfo(e.getMessage())
	//			return null
	//		}
	//	}


	//	def static void resetApp() {
	//		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
	//		driver.terminateApp(getAppId())
	//		MobileHelpers.launchApp(MobileHelpers.getAppId())
	//	}
	//
	//
	//	def static void launchApp(String appId) {
	//
	//				AppiumDriver<?> driver = MobileDriverFactory.getDriver()
	//				((AppiumDriver)driver).activateApp(appId)
	//			}
}