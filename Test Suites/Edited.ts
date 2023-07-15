<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>EDITED</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>557e2b05-2051-4b2c-9508-9c31273fddcd</testSuiteGuid>
   <testCaseLink>
      <guid>f45d5a7a-bd38-4400-bca2-76264d9c9743</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Verify user cannot book an appointment with invalid dates</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>67d14c08-4fa6-4aa2-b65c-34c638627db7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Verify user cannot log in with invalid credentials</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ca142e65-4209-4770-9c75-f66ccfd6b4bd</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Verify Unsuccessful Log In</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ca142e65-4209-4770-9c75-f66ccfd6b4bd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>5029f934-58d2-412d-a771-27a46ac30864</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ca142e65-4209-4770-9c75-f66ccfd6b4bd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>7db8f62d-74ad-43a5-adb5-8cbe214e06cc</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a1805338-8cca-4134-980e-5a08169ea227</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Verify user can view correct history page after book appointments</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>872fe85b-a7ca-498a-a619-2cee81d1886e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Verify user can log in with valid credentials</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>52e7c8dc-617d-47ae-b3f9-a1c235c20e0f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Verify user can log out using nav bar</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>dd5d682f-dd64-4d5c-94ba-1269dbc7c35e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Verify user can book an appointment successfully</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>3c766d4e-fe07-400c-9644-2a03ffbd3ffd</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Verify Successful Appointment</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>3c766d4e-fe07-400c-9644-2a03ffbd3ffd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>facility</value>
         <variableId>c6af33f6-fd6e-4505-825a-b1fec0150879</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>3c766d4e-fe07-400c-9644-2a03ffbd3ffd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>program</value>
         <variableId>e882f6fb-4a42-4a2a-a719-8bbfcd61ab90</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>3c766d4e-fe07-400c-9644-2a03ffbd3ffd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>readmission</value>
         <variableId>7f42739a-b66c-40f8-abf6-e04cc8db87af</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>3c766d4e-fe07-400c-9644-2a03ffbd3ffd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>date</value>
         <variableId>d0310ad2-6d87-4f83-9015-b198c65129f7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>3c766d4e-fe07-400c-9644-2a03ffbd3ffd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>comment</value>
         <variableId>61f79366-2dcf-4b05-8983-5bacc61bdef9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e4a07267-c879-42b7-85f0-426ac0efee7b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Verify user can log out using profile page</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
