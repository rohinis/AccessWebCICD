<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>FilesModule-WithPreReq</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>d0f494b7-6615-415d-867f-7e0d0483293a</testSuiteGuid>
   <testCaseLink>
      <guid>f1539952-54e3-4b24-bf3f-3b527355ad56</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/FilesModule/Create_file</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>54afcc6e-ab4f-4c6f-9721-f72e6249924d</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/FileCreate</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>54afcc6e-ab4f-4c6f-9721-f72e6249924d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FileName</value>
         <variableId>fbbf9b51-72f4-495f-9cbf-a8e08f06ebf3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>54afcc6e-ab4f-4c6f-9721-f72e6249924d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>02884025-536f-4943-85bd-c1e5dc201c49</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>54afcc6e-ab4f-4c6f-9721-f72e6249924d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>userChoice</value>
         <variableId>cdf52790-8a83-4b10-8c0b-bed0a592b1c4</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>fc2abfee-33a2-4d31-98cf-aabe1ebbb81b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/FilesModule/FileOperations</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>98ae1009-2546-4b35-82a6-c39fc1879f15</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>9-15</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/FilesOps</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>98ae1009-2546-4b35-82a6-c39fc1879f15</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FileName</value>
         <variableId>9db2c348-847f-41f0-800b-d8b322772339</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>98ae1009-2546-4b35-82a6-c39fc1879f15</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>1d7255ee-2b97-45de-860a-6d4dff97674d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>98ae1009-2546-4b35-82a6-c39fc1879f15</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Operation</value>
         <variableId>7b950ced-8cb3-43ce-a472-81090d4db7f5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>4d109fb9-683f-49b8-ae40-9c58162fa8f8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/FilesModule/FileViewerOperations</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b0d439b5-b148-4dda-a077-ab90afcab37e</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1,2,4,5,7</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/FileViewerOps</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>b0d439b5-b148-4dda-a077-ab90afcab37e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FileName</value>
         <variableId>9fa70e0e-ddc5-443f-82cf-74e6dc308317</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b0d439b5-b148-4dda-a077-ab90afcab37e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>17636c94-acfa-452d-9ca9-44c1c14edb87</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b0d439b5-b148-4dda-a077-ab90afcab37e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Operation</value>
         <variableId>6ea28048-2fa4-4154-aa63-89368e7a9aae</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b0d439b5-b148-4dda-a077-ab90afcab37e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>userChoice</value>
         <variableId>ef1274aa-47d9-4785-b26a-d28851f1ff02</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0aad26ab-7ce1-4870-b2d3-f6102d712da0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/JobSubmission/JobSubmission-FileProcessWith-2020.4</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>fb4116e1-711f-4969-a559-6123d77db6a9</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/FileViewer</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f437cb72-d460-45b9-8457-506e053653fa</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fb4116e1-711f-4969-a559-6123d77db6a9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>InputFile</value>
         <variableId>41e4999d-53fd-4ac2-ac7d-b32dd14c947d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fb4116e1-711f-4969-a559-6123d77db6a9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>23a39b4b-3cb1-49da-b642-9ada0fa81727</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>a90f198e-6076-4a17-8e68-6f8a2df56aff</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>061b16b1-00b0-4549-9442-8ba2fd0e9bdf</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fb4116e1-711f-4969-a559-6123d77db6a9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>userChoice</value>
         <variableId>717d5e86-3349-4836-8c36-9a645d19d409</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
