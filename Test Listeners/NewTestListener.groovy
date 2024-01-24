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


class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		TestCase testCase = findTestCase(testCaseContext.getTestCaseId())
		GlobalVariable.Zephyr_TestCaseKey=testCase.getName().split("_")[0]
		GlobalVariable.Device_Name=testCase.getName().split("_")[2]
		println "GlobalVariable.Zephyr_TestCaseKey"
		println "GlobalVariable.Device_Name"
		Object getId = WS.sendRequest(findTestObject('Object Repository/Zephyr/Get ID'))
		// Parse JSON
		def jsonSlurper = new JsonSlurper()
		def json = jsonSlurper.parseText(getId.getResponseText())
		
		// Extract ID from JSON
		def executionId = json.executions[0].execution.id
		
		GlobalVariable.Zephyr_TestCaseKey = executionId
		println(GlobalVariable.Zephyr_TestCaseKey)
		
	}
}