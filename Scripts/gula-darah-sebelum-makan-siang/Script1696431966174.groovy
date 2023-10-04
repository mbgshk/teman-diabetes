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

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - Rekaman'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - Pilih Jenis Gula Darah'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.CheckedTextView - Sebelum Makan Siang'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.EditText - Input Waktu'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - KONFIRMASI'), 0)

Mobile.setText(findTestObject('Object Repository/gula-darah/android.widget.EditText - 128 MgdL'), '128', 0)

Mobile.setText(findTestObject('Object Repository/gula-darah/android.widget.EditText - Nasi Goreng'), 'Bubur Ayam', 0)

Mobile.setText(findTestObject('Object Repository/gula-darah/android.widget.EditText - Kue Lapis'), 'Gorengan', 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - SELESAI'), 0)

Mobile.tap(findTestObject('Object Repository/gula-darah/android.widget.TextView - Ya, Benar'), 0)

Mobile.takeScreenshot('C:\\Users\\ivanr\\AppData\\Local\\Temp\\screenshot6313988260333872940.png')

Mobile.closeApplication()

