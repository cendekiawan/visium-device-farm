package shareStep
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

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
import stepDef.Helper
import io.appium.java_client.AppiumDriver
import internal.GlobalVariable as GlobalVariable
import stepDef.BaseScreenObject
import stepDef.Constants


public class RegisterOrCalculatorScreen extends stepDef.BaseScreenObject {

	private TestObject btnAdd
	private TestObject txtInputName
	private TestObject txtInputPhone
	private TestObject txtInputAlternatePhone
	private TestObject txtInputEmail
	private TestObject txtInputAlternateEmail
	private TestObject btnSave
	private TestObject btn8
	private TestObject btn2

	public RegisterOrCalculatorScreen() {

		if(GlobalVariable.OS_Phone == Constants.ANDROID.toLowerCase()) {
			btnAdd = createTestObjectByXpath("btnAdd", "//android.widget.TextView[@content-desc='Create new']")
			txtInputName = createTestObjectByXpath("txtInputName", "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.EditText[1]")
			txtInputPhone = createTestObjectByXpath("txtInputPhone", "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")
			txtInputAlternatePhone = createTestObjectByXpath("txtInputAlternatePhone", "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
			txtInputEmail = createTestObjectByXpath("txtInputEmail", "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")
			txtInputAlternateEmail = createTestObjectByXpath("txtInputAlternateEmail", "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.EditText")
			btnSave = createTestObjectByXpath("btnSave", "//android.widget.TextView[@content-desc='Save']")
		} else if(GlobalVariable.OS_Phone == Constants.IOS.toLowerCase()) {
			btn8 = createTestObjectByXpath("btn8", "//XCUIElementTypeButton[@name='8']")
			btn2 = createTestObjectByXpath("btn8", "//XCUIElementTypeButton[@name='2']")
		}
	}


	def void add() {
		if(GlobalVariable.OS_Phone == Constants.ANDROID.toLowerCase()) {
			Helper.tap(btnAdd)
			Helper.sendKeys(txtInputName, "Bank Mandiri Automation")
			Helper.sendKeys(txtInputPhone, "0857623527283")
			Helper.sendKeys(txtInputAlternatePhone, "0857623527283")
			Helper.sendKeys(txtInputEmail, "automation@bankmandiri.co.id")
			Helper.sendKeys(txtInputAlternateEmail, "automation@bankmandiri.co.id")
			Helper.tap(btnSave)
		}else if(GlobalVariable.OS_Phone == Constants.IOS.toLowerCase()){
			Helper.tap(btn8)
			Helper.tap(btn2)
			Helper.tap(btn8)
		}
	}
}