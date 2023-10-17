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

//script

//open browser
WebUI.openBrowser("http://jupiterprime-react-dev.s3-website.us-east-2.amazonaws.com/")
//click login button
WebUI.click(findTestObject('Object Repository/Scripted/Page_JupiterPrime/button_Login'))
//Enter username
WebUI.setText(findTestObject('Object Repository/Scripted/Page_JupiterPrime/input__username'), "bini")
//Enter password
WebUI.setText(findTestObject('Object Repository/Scripted/Page_JupiterPrime/input__password'), "letmein")
//Click I agree
WebUI.click(findTestObject('Object Repository/Scripted/Page_JupiterPrime/label_I agree to the terms of service'))
//Click on login button
WebUI.click(findTestObject('Object Repository/Scripted/Page_JupiterPrime/button_Log In'))
//Verify user logged in
WebUI.verifyElementPresent(findTestObject('Object Repository/Scripted/Page_JupiterPrime/span_Hi bini'), 4)
//Verify name of user logged in
WebUI.click(findTestObject('Object Repository/Scripted/Page_JupiterPrime/Page_JupiterPrime/a_Home'))
//Verify user is on homepage
WebUI.verifyElementClickable(findTestObject('Object Repository/Scripted/Page_JupiterPrime/Page_JupiterPrime/a_Start Shopping'))
//logout
WebUI.click(findTestObject('Object Repository/Scripted/Page_JupiterPrime/Page_JupiterPrime/button_Log Out'))
//Close browser
WebUI.closeBrowser()