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
import groovy.json.JsonSlurper
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.keyword.internal.KeywordExecutor

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.RequestObject

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import org.openqa.selenium.remote.DesiredCapabilities


class Hooks {

//	@BeforeTestCase
//	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
//		TestCase testCase = findTestCase(testCaseContext.getTestCaseId())
//		GlobalVariable.Zephyr_TestCaseKey=testCase.getName().split("_")[0]
//		Object getId = WS.sendRequest(findTestObject('Object Repository/Zephyr/Get ID'))
//		
//		// Parse JSON
//		def jsonSlurper = new JsonSlurper()
//		def json = jsonSlurper.parseText(getId.getResponseText())
//		
//		// Extract ID from JSON
//		def executionIdAndroid = json.executions[0].execution.id
//		def executionIdIos = json.executions[1].execution.id
//		
//		GlobalVariable.Zephyr_Id_Android = executionIdAndroid
//		GlobalVariable.Zephyr_Id_iOS = executionIdIos
//	}
	
	
//	@AfterTestCase
//	def sampleAfterTestCase(TestCaseContext testCaseContext) {
//
//		//Set Zephyr Status
//		AppiumDriver<?> mobileDriver = MobileDriverFactory.getDriver()
//		String StatusTestCase = testCaseContext.getTestCaseStatus()
//		//GlobalVariable.Status_Test_Case = testCaseContext.getTestCaseStatus()
//		String os = mobileDriver.getCapabilities().getCapability("platformName").toString().toLowerCase()
//		if(os == "android") {
//			if (testCaseContext.getTestCaseStatus()=="PASSED") {
//					GlobalVariable.Zephyr_StatusName=1
//					WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Comment - Passed'))
//				}
//			else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
//					GlobalVariable.Zephyr_StatusName=2
//					String SS = Mobile.takeScreenshot("Screenshots/$StatusTestCase-"+"$GlobalVariable.Device_Name"+".png")
//					GlobalVariable.G_attachment = SS
//					WS.sendRequest(findTestObject('Object Repository/Zephyr/Create_attachment'))
//					GlobalVariable.G_attachment = SS.substring(12)
//					WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Comment - Failed'))
//			}
//				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - Android'))
//		}else if(os == "ios"){
//				if (testCaseContext.getTestCaseStatus()=="PASSED") {
//					GlobalVariable.Zephyr_StatusName=1
//					WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Comment - Passed'))
//				}
//				else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
//					GlobalVariable.Zephyr_StatusName=2
//					String SS = Mobile.takeScreenshot("Screenshots/$StatusTestCase-"+"$GlobalVariable.Device_Name"+".png")
//					GlobalVariable.G_attachment = SS
//					WS.sendRequest(findTestObject('Object Repository/Zephyr/Create_attachment'))
//					GlobalVariable.G_attachment = SS.substring(12)
//					WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Comment - Failed'))
//			}
//				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - iOS'))
//		}
//
//		AppiumDriverManager.closeDriver()
//	}
	
	@BeforeTestCase
	def beforeTestCaseMultipleCategoryOs(TestCaseContext testCaseContext) {
		TestCase testCase = findTestCase(testCaseContext.getTestCaseId())
		GlobalVariable.ZEPHYR_TEST_CASE_KEY=testCase.getName().split("_")[0]
		Object getId = WS.sendRequest(findTestObject('Object Repository/Zephyr/Get ID'))
		
		// Parse JSON
		def jsonSlurper = new JsonSlurper()
		def json = jsonSlurper.parseText(getId.getResponseText())
		
		// Extract ID from JSON
		def executionIdIosHigh = json.executions[0].execution.id
		def executionIdIosMid = json.executions[1].execution.id
		def executionIdIosLow = json.executions[2].execution.id
		def executionIdAndroidHigh = json.executions[3].execution.id
		def executionIdAndroidMid = json.executions[4].execution.id
		def executionIdAndroidLow = json.executions[5].execution.id
		
		GlobalVariable.ZEPHYR_ID_IOS_HIGH = executionIdIosHigh
		GlobalVariable.ZEPHYR_ID_IOS_MID = executionIdIosMid
		GlobalVariable.ZEPHYR_ID_IOS_LOW = executionIdIosLow
		GlobalVariable.ZEPHYR_ID_ANDROID_HIGH = executionIdAndroidHigh
		GlobalVariable.ZEPHYR_ID_ANDROID_MID = executionIdAndroidMid
		GlobalVariable.ZEPHYR_ID_ANDROID_LOW = executionIdAndroidLow
		println(ZEPHYR_ID_IOS_HIGH)
		println(ZEPHYR_ID_IOS_MID)
		println(ZEPHYR_ID_IOS_LOW)
		println(ZEPHYR_ID_ANDROID_HIGH)
		println(ZEPHYR_ID_ANDROID_MID)
		println(ZEPHYR_ID_ANDROID_LOW)
	}
	
	@AfterTestCase
	def afterTestCaseMultipleCategoryOs(TestCaseContext testCaseContext) {

		//Set Zephyr Status
		AppiumDriver<?> mobileDriver = MobileDriverFactory.getDriver()
		String os = mobileDriver.getCapabilities().getCapability("platformName").toString().toLowerCase()
		String category = mobileDriver.getCapabilities().getCapability("deviceName").toString().toLowerCase()
		if(os == "android") {
			if(category == "via_f1") {
				if (testCaseContext.getTestCaseStatus()=="PASSED") {
					GlobalVariable.ZEPHYR_STATUS_NAME=1
				}
				else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
					GlobalVariable.ZEPHYR_STATUS_NAME=2
				}
				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - Android - Low'))
			}
			if(category == "sm-a750f") {
				if (testCaseContext.getTestCaseStatus()=="PASSED") {
					GlobalVariable.ZEPHYR_STATUS_NAME=1
				}
				else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
					GlobalVariable.ZEPHYR_STATUS_NAME=2
				}
				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - Android - Mid'))
			}
			if(category == "sm-a520f") {
				if (testCaseContext.getTestCaseStatus()=="PASSED") {
					GlobalVariable.ZEPHYR_STATUS_NAME=1
				}
				else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
					GlobalVariable.ZEPHYR_STATUS_NAME=2
				}
				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - Android - High'))
			}
				
		}else if(os == "ios"){
			if(category == "iphone 5s" && "iphone 8 plus") {
				if (testCaseContext.getTestCaseStatus()=="PASSED") {
					GlobalVariable.ZEPHYR_STATUS_NAME=1
				}
				else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
					GlobalVariable.ZEPHYR_STATUS_NAME=2
				}
				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - IOS - Low'))
			}
			if(category == "iphone 8" && "iphone xr") {
				if (testCaseContext.getTestCaseStatus()=="PASSED") {
					GlobalVariable.ZEPHYR_STATUS_NAME=1
				}
				else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
					GlobalVariable.ZEPHYR_STATUS_NAME=2
				}
				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - IOS - Mid'))
			}
			if(category == "iphone 15" && "iphone xr") {
				if (testCaseContext.getTestCaseStatus()=="PASSED") {
					GlobalVariable.ZEPHYR_STATUS_NAME=1
				}
				else if (testCaseContext.getTestCaseStatus()=="FAILED" || testCaseContext.getTestCaseStatus()=="ERROR") {
					GlobalVariable.ZEPHYR_STATUS_NAME=2
				}
				WS.sendRequest(findTestObject('Object Repository/Zephyr/Update Status - IOS - High'))
			}
			
			
		}

		AppiumDriverManager.closeDriver()
	}
}