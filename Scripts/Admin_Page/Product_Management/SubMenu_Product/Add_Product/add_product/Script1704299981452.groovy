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

WebUI.setText(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Login/input_Email_email'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Login/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Homepage/img_icon_profile'))

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Homepage/a_admin_dashboard'))

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Dashboard/menu_burger'))

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Dashboard/menu_product'))

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/button_Add Product'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/select_types'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/choose_image'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/select_category'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/select_brands'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/select_brands'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/product_name'))

WebUI.setText(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/input_product_name'), 
    'Hijab Kece')

WebUI.setText(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/input_description'), 
    'ini adalah hijab kece')

WebUI.click(findTestObject('Object Repository/Admin_Page_OR/Product_Management_OR/SubMenu_Product_OR/Add_Product_OR/Page_Admin Products/button_Save'))

WebUI.closeBrowser()

