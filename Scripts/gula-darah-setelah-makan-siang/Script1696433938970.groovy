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

Mobile.startApplication('C:\\Users\\ivanr\\Downloads\\Teman Diabetes_1.7.21_Apkpure.apk', true)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - Pilih Jenis Gula Darah (1)'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.CheckedTextView - 1-2 Jam Setelah Makan Siang'), 
    0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.EditText - Input Waktu (1)'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - KONFIRMASI (1)'), 0)

Mobile.setText(findTestObject('Object Repository/gula-darah/android.widget.EditText - 128 MgdL (1)'), '120', 0)

Mobile.setText(findTestObject('Object Repository/gula-darah/android.widget.EditText - Silahkan isi disini (2)'), 'Soto Betawi', 
    0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - SELESAI (1)'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - Ya, Benar (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\ivanr\\AppData\\Local\\Temp\\screenshot5648737892981540504.png')

Mobile.closeApplication()

