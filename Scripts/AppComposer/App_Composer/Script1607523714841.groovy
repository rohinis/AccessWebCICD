import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.support.events.EventFiringWebDriver as EventFiringWebDriver
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

import com.aventstack.extentreports.MediaEntityBuilder
import com.aventstack.extentreports.Status
/*
'Login into PAW '
WebUI.callTestCase(findTestCase('XRepeated_TC/Login'), [('username') : GlobalVariable.G_userName, ('password') : GlobalVariable.G_Password],
FailureHandling.STOP_ON_FAILURE)
*/
WebDriver driver = DriverFactory.getWebDriver()

EventFiringWebDriver eventFiring = ((DriverFactory.getWebDriver()) as EventFiringWebDriver)

// Get the driver wrapped inside
WebDriver wrappedWebDriver = eventFiring.getWrappedDriver()

// Cast the wrapped driver into RemoteWebDriver
//RemoteWebDriver katalonWebDriver = ((wrappedWebDriver) as RemoteWebDriver)
RemoteWebDriver katalonWebDriver = (RemoteWebDriver) wrappedWebDriver
//===========================================================
def Browser = GlobalVariable.G_Browser
//===========================================================
def extentTest=GlobalVariable.G_ExtentTest
//===========================================================
CustomKeywords.'toLogin.ForLogin.Login'(extentTest)
//===========================================================



def result=false



WebUI.delay(2)



try {
	WebUI.delay(2)

	WebUI.click(findTestObject('PageNavigation/Preferences/Profiletab'))

	extentTest.log(Status.PASS, 'Click on profile tab')

	WebUI.delay(2)

	WebUI.click(findTestObject('AppComposer/Appcomposer'))

	extentTest.log(Status.PASS, 'Click on the App composer')
	WebUI.delay(2)

boolean hpcclusterTmp=	WebUI.waitForElementVisible(findTestObject('Object Repository/AppComposer/hpcluster_temp'), 10)
if(hpcclusterTmp) {
	
	WebUI.click(findTestObject('Object Repository/AppComposer/hpcluster_temp'))
	WebUI.mouseOver(findTestObject('Object Repository/AppComposer/hpcluster_temp'))
	//WebUI.delay(2)
	
	boolean newAppTemp=WebUI.verifyElementPresent(findTestObject('Object Repository/AppComposer/NewApp_temp'), 5)
	if(newAppTemp) {
	WebUI.click(findTestObject('Object Repository/AppComposer/NewApp_temp'))
	extentTest.log(Status.PASS, 'Clicked on new Appcomposer')}
}
	switch (userChoice) {
		case 'New App':
			
		CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
			WebUI.click(findTestObject('AppComposer/JobsTab'))

			extentTest.log(Status.PASS, 'Navigated to Jobs Tab')

			result=WebUI.verifyElementPresent(findTestObject('AppComposer/TestApp'), 3)
			
			if (result)
			{
			extentTest.log(Status.PASS, ('Verify app ' + app) + ' on Jobs page')
			} else {
			extentTest.log(Status.FAIL, ( 'Verify App') +  ':: failed')
			}
			
			
			 break
			 
		
		
		
		case 'Empty Fields':
			WebUI.click(findTestObject('AppComposer/Save'))

			extentTest.log(Status.PASS, 'Click on Save button ')

			result=WebUI.verifyElementPresent(findTestObject('AppComposer/Error'), 3)
			if(result) {
				extentTest.log(Status.PASS, 'Error message pop up is present')
			}
			else
			{
				extentTest.log(Status.FAIL, 'failed to verify the popup')
			}

	   

			WebUI.takeScreenshot(screenShot)

			extentTest.log(Status.PASS, 'Verify through screenshot ')

			break
		case 'Untitled':
			WebUI.click(findTestObject('AppComposer/Executableinput'))

			extentTest.log(Status.PASS, 'Click to add exec commands')

			WebUI.setText(findTestObject('AppComposer/Executableinput'), '')

			WebUI.setText(findTestObject('AppComposer/Executableinput'), exec)

			extentTest.log(Status.PASS, 'Add Exec commands - ' + exec)

			WebUI.click(findTestObject('AppComposer/Save'))

			extentTest.log(Status.PASS, 'Click on Save button')

			 result=WebUI.verifyElementPresent(findTestObject('AppComposer/Untitled_app'), 3)
			 
			 if (result)
			 {
			  extentTest.log(Status.PASS, 'Verify app created with name untitled')
			 } else {
			 extentTest.log(Status.FAIL, 'Failed to create the app untitled')
			 }

		   break
		case 'Duplicate App':
		CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
		  

		   result= WebUI.verifyElementPresent(findTestObject('AppComposer/TestApp'), 3)
		   if (result)
			   {
				   extentTest.log(Status.PASS, 'app created with the duplicate name')
			   } else {
			   extentTest.log(Status.FAIL, 'Failed to create the App')
			   }
		 

			break
		case 'Special char':
			WebUI.delay(3)
			CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)

			  WebUI.click(findTestObject('AppComposer/JobsTab'))

			extentTest.log(Status.PASS, 'Navigated to Jobs Tab')

		   result= WebUI.verifyElementPresent(findTestObject('AppComposer/Test12App'), 3)
		   if (result)
			   {
				   extentTest.log(Status.PASS, ('Verify app ' + app) + ' on Jobs page')
			   } else {
			   extentTest.log(Status.FAIL, 'Failed to create the App'+app)
			   }
		 

			

			break
		case 'Empty Exec':
			WebUI.click(findTestObject('AppComposer/AppName'))

			extentTest.log(Status.PASS, 'Click to Entered App name')

			WebUI.doubleClick(findTestObject('AppComposer/AppName'))

	   
			WebUI.sendKeys(findTestObject('AppComposer/AppName'), Keys.chord(Keys.CONTROL,'a'))

			WebUI.setText(findTestObject('AppComposer/AppName'), '')

			WebUI.setText(findTestObject('AppComposer/AppName'), app)

			extentTest.log(Status.PASS, 'Entered App name -' + app)

			WebUI.click(findTestObject('AppComposer/Save'))

			extentTest.log(Status.PASS, 'Click on Save button')

			result=WebUI.verifyElementPresent(findTestObject('AppComposer/Error'), 3)
			if (result)
				{
					   extentTest.log(Status.PASS, 'Verify pop up exec commands required')
				} else {
				extentTest.log(Status.FAIL, 'Failed to verify the popup')
				}

		 

			break
		case 'Input type':
		  
			result=WebUI.verifyElementPresent(findTestObject('AppComposer/Basic-SMP'), 3)
			def result1 = WebUI.verifyElementPresent(findTestObject('AppComposer/Cores_pre'), 3)

		
			if(result && result1) {
				extentTest.log(Status.PASS, 'Verify by default input type is Basic-SMP')
				extentTest.log(Status.PASS, 'Verify cores present in pre window')
			}

			else {
				extentTest.log(Status.FAIL, 'failed to verify the input type')
			}
			break
		case 'Space':
			WebUI.delay(5)

		   // WebUI.click(findTestObject('AppComposer/JobsTab'))

			//extentTest.log(Status.PASS, 'Navigated to Jobs Tab')

			//WebUI.verifyElementNotPresent(findTestObject('AppComposer/TestSpace'), 10)

			//extentTest.log(Status.PASS, ('Verify app ' + app) + ' not present in Jobs page')
			WebUI.delay(2)

		   // WebUI.click(findTestObject('PageNavigation/Preferences/Profiletab'))

		   // extentTest.log(Status.PASS, 'Click on profile tab')

	   

		   // WebUI.click(findTestObject('AppComposer/Appcomposer'))

		   // extentTest.log(Status.PASS, 'Click on App composer')
			//WebUI.delay(2)
			CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)

		  
			WebUI.click(findTestObject('AppComposer/JobsTab'))

			extentTest.log(Status.PASS, 'Navigated to Jobs Tab')

			result=WebUI.verifyElementPresent(findTestObject('AppComposer/TestSpace'), 20)
			if (result)
				{
				extentTest.log(Status.PASS, ('Verify app ' + app) + ' on Jobs page')
				} else {
				extentTest.log(Status.FAIL, 'Failed to verify the app' +app)
				}

		 break
		case 'Delete App':
		CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
		
	   

			WebUI.click(findTestObject('AppComposer/JobsTab'))

			extentTest.log(Status.PASS, 'Navigated to Jobs Tab')

			WebUI.verifyElementPresent(findTestObject('AppComposer/TestApp'), 3)

			extentTest.log(Status.PASS, 'Verify app present in Jobs page')

			WebUI.delay(2)

			WebUI.click(findTestObject('PageNavigation/Preferences/Profiletab'))

			extentTest.log(Status.PASS, 'Click on profile tab')

			WebUI.delay(2)

			WebUI.waitForElementVisible(findTestObject('AppComposer/Appcomposer'), 10)

			WebUI.click(findTestObject('AppComposer/Appcomposer'))

			extentTest.log(Status.PASS, 'Click on App composer')

			WebUI.delay(5)

			WebUI.click(findTestObject('AppComposer/LeftIcon'))

			extentTest.log(Status.PASS, 'Click on left icon Test App')

			WebUI.click(findTestObject('AppComposer/Delete'))

			extentTest.log(Status.PASS, 'Click on delete button')

			WebUI.verifyElementPresent(findTestObject('AppComposer/DeletePopUp'), 3)

			extentTest.log(Status.PASS, 'Verify delete app notification')

			WebUI.click(findTestObject('Landing_Page/Btn_Notifiction2'))

			extentTest.log(Status.PASS, 'Click on Notification button to open Notification Panel')

			String msg = 'Deleted Test application successfully'

			WebUI.delay(2)

			result = WebUI.verifyElementPresent(findTestObject('Object Repository/AppComposer/DeletePopUp'), 5)

			println('notification status - ' + result)

			if (result) {
				extentTest.log(Status.PASS, ' Deleted application and verified notification')

				extentTest.log(Status.PASS, ('Notification with msg - "' + msg) + '" is listed') //extentTest.log(Status.PASS, fileToCheck + ' - Not pasted')
			} else {
				extentTest.log(Status.FAIL)
			}
			
			WebUI.click(findTestObject('Landing_Page/Btn_Notifiction2'))

			extentTest.log(Status.PASS, 'Click on Notification button to close Notification Panel')

			break
		case 'Manage Para':
		//CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
			WebUI.click(findTestObject('AppComposer/AppName'))

			extentTest.log(Status.PASS, 'Click to Entered App name')

			WebUI.doubleClick(findTestObject('AppComposer/AppName'))

			WebUI.sendKeys(findTestObject('AppComposer/AppName'), Keys.chord(Keys.CONTROL,'a'))

			WebUI.setText(findTestObject('AppComposer/AppName'), '')

			WebUI.setText(findTestObject('AppComposer/AppName'), app)

			extentTest.log(Status.PASS, 'Entered App name -' + app)

			WebUI.click(findTestObject('AppComposer/InputFile'))

			WebUI.setText(findTestObject('AppComposer/InputFile'), input)

			extentTest.log(Status.PASS, 'Click on Input file -' + input)

			WebUI.click(findTestObject('AppComposer/Executableinput'))

			WebUI.setText(findTestObject('AppComposer/Executableinput'), '')

			WebUI.setText(findTestObject('AppComposer/Executableinput'), exec)

			extentTest.log(Status.PASS, 'Add exec commands - ' + exec)

			/*WebUI.click(findTestObject('AppComposer/WallTime_arrow'))

			extentTest.log(Status.PASS, 'Click on wall time arrow')

			WebUI.verifyElementPresent(findTestObject('AppComposer/Tickmark'), 3)*/

			WebUI.click(findTestObject('AppComposer/Manage_Parameter'))

			extentTest.log(Status.PASS, 'Click on Application Manage parameter')

			WebUI.click(findTestObject('AppComposer/Project_lbl'))

			extentTest.log(Status.PASS, 'Select project parameter')

			WebUI.click(findTestObject('AppComposer/Single_arrow'))

			extentTest.log(Status.PASS, 'Click on single arrow')

			WebUI.click(findTestObject('AppComposer/Done_btn'))

			extentTest.log(Status.PASS, 'Click on Done button')
			WebUI.delay(2)
			WebUI.click(findTestObject('AppComposer/Save'))
			
						extentTest.log(Status.PASS, 'Click on Save button')

			//WebUI.click(findTestObject('AppComposer/Dotmark'))
			//extentTest.log(Status.PASS, 'Click on all fields in preview and test window')
						WebUI.delay(4)
			result=WebUI.waitForElementPresent(findTestObject('AppComposer/Project_pre'), 10)

			extentTest.log(Status.PASS, 'Verify project label present')

			break
		case 'Preview':

		   // WebUI.click(findTestObject('AppComposer/WallTime_arrow'))

			WebUI.click(findTestObject('AppComposer/WallTime_input'))
			
			extentTest.log(Status.PASS, 'Click on wall time arrow')

			//WebUI.verifyElementPresent(findTestObject('AppComposer/Tickmark'), 3)
			String wall = WebUI.getAttribute(findTestObject('AppComposer/WallTime_input'), 'value')

			//println ("Value --- "+ wall)
			extentTest.log(Status.PASS, 'Print wall time value -' + wall)

			//extentTest.log(Status.PASS, 'Print wall time value')
			WebUI.click(findTestObject('AppComposer/WallTime_pre'))

			//WebUI.verifyElementPresent(findTestObject('AppComposer/Tickmark'), 3)
			extentTest.log(Status.PASS, 'Click on wall time in preview and test window')

			String wall1 = WebUI.getAttribute(findTestObject('AppComposer/WallTime_pre'), 'value')

			//println ("Value --- "+ wall1)
			extentTest.log(Status.PASS, 'Print wall time value in preview and test window-' + wall1)
			result=(wall == wall1)

			if (result) {
				println('pass')

				extentTest.log(Status.PASS, 'Both values matched hence passed')
			} else {
				println('failed')

				extentTest.log(Status.FAIL, 'Both values did not match hence fail')
			}
			
			/*
			WebUI.delay(3)
			WebUI.click(findTestObject('AppComposer/Cores_arrow'))
			extentTest.log(Status.PASS, 'Click on no of cores arrow')
			
			
			WebUI.click(findTestObject('AppComposer/Number of Cores'))
			WebUI.delay(2)
			String core=WebUI.getAttribute(findTestObject('Object Repository/AppComposer/cores_vlaue'), 'value')

			println ("Value --- "+ core)
			extentTest.log(Status.PASS, 'Print no of cores value')
			
			WebUI.click(findTestObject('AppComposer/Cores_pre'))
		//WebUI.verifyElementPresent(findTestObject('AppComposer/Tickmark'), 3)

			String core1=WebUI.getAttribute(findTestObject('AppComposer/Cores_pre'), 'value')

			println ("Value --- "+ core1)
			extentTest.log(Status.PASS, 'Print no of cores value in prview and test window')

			if(core == core1){

				println('pass')
				extentTest.log(Status.PASS, 'If both the values  match test case will pass')
			}
			else
			{
				println('failed')
				extentTest.log(Status.FAIL, 'If both the values not match test case will fail')
			}
 
			WebUI.click(findTestObject('AppComposer/AddFiles_arrow'))
			extentTest.log(Status.PASS, 'Click on add files')
			
			WebUI.click(findTestObject('AppComposer/AddFiles_tick'))
			extentTest.log(Status.PASS, 'Click on add file arrow')
			
			WebUI.verifyElementPresent(findTestObject('AppComposer/AddFiles_label'), 3)
			extentTest.log(Status.PASS, 'Verify add files label is present')
			
			*/
			break
		case 'JM pop up':
		
		WebUI.delay(2)
		CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec, extentTest)
		   
		  

		 /*   WebUI.click(findTestObject('AppComposer/TestApp_left'))

			extentTest.log(Status.PASS, 'Click on app on left side')

			WebUI.click(findTestObject('AppComposer/Save'))

			extentTest.log(Status.PASS, 'Click on save button')*/

			WebUI.verifyElementPresent(findTestObject('AppComposer/InputF'), 20)

			//WebUI.click(findTestObject('AppComposer/InputF'))
			def filePath = RunConfiguration.getProjectDir() + '/Upload/JobFiles/Running.sh'

			def newFP = new generateFilePath.filePath().getFilePath(filePath)

			println(newFP)

			WebUI.uploadFile(findTestObject('AppComposer/InputF'), newFP)

			extentTest.log(Status.PASS, 'Upload input file')

			WebUI.delay(2)

			WebUI.click(findTestObject('AppComposer/TestJm_left'))

			extentTest.log(Status.PASS, 'Click on app on left side')

			WebUI.click(findTestObject('AppComposer/Submit_btn'))

			extentTest.log(Status.PASS, 'Click on submit and test  button')

		   // WebUI.delay(6)
			/*

			WebUI.verifyElementPresent(findTestObject('AppComposer/RunningFolder'), 10)
			extentTest.log(Status.PASS, 'Verify running folder present')

			WebUI.click(findTestObject('AppComposer/CloseButton'))

			extentTest.log(Status.PASS, 'Click on cancel ')

			WebUI.click(findTestObject('AppComposer/JobsTab'))

			extentTest.log(Status.PASS, 'Navigated to Jobs Tab')

			WebUI.click(findTestObject('null'))

			extentTest.log(Status.PASS, 'Click on Notification button to open Notification Panel')

			WebUI.waitForElementPresent(findTestObject('Notificactions/Notification_JobSubmission'), 5)

			def jobText = WebUI.getText(findTestObject('Notificactions/Notification_JobSubmission'))

			def jobid = CustomKeywords.'operations_JobsModule.GetJobRowDetails.getJobID'(jobText)

			println('JobID is::' + jobid)

			extentTest.log(Status.PASS, 'Job ID - ' + jobid)

			extentTest.log(Status.PASS, 'Job Submission Done for - ' + TestCaseName)

*/
			return true
			
			
			break
		case 'Saved App':
		WebUI.delay(2)
		CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
			WebUI.delay(6)

			WebUI.click(findTestObject('AppComposer/TestAppSaved'))

			extentTest.log(Status.PASS, 'Click on TestSaved app on left side')

			//WebUI.click(findTestObject('AppComposer/Save'))
			//	extentTest.log(Status.PASS, 'Click on save button')
			WebUI.verifyElementPresent(findTestObject('AppComposer/InputF'), 3)

			//WebUI.click(findTestObject('AppComposer/InputF'))
			def filePath = RunConfiguration.getProjectDir() + '/Upload/JobFiles/Running.sh'

			def newFP = new generateFilePath.filePath().getFilePath(filePath)

			println(newFP)

			WebUI.uploadFile(findTestObject('AppComposer/InputF'), newFP)

			extentTest.log(Status.PASS, 'Upload input file')

			WebUI.delay(4)

			WebUI.click(findTestObject('AppComposer/TestAppSaved'))

			extentTest.log(Status.PASS, 'Click on TestSaved app on left side')

			WebUI.click(findTestObject('AppComposer/Submit_btn'))

			extentTest.log(Status.PASS, 'Click on submit and test  button')

			WebUI.click(findTestObject('AppComposer/CloseButton'))

			extentTest.log(Status.PASS, 'Click on cancel ')

			WebUI.click(findTestObject('AppComposer/JobsTab'))

			extentTest.log(Status.PASS, 'Navigated to Jobs Tab')

			result=WebUI.waitForElementPresent(findTestObject('Notificactions/Notification_JobSubmission'), 5)
			
			if(result) {

			def jobText = WebUI.getText(findTestObject('Notificactions/Notification_JobSubmission'))

			def jobid=CustomKeywords.'operations_JobsModule.GetJobRowDetails.getJobID'(jobText)

			extentTest.log(Status.PASS, 'Job ID - ' + jobid)
			}
			else {
				
				extentTest.log(Status.FAIL, 'Jobsubmission failed')
			}


			break
		   
		case 'No inputfile':
		//WebUI.delay(2)
		CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
		WebUI.delay(2)
		
				
				TestObject appdefname = WebUI.modifyObjectProperty(findTestObject('Object Repository/AppComposer/application_name'),'data-automation-id', 'equals', app, true)
				WebUI.click(appdefname)
				extentTest.log(Status.PASS, 'Select the Existing app def '+ app)
				WebUI.delay(3)
				
			/*boolean notReqInputF=	WebUI.verifyElementClickable(findTestObject('Object Repository/AppComposer/inputFileNotRequirec'))
			if(notReqInputF)
			{
				WebUI.click(findTestObject('Object Repository/AppComposer/inputFileNotRequirec'))
				WebUI.delay(2)
			}
			
			//WebUI.delay(1)
			WebUI.click(findTestObject('AppComposer/Save'))
			extentTest.log(Status.PASS, 'Click on Save button')
			
			WebUI.delay(2)*/
			WebUI.click(findTestObject('AppComposer/Submit_btn'))
			extentTest.log(Status.PASS, 'Click on Submit and test button')

			result=WebUI.verifyElementPresent(findTestObject('AppComposer/Tooltip_Inputfile'), 5)
			if(result) {
				extentTest.log(Status.PASS, 'Verify input file is not present in preview window' )
			extentTest.log(Status.PASS, 'Verify the Tool-tip '+"Required"+' is present')
			}
			else {
				extentTest.log(Status.PASS, 'Failed to verify')
			}
		

			WebUI.takeScreenshot(screenShot)

			extentTest.log(Status.PASS, 'Verify through screenshot ')

			break
			
			case 'Without inputfile':
			//WebUI.delay(2)
			CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
			WebUI.delay(2)
			
					
					TestObject appdefname = WebUI.modifyObjectProperty(findTestObject('Object Repository/AppComposer/application_name'),'data-automation-id', 'equals', app, true)
					WebUI.click(appdefname)
					extentTest.log(Status.PASS, 'Select the Existing app def '+ app)
					WebUI.delay(3)
				
				WebUI.click(findTestObject('AppComposer/Submit_btn'))
				
				extentTest.log(Status.PASS, 'Click on Submit and test button')
				
		boolean notReqInputF=		WebUI.verifyElementClickable(findTestObject('Object Repository/AppComposer/inputFileNotRequirec'))
		extentTest.log(Status.PASS, 'verifying that required btn is clickable')
		
		if(notReqInputF)
		{
			WebUI.click(findTestObject('Object Repository/AppComposer/inputFileNotRequirec'))
			extentTest.log(Status.PASS, 'click on InputFile Required checkbox to test n submit')
		}
		
		WebUI.click(findTestObject('AppComposer/Save'))
		extentTest.log(Status.PASS, 'Click on save button')
		WebUI.delay(2)
		
		WebUI.click(findTestObject('AppComposer/Submit_btn'))
		
		extentTest.log(Status.PASS, 'Click on Submit and test button')

		
				/*result=WebUI.verifyElementPresent(findTestObject('AppComposer/Tooltip_Inputfile'), 5)
				if(result) {
					extentTest.log(Status.PASS, 'Verify input file is not present in preview window' )
				extentTest.log(Status.PASS, 'Verify the Tool-tip '+"Required"+' is present')
				}
				else {
					extentTest.log(Status.PASS, 'Failed to verify')
				}
			
	
				WebUI.takeScreenshot(screenShot)
	
				extentTest.log(Status.PASS, 'Verify through screenshot ')*/
	
				break
			
			
		case 'Queued state':
			WebUI.delay(2)
		
			//CustomKeywords.'appcomposer.Create_NewApp.create_app'(app,exec,extentTest)
			WebUI.delay(2)
			
					
		TestObject appdefname = WebUI.modifyObjectProperty(findTestObject('Object Repository/AppComposer/application_name'),'data-automation-id', 'equals', app, true)
					WebUI.click(appdefname)
					extentTest.log(Status.PASS, 'Select the Existing app def '+ app)
					WebUI.delay(3)

		  

			WebUI.doubleClick(findTestObject('AppComposer/Cores_pre'))

	 
			WebUI.sendKeys(findTestObject('AppComposer/Cores_pre'), Keys.chord(Keys.CONTROL,'a'))

			//WebUI.setText(findTestObject('AppComposer/Cores_pre'), '')
			WebUI.setText(findTestObject('AppComposer/Cores_pre'), cores)

			extentTest.log(Status.PASS, 'Add no of cores in preview window')

			WebUI.verifyElementPresent(findTestObject('AppComposer/InputF'), 3)

			//WebUI.click(findTestObject('AppComposer/InputF'))
			def filePath = RunConfiguration.getProjectDir() + '/Upload/JobFiles/Running.sh'

			def newFP = new generateFilePath.filePath().getFilePath(filePath)

			println(newFP)

			WebUI.uploadFile(findTestObject('AppComposer/InputF'), newFP)

			extentTest.log(Status.PASS, 'Upload input file')
			WebUI.delay(3)

			WebUI.click(findTestObject('AppComposer/Submit_btn'))

			extentTest.log(Status.PASS, 'Click on submit button')

			//WebUI.verifyElementPresent(findTestObject('null'), 3)
			WebUI.delay(4)

			result = WebUI.waitForElementVisible(findTestObject('Object Repository/AppComposer/JobStatus'), 10)

			extentTest.log(Status.PASS, 'Verify Job status notification is present ' + result)

			println(WebUI.verifyElementPresent(findTestObject('AppComposer/Close'), 3))

			WebUI.click(findTestObject('AppComposer/Close'))

			extentTest.log(Status.PASS, 'Click on close notification')

			/*
			
			WebUI.click(findTestObject('AppComposer/JobsTab'))
			extentTest.log(Status.PASS, 'Navigated to Jobs Tab')
			
			
			WebUI.waitForElementPresent(findTestObject('Notificactions/Notification_JobSubmission'), 5)
			
			def jobText = WebUI.getText(findTestObject('Notificactions/Notification_JobSubmission'))
			
			CustomKeywords.'operations_JobsModule.GetJobRowDetails.getJobID'(jobText)
			
			 
			
				extentTest.log(Status.PASS, 'Job ID - ' + GlobalVariable.G_JobID)*/
			

			break
	}
	
	
	
	if (result)
		{
			extentTest.log(Status.PASS, ('Verified ::  ' + TestCaseName) + ' :: Sucessfully')
		} else {
			extentTest.log(Status.FAIL,  TestCaseName + ' :: failed')
		}
	
	 
	
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
	
	
	