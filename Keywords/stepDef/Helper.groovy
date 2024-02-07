package stepDef
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject

import io.appium.java_client.AppiumDriver

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.text.DecimalFormat
import java.text.ParseException
import java.text.SimpleDateFormat

import java.time.Duration
import java.time.LocalDate
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit
import java.util.function.Function
import java.util.regex.Matcher

import com.github.kklisura.cdt.protocol.commands.DeviceOrientation

import org.apache.commons.io.FileUtils
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.util.WorkbookUtil
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.openqa.selenium.By
import org.openqa.selenium.InvalidElementStateException
import org.openqa.selenium.Keys
import org.openqa.selenium.OutputType

import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepErrorException
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.driver.AppiumDriverSession
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.MobileCapabilityType
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions
import io.appium.java_client.screenrecording.CanRecordScreen
import io.appium.java_client.touch.TapOptions
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidStartScreenRecordingOptions
import io.appium.java_client.clipboard.ClipboardContentType
import io.appium.java_client.clipboard.HasClipboard
import io.appium.java_client.functions.ExpectedCondition
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.ios.IOSStartScreenRecordingOptions
import io.appium.java_client.ios.IOSStartScreenRecordingOptions.VideoQuality
import io.appium.java_client.MobileBy
import io.appium.java_client.MobileBy.ByCustom
import org.openqa.selenium.Point
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

import atu.testrecorder.ATUTestRecorder
import atu.testrecorder.exceptions.ATUTestRecorderException
import groovy.json.JsonSlurper

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

public class Helper {

	def static void tap(TestObject object){
		Mobile.tap(object, 5)
	}

	def static void sendKeys(TestObject object, String input) {
		Mobile.sendKeys(object, input)
	}
}