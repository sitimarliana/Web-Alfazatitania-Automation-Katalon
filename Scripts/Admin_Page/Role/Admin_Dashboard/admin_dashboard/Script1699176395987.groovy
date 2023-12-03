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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(findTestObject('Object Repository/Admin_Page_OR/Role_OR/Admin_Dashboard_OR/Page_Login/input_Email_email'), 
    GlobalVariable.userName)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin_Page_OR/Role_OR/Admin_Dashboard_OR/Page_Login/input_Password_password'), 
    GlobalVariable.password)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Role_OR/Admin_Dashboard_OR/Page_Login/input_Password_remember_me'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Role_OR/Admin_Dashboard_OR/Page_Login/button_Sign in'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Role_OR/Admin_Dashboard_OR/Page_Admin Homepage/img_Open user menu_w-8 h-8 rounded-full'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Role_OR/Admin_Dashboard_OR/Page_Admin Homepage/a_Admin                                Dashboard'))

