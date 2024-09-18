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

WebUI.callTestCase(findTestCase('Superadmin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Happypath/Page_Xage-care/div_Agency In-Review1'))

WebUI.click(findTestObject('Happypath/Page_Xage-care/button_Invite'))

WebUI.setText(findTestObject('Happypath/Page_Xage-care/input_Agency Name_r2l'), Agency)

WebUI.setText(findTestObject('Happypath/Page_Xage-care/input_Agency Admin Full Name_r2n'), 'Lionel Messi')

WebUI.setText(findTestObject('Happypath/Page_Xage-care/input_Agency Admin Contact_r2r'), '897877878')

WebUI.setText(findTestObject('Happypath/Page_Xage-care/input_Agency Admin Email Id_r2p'), 'messi@gmail.com')

WebUI.setText(findTestObject('Happypath/Page_Xage-care/Page_Xage-care/input_Select City_r81'), 'eng')

WebUI.waitForElementPresent(findTestObject('Happypath/Page_Xage-care/li_Arniston Engine'), 10)

WebUI.click(findTestObject('Happypath/Page_Xage-care/li_Arniston Engine'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Happypath/Page_Xage-care/Page_Xage-care/input_Select Country_r85'), 'ind')

WebUI.waitForElementPresent(findTestObject('Happypath/Page_Xage-care/li_Indonesia'), 5)

WebUI.click(findTestObject('Happypath/Page_Xage-care/li_Indonesia'))

WebUI.waitForElementPresent(findTestObject('Happypath/Page_Xage-care/button_Send'), 5)

WebUI.click(findTestObject('Happypath/Page_Xage-care/button_Send'))

WebUI.waitForElementPresent(findTestObject('Happypath/Page_Xage-care/div_Agency Pending'), 0)

WebUI.click(findTestObject('Happypath/Page_Xage-care/div_Agency Pending'))

WebUI.verifyElementText(findTestObject('Happypath/Page_Xage-care/path'), Agency)

