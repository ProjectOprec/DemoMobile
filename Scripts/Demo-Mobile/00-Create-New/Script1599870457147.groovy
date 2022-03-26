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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.sourcey.materialloginexample')

Mobile.tap(findTestObject('login/00-new/android.widget.TextView0 - No account yet Create one'), 0)

Mobile.setText(findTestObject('login/00-new/android.widget.EditText0'), GlobalVariable.nama, 0)

Mobile.setText(findTestObject('login/00-new/android.widget.EditText0 (1)'), GlobalVariable.alamat, 0)

Mobile.setText(findTestObject('login/00-new/android.widget.EditText0 (2)'), GlobalVariable.email_baru, 0)

Mobile.setText(findTestObject('login/00-new/android.widget.EditText0 (3)'), GlobalVariable.no_mobile, 0)

Mobile.setEncryptedText(findTestObject('login/00-new/android.widget.EditText0 (4)'), 'KoxnCZabC7c=', 0)

Mobile.setEncryptedText(findTestObject('login/00-new/android.widget.EditText0 (5)'), 'KoxnCZabC7c=', 0)

Mobile.tap(findTestObject('login/00-new/android.widget.Button0 - CREATE ACCOUNT'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.pressBack()
