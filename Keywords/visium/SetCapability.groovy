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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.MobileBy
import io.appium.java_client.MobileBy.ByCustom

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.mobile.driver.AppiumDriverSession
import com.kms.katalon.core.mobile.driver.MobileDriverType

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import io.appium.java_client.MobileElement

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import groovy.json.JsonSlurper
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import io.appium.java_client.AppiumDriver
import io.appium.java_client.remote.AppiumCommandExecutor
import com.kms.katalon.core.exception.StepFailedException


public class SetCapability {

	def static void startApplication(String DeviceName, String UdId, String PlatformVersion, String PlatformName){

		DesiredCapabilities capabilities = new DesiredCapabilities()
		String webDriverVisiumFarmHub = "https://farmdemo.visiumlabs.com/wd/hub"

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceName)
		capabilities.setCapability(MobileCapabilityType.UDID, UdId)
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PlatformVersion)
		//capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 180)
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true)
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false)
		capabilities.setCapability("vf:accessKey", "brian:3b7e2401-0e46-4efb-9a06-193c1086b797")

		GlobalVariable.OS_Phone = PlatformName.toString().toLowerCase()
		println(GlobalVariable.OS_Phone)

		if(GlobalVariable.OS_Phone == "android") {
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2")
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
			//capabilities.setCapability("vf:appId", "${GlobalVariable.appID}")
			capabilities.setCapability("appium:appPackage", "com.rimhimstudios.register")
			capabilities.setCapability("appium:appActivity", "com.rimhimstudios.register.MainActivity")
			capabilities.setCapability("vf:saveSession", true)
			capabilities.setCapability("vf:saveVideoRecord", true)
			capabilities.setCapability("vf:saveAppiumLog", true)
			capabilities.setCapability("vf:saveDeviceLog", true)
			capabilities.setCapability("vf:sessionName", "Android Automation Bank Mandiri")
			KeywordUtil.logInfo("Success Remote")
			AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(webDriverVisiumFarmHub))
		}else if(GlobalVariable.OS_Phone == "ios") {
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "xcuitest")
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS")
			capabilities.setCapability("appium:bundleId", "com.apple.calculator")
			capabilities.setCapability("vf:saveSession", true)
			capabilities.setCapability("vf:saveVideoRecord", true)
			capabilities.setCapability("vf:saveAppiumLog", true)
			capabilities.setCapability("vf:saveDeviceLog", true)
			capabilities.setCapability("vf:sessionName", "iOS Automation Bank Mandiri")
			KeywordUtil.logInfo("Success Remote")
			AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, capabilities, new URL(webDriverVisiumFarmHub))
		}
	}
}