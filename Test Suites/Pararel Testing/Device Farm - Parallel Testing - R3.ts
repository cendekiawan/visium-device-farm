<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Device Farm - Parallel Testing - R3</name>
   <tag></tag>
   <delayBetweenInstances>5</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>2</maxConcurrentInstances>
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
         <testSuiteEntity>Test Suites/Pararel Testing/R1/Feature/Android/Register - Lge LM-G710</testSuiteEntity>
      </TestSuiteRunConfiguration>
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
         <testSuiteEntity>Test Suites/Pararel Testing/R1/Feature/Android/Register - Casper VIA_F1</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
