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

WebUI.navigateToUrl('https://pongvarid.github.io/probation_client_nuxt/?fbclid#/admin/account/')

WebUI.setText(findTestObject('Object Repository/testcase/Page_/input__input-23'), 'le')

WebUI.setEncryptedText(findTestObject('Object Repository/testcase/Page_/input__input-26'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/testcase/Page_/span_'))

WebUI.click(findTestObject('Object Repository/testcase/Page_/i__v-icon notranslate mdi mdi-account theme--light'))

WebUI.click(findTestObject('Object Repository/testcase/Page_/div_'))

WebUI.click(findTestObject('Object Repository/testcase/Page_/span__1'))

for (def index : (0..0)) {
    WebUI.setText(findTestObject('Object Repository/testcase/Page_/input__id'), findTestData('testdata/New Test Data').getValue(
            1, index))

    WebUI.sendKeys(findTestObject('testcase/Page_/input__id'), Keys.chord(Keys.TAB))

    WebUI.setText(findTestObject('Object Repository/testcase/Page_/input__id'), findTestData('testdata/New Test Data').getValue(
            2, index))

    WebUI.click(findTestObject('Object Repository/testcase/Page_/span__1_2'))

    WebUI.click(findTestObject('Object Repository/testcase/Page_/button_'))
}

WebUI.closeBrowser()

