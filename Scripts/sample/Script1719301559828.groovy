import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.assertthat.selenium_shutterbug.utils.web.Browser
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable





		def Browser = GlobalVariable.G_Browser

		WebUI.openBrowser(GlobalVariable.G_BaseUrl)

		WebUI.setText(findTestObject('LoginPage/username_txtbx'), GlobalVariable.G_userName)
		WebUI.setText(findTestObject('LoginPage/password_txtbx'), "asdasdasd")
		WebUI.click(findTestObject('LoginPage/login_btn'))
		
		WebUI.click(findTestObject('Object Repository/Landing_Page/LandigPage_AltairAccess_Link'))
		


