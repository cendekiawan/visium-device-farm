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

import groovy.json.JsonSlurper

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class testdulu {
	
//	@BeforeTestCase
//	def beforeTestCaseMultipleCategoryOs(TestCaseContext testCaseContext) {
//		TestCase testCase = findTestCase(testCaseContext.getTestCaseId())
//		//GlobalVariable.ZEPHYR_TEST_CASE_KEY=testCase.getName().split("_")[0]
//		GlobalVariable.ZEPHYR_TEST_CASE_KEY=testCase.getTag()
//		System.out.println(GlobalVariable.ZEPHYR_TEST_CASE_KEY)
//		Object getId = WS.sendRequest(findTestObject('Object Repository/Zephyr/Get ID'))
//		/* Hello World in Groovy */
//		def testCycleName = "Test Cycle"
//		def executionIdIosHighName = "iOS [High]"
//		def executionIdIosMidName = "iOS [Mid]"
//		def executionIdIosLowName = "iOS [Low]"
//		def executionIdAndroidHighName = "Android [High]"
//		def executionIdAndroidMidName = "Android [Mid]"
//		def executionIdAndroidLowName = "Android [Low]"
//		
//		// Parse JSON
//		def jsonSlurper = new JsonSlurper()
//		def json = jsonSlurper.parseText('{"executions":[{"defects":[],"execution":{"folderName":"Clone Prelogin - Android [High]","id":"4152138","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle dummy","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Clone Prelogin - iOS [Mid]","id":"4152162","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle dummy","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Clone Prelogin - Android [Low]","id":"4152113","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle dummy","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Clone Prelogin - Android [Mid]","id":"4152125","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle dummy","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Clone Prelogin - iOS [Low]","id":"4152149","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle dummy","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Clone Prelogin - iOS [High]","id":"4152174","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle dummy","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Prelogin - iOS [High]","id":"4103588","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Prelogin - iOS [Mid]","id":"4103582","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Prelogin - iOS [Low]","id":"4103576","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Prelogin - Android [High]","id":"4103570","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Prelogin_Android [Mid]","id":"4103564","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle","versionName":"Device Farm Automation"},"stepDefects":[]},{"defects":[],"execution":{"folderName":"Prelogin_Android [Low]","id":"4102215","issueKey":"EVDEV-193415","status":"NO RUN","statusId":"-1","testCycle":"Test Cycle","versionName":"Device Farm Automation"},"stepDefects":[]}],"totalCount":12}')
//		
//		
//		def executionIdIosHigh
//		def executionIdIosMid
//		def executionIdIosLow
//		def executionIdAndroidHigh
//		def executionIdAndroidMid
//		def executionIdAndroidLow
//		
//		for (int i=0; i>json.executions.length; i++) {
//			Object a = executions[i]
//			def executionName = a.folderName.split("-")[1]
//			if(a.testCycle == testCycleName) {
//				switch (executionName) {
//					case (executionIdIosHighName):
//						executionIdIosHigh = a.execution.id
//						break
//					case (executionIdIosMidName):
//						executionIdIosMid = a.execution.id
//						break
//					case (executionIdIosLowName):
//						executionIdIosLow = a.execution.id
//						break
//					case (executionIdAndroidHighName):
//						executionIdAndroidHigh = a.execution.id
//						break
//					case (executionIdAndroidMidName):
//						executionIdAndroidMid = a.execution.id
//						break
//					case (executionIdAndroidLowName):
//						executionIdAndroidLow = a.execution.id
//						break
//				}
//					
//			} 
//		}
//		
//		println(executionIdIosHigh)
//	}
}