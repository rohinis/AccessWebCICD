import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.aventstack.extentreports.Status
import com.aventstack.extentreports.MediaEntityBuilder

import internal.GlobalVariable as GlobalVariable

if(TestCaseName.contains('tile view'))
{
	println('tile view not supported in this module')
}
else
{
	
	TestCaseName='JobSubmission RFB - '+TestCaseName
	if (TestOperation.contains('icon')) {
		TestCaseName = (TestCaseName + ' thorugh top menu icons')
	}
	
	//====================================================================================
	def Browser = GlobalVariable.G_Browser
	//===============================================================
	def extentTest=GlobalVariable.G_ExtentTest
	//===============================================================
	CustomKeywords.'toLogin.ForLogin.Login'(extentTest)
	//=====================================================================================
	def navLocation = CustomKeywords.'generateFilePath.filePath.execLocation'()
	def location
	def result
	if (TestOperation.contains('icon'))
	{
		location = navLocation + '/FoldersModule/FolderOpsIcons'
	}
	else
	{
		location = navLocation + '/FoldersModule/FolderOpsContextMenu'
	}
	//=====================================================================================
	WebUI.delay(2)
	newFolderObj = WebUI.modifyObjectProperty(findTestObject('FilesPage/RowItem_Folder'), 'data-automation-id', 'equals', folderName,true)

	try {def jobsTab = CustomKeywords.'customWait.WaitForElement.WaitForelementPresent'(findTestObject('LoginPage/NewJobPage/AppList_ShellScript'),
		20,extentTest,'Jobs Tab')

		if (jobsTab) {
			WebUI.click(findTestObject('GenericObjects/TitleLink_Jobs'))
		}

		extentTest.log(Status.PASS, 'Navigated Job Tab')
		WebUI.delay(2)

		TestObject newAppObj = WebUI.modifyObjectProperty(findTestObject('LoginPage/NewJobPage/AppList_ShellScript'), 'id', 'equals',
				AppName, true)

		WebUI.click(newAppObj)
		extentTest.log(Status.PASS, 'Navigated to Job Submission For for - '+AppName)

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LoginPage/NewJobPage/GenericProfile'))
		WebUI.delay(2)


		if (TestCaseName.contains('Upload')) {
			println(TestOperation //	WebUI.click(newFolderObj)
					//WebUI.click(newFolderObj)
					)
		}
		else
		{
			/*WebUI.click(findTestObject('Object Repository/FilesPage/Icon_EditFilePath'))
			WebUI.setText(findTestObject('Object Repository/FilesPage/textBx_FilePath'), location)
			WebUI.sendKeys(findTestObject('Object Repository/FilesPage/textBx_FilePath'), Keys.chord(Keys.ENTER))
			extentTest.log(Status.PASS, 'Navigated to - ' + location)*/
			CustomKeywords.'generateFilePath.filePath.navlocation'(location, extentTest)
			WebUI.click(findTestObject('FilesPage/FilesSearch_filter'))
			WebUI.waitForElementVisible(findTestObject('FilesPage/FilesSearch_filter'), 2)
			WebUI.setText(findTestObject('FilesPage/FilesSearch_filter'), folderName)
			WebUI.sendKeys(findTestObject('JobDetailsPage/TextBx_DetailsFilter'), Keys.chord(Keys.ENTER))
			extentTest.log(Status.PASS, 'Clicked on File  - ' + folderName)
			def folderItem = CustomKeywords.'customWait.WaitForElement.WaitForelementPresent'(newFolderObj, 20, extentTest, folderName)
			println(folderItem)

			if (TestOperation.contains('icon'))
			{
				WebUI.waitForElementPresent(newFolderObj, 3)
				WebUI.click(newFolderObj)
				extentTest.log(Status.PASS, 'Clicked on file ' + folderName)
				result = CustomKeywords.'operations_FileModule.folderOperations_Icon.executeFolderOperations'(TestOperation, TestCaseName, extentTest)
			}
			else
			{
				WebUI.waitForElementPresent(newFolderObj, 3)
				WebUI.click(newFolderObj)
				WebUI.rightClick(newFolderObj)
				extentTest.log(Status.PASS, 'Right Clicked File to invoke context menu on  - ' + folderName)
				result = CustomKeywords.'operations_FileModule.folderOperations.executeFolderOperations'(TestOperation, TestCaseName, extentTest)
			}

		}

		WebUI.delay(2)

		println('after is else ' + TestOperation)

		if (result)
		{
			extentTest.log(Status.PASS, ('Verified - ' + TestCaseName) + '  Sucessfully')
		} else {
			extentTest.log(Status.FAIL,  TestCaseName + ' - failed')
		}

	}

	catch (Exception ex) {
		println('From TC - ' + GlobalVariable.G_ReportFolder)
	 
		String screenShotPath = (('ExtentReports/' + TestCaseName) + GlobalVariable.G_Browser) + '.png'
	 
		WebUI.takeScreenshot(screenShotPath)
	 
		String p = (TestCaseName + GlobalVariable.G_Browser) + '.png'
	 
		extentTest.log(Status.FAIL, ex)
	 
		extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(p).build())
	}
	catch (StepErrorException e) {
		String screenShotPath = (('ExtentReports/' + TestCaseName) + GlobalVariable.G_Browser) + '.png'
	 
		WebUI.takeScreenshot(screenShotPath)
	 
		String p = (TestCaseName + GlobalVariable.G_Browser) + '.png'
	 
		extentTest.log(Status.FAIL, ex)
	 
		extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(p).build())
	}
	finally {
		extentTest.log(Status.PASS, 'Closing the browser after executinge test case - ' + TestCaseName)
	
	}
	//=====================================================================================
	
	
}