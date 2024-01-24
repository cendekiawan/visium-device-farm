import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import org.openqa.selenium.remote.DesiredCapabilities
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import java.net.URL
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

class Visium {
	
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
//		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//		
		
		//Set Zephyr Status
		if (testCaseContext.getTestCaseStatus()=="PASSED")
			GlobalVariable.Zephyr_StatusName=1
		else if (testCaseContext.getTestCaseStatus()=="FAILED")
			GlobalVariable.Zephyr_StatusName=2
		else
			GlobalVariable.Zephyr_StatusName="Not Executed"
		//Call API to Push Result to Zephyr by creating Test case execution
		WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status'))
		
		
		//Set Zephyr Comment
		if (testCaseContext.getTestCaseStatus()=="PASSED")
			WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Comment - Passed'))
		else if (testCaseContext.getTestCaseStatus()=="FAILED")
			GlobalVariable.Zephyr_StatusName=2
		else
			GlobalVariable.Zephyr_StatusName="Not Executed"
		//Call API to Push Comment to Zephyr
		
		
		
		//AppiumDriverManager.closeDriver()
	}
}