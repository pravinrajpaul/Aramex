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

Mobile.startApplication('C:\\Users\\pravi\\Katalon Studio\\AramexWeb\\Resources\\Mobile\\Telegram.apk', true)

Mobile.tap(findTestObject('Object Repository/Mobile_APP/android.widget.TextView - Start Messaging'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_APP/android.widget.TextView -  India'), 0)

Mobile.scrollToText(country)

Mobile.tap(findTestObject('Mobile_APP/android.widget.TextView -  Chile', [('country') : country]), 0)

Mobile.setText(findTestObject('Object Repository/Mobile_APP/android.widget.EditText (1)'), '51347837430', 0)

Mobile.tap(findTestObject('Object Repository/Mobile_APP/android.view.View'), 0)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Mobile_APP/android.widget.TextView - This phone number is banned'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile_APP/android.widget.TextView - OK'), 0)

Mobile.closeApplication()

