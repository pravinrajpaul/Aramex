import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open the OrangeHRM application
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.APP_URL)

// Set username and password
WebUI.setText(findTestObject('HR_APP/Page_OrangeHRM/input_Username_username'), 'Admin')

not_run: WebUI.setText(findTestObject('HR_APP/Page_OrangeHRM/input_Password_password'), 'admin123')

WebUI.setEncryptedText(findTestObject('HR_APP/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

// Click on login button
WebUI.click(findTestObject('HR_APP/Page_OrangeHRM/button_Required_oxd-button oxd-button--medium oxd-button--main orangehrm-login-button'))

// Verify if we landed on the Dashboard page
WebUI.verifyElementPresent(findTestObject('HR_APP/Page_OrangeHRM/h6_Buzz_oxd-text oxd-text--h6 oxd-topbar-he_ad8d38'), 10)

// Close the browser
WebUI.closeBrowser()

