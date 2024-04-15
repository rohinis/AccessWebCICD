<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>ProfileModule-WithPreReq</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>bd42536a-603a-474a-ace8-4b3fdbdff301</testSuiteGuid>
   <testCaseLink>
      <guid>47b415de-27da-4ccf-bc46-2ad431c3abc9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ProfileModule/CreateProfile</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>1,6</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/ProfileCreation</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>proName</value>
         <variableId>95a9e762-0777-471f-be10-b482e3aee3c9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>AppName</value>
         <variableId>9c79e447-0846-42be-b9ed-38152b9c1a48</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>f93c1877-9b01-455c-8d22-cd6af0ad20e5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>InputFile</value>
         <variableId>61cc681e-53f9-423c-84fd-f286fa0202e9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>RemoteFile</value>
         <variableId>c6e3efda-4d20-4ee8-9257-9ca5b0c4af4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fileArg</value>
         <variableId>0eb799de-008d-44d9-ab7d-c24efd8e30c9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e8918466-2248-4ed3-ac3b-0ee2c20ce33c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ProfileType</value>
         <variableId>731ae8a5-0351-4126-a92c-0ec5b34713f9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>fde5d0fe-3587-4913-87b0-ccf3ae6a342f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ProfileModule/JobSubmissionThroughProfileContextMenuAllProfiles</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>eedb66fb-27b8-4868-afc1-ca297ee58312</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/ProfileSubmissions</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>eedb66fb-27b8-4868-afc1-ca297ee58312</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TestCaseName</value>
         <variableId>afcc287f-4303-437c-84a7-54c5f609e3a4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>eedb66fb-27b8-4868-afc1-ca297ee58312</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>proName</value>
         <variableId>a351aa0e-0046-484d-9538-a9879262f15f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>eedb66fb-27b8-4868-afc1-ca297ee58312</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>AppName</value>
         <variableId>d233c01a-dff0-4e91-b5de-c116b3c8b088</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>eedb66fb-27b8-4868-afc1-ca297ee58312</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fileName</value>
         <variableId>b896bcd9-8f58-4e35-bd91-3ba246a3c920</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>336e1ad1-9d38-4bf3-abb8-536d2b40cab2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>9c97d509-5dcb-4ac6-86a9-60bbc4cf8b75</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>b87bddd6-5727-428e-9a6f-70dd1c831285</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ProfileModule/DeleteProfile</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>33cc5c11-5370-4800-aa58-58e44a51b974</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>1-4</value>
         </iterationEntity>
         <testDataId>Data Files/Sanity/ProfileCreation</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>4343b31b-60fa-4ed8-9029-52a057e6f17f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>33cc5c11-5370-4800-aa58-58e44a51b974</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>proName</value>
         <variableId>0300cf62-3068-4779-b99e-ee7267d531f1</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>33cc5c11-5370-4800-aa58-58e44a51b974</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>AppName</value>
         <variableId>d45d70d8-f2f8-48b4-94fb-152c1a5ecfc0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>33cc5c11-5370-4800-aa58-58e44a51b974</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ProfileType</value>
         <variableId>80a01f2c-5b41-48f6-9f20-46bfa5b35ead</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
