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

WebUI.openBrowser('https://test-care.xage.care/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Create clinical/Page_Xage-care/input_Username_username'), 'vishnu.p@xcubated.com')

WebUI.setText(findTestObject('Create clinical/Page_Xage-care/input_Password_r3'), 'Roger007#')

WebUI.click(findTestObject('Create clinical/Page_Xage-care/button_Sign In'))

WebUI.click(findTestObject('Create clinical/Page_Xage-care/div_Active user2'))

WebUI.click(findTestObject('Create clinical/Page_Xage-care/button_Add User'))

WebUI.setText(findTestObject('Create clinical/Page_Xage-care/input_First Name_r2d'), 'David')

WebUI.setText(findTestObject('Create clinical/Page_Xage-care/input_Last Name_r2f'), 'Beckham')

WebUI.setText(findTestObject('Create clinical/Page_Xage-care/input_Email_r2h'), '55yearling@starmail.net')

WebUI.setText(findTestObject('Create clinical/Page_Xage-care/input_Contact_r2n'), '88796856')

WebUI.setText(findTestObject('Create clinical/Page_Xage-care/input_Select Country_r2j'), 'eng')

WebUI.waitForElementClickable(findTestObject('Create clinical/Page_Xage-care/li_england'), 10)

WebUI.click(findTestObject('Create clinical/Page_Xage-care/li_england'))

WebUI.click(findTestObject('Create clinical/Page_Xage-care/div_Select RoleSelect Role'))

WebUI.click(findTestObject('Create clinical/Page_Xage-care/li_Clinical Lead'))

WebUI.setText(findTestObject('Page_Xage-care/selectcity'), 'wal')

WebUI.waitForElementClickable(findTestObject('Create clinical/Page_Xage-care/li_Adwalton'), 10)

WebUI.click(findTestObject('Create clinical/Page_Xage-care/li_Adwalton'))

WebUI.waitForElementClickable(findTestObject('send button'), 5)

WebUI.click(findTestObject('send button'))

