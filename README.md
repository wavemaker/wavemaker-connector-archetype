Step to build archetype

Step1 : Build archetype
-----------------------
Go to connector-archetype directory
> mvn clean install

Step2 : Create connector project using archetype
------------------------------------------------
go to any directory where you want to create your project
> mvn archetype:generate -DarchetypeGroupId=com.wavemaker.connector -DarchetypeArtifactId=wavemaker-connector-archetype -DarchetypeVersion=0.1 -DgroupId=<<connectorgroupid>> -DartifactId=<<connectorarchetype>> -Dversion=<<connectorversion>>

Replace placeholder in the above command with your project details, such as
Where
-DgroupId = com.wavemaker.connector
-DartifactId = mongodbconnector
-Dversion = 1.0

Step3 : Provide Inputs
----------------------

Your project bulding will be done in interactive mode, by Asking following question
 with default values

Define value for property 'package' com.wavemaker.connector.bpmn: :
Define value for property 'connector-name' bpmn: :
Define value for property 'connector-description' A simple connector bpmn that can be used in WaveMaker application: :
Define value for property 'connector-java-class-name' WaveMakerbpmnConnector: : BPMNConnector

Step4: Build you project
-------------------------
Go to your project directory

> mvn clean install

In the dist directory you can find a zip file which can be imported in the WaveMaker application.
