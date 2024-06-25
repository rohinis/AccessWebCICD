<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>JobMonitoring-WithPreReq</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>81a79543-0271-4986-a321-210a6d9a38ed</testSuiteGuid>
   <testCaseLink>
      <guid>2b6856f4-a9e7-4bc3-819c-a82e923b0b35</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/JobMonitoring/Pre-Req-Script-For-JobMonitoring-AllJobs</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>a4f1d6a7-dcfa-440e-a86e-3bb10a8dea6c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>996e8ea2-cec6-4c30-b0d1-7cd8c8b66f02</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>58ab5183-dd64-4c89-9a2a-3ed385f18550</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>d3635dc1-452f-48c6-af58-4f9702f180b3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>e32d5445-6f42-4d0f-a8ea-4b765f7310eb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>1f0aeaa5-6880-49cb-8d7a-14ac8e0f1c1e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a1555019-a296-44e4-a236-ad82f1782e18</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/JobMonitoring/JobActions_ForJobStates</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>de3de7c4-8a67-4b96-9c3f-44b6f7372061</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1-14</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/JobAction</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>de3de7c4-8a67-4b96-9c3f-44b6f7372061</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>JobState</value>
         <variableId>fa14e12e-5a6a-419f-8a7f-e37415e0594a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>de3de7c4-8a67-4b96-9c3f-44b6f7372061</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>JobAction</value>
         <variableId>733a2509-5f57-4bf7-83e2-b170d379821f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>de3de7c4-8a67-4b96-9c3f-44b6f7372061</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>deeba42e-d802-4544-b79c-5f155f26e90d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>b9a88c01-3e4a-42b5-8a6d-68ece165320d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>928f535c-4e4e-4747-b20f-2cc7e54abf94</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/JobMonitoring/JobActions_ForJobStates -Topmenu_Icon</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>50abcf66-282e-49cf-93ce-a0412e658999</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>9</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/JobActionIcon</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>50abcf66-282e-49cf-93ce-a0412e658999</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>JobState</value>
         <variableId>199c3045-c7fc-450e-974a-df474d42b903</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>50abcf66-282e-49cf-93ce-a0412e658999</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>JobAction</value>
         <variableId>c10574d8-703c-4518-8bef-8cdfdaacda23</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>50abcf66-282e-49cf-93ce-a0412e658999</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>0974633c-cd4f-4eb4-87d0-82966292f7e9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5a0a29f5-383b-4668-be6a-281f8831eb45</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/JobMonitoring/JobFilters</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8ea59f6d-67a7-4368-8cef-42e60d8ef3b0</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/JobFilters</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>8ea59f6d-67a7-4368-8cef-42e60d8ef3b0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>ace71100-db45-4bac-9cf7-4e06beb3fcfb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8ea59f6d-67a7-4368-8cef-42e60d8ef3b0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FilterCategory</value>
         <variableId>da517e3c-6f16-45ad-a631-1f8d0f1e7ad4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8ea59f6d-67a7-4368-8cef-42e60d8ef3b0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FilterValue</value>
         <variableId>85fe5725-d3b0-47ef-8404-aebd0ef7e59e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8ea59f6d-67a7-4368-8cef-42e60d8ef3b0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FilterTitle</value>
         <variableId>6cb8d038-a65f-4a85-95f4-15ca8ef3b50e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8ea59f6d-67a7-4368-8cef-42e60d8ef3b0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>dataAttribute</value>
         <variableId>add707ea-162f-4718-9997-8cb889c18040</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>54bc3327-1895-48a0-ab95-3335411c3aba</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e9e5b92a-501d-431b-9060-cc600c3120ac</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Upload/RunningFolder_jobspage</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>1e5912aa-44cb-4a2a-8cbd-d878986a8cb8</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>e3dfb89e-d66e-42d0-bfd7-4bbd555d0c58</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>2b559ba8-93b4-4f35-8694-c51dea26e300</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>098e6013-1c93-4f47-8b26-69214f7e665a</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
