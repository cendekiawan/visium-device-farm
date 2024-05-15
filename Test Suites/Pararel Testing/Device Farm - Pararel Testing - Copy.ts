<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Device Farm - Pararel Testing - Copy</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>1</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>remoteWebDriverType</key>
                  <value>Selenium</value>
               </entry>
               <entry>
                  <key>remoteWebDriverUrl</key>
                  <value>https://farmdemo.visiumlabs.com/wd/hub</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>Remote</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Pararel Testing/R1/Feature/iOS/Calculator_iPhone 5s</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
