# otherTools

Use Java with following tools

- **Getting Started**
    - SonarQube
        
        - SonarQube empowers all developers to write cleaner and safer code.
        
    - Grafana
    
        - Grafana is the open source analytics and monitoring solution for every database or application.
    
    - ElasticSearch
    
        - Elasticsearch is a search engine, It provides a distributed, multitenant-capable full-text search engine with an HTTP web interface and schema-free JSON documents.
        
    - Configuration Server
    
        - Config Server is an externalized application configuration service. It provides a centralized server for delivering external configuration properties to an application and a central source for managing this configuration across deployment environments.
    
    - Checkmarx
    
        - Flexible and accurate security solution capable of identifying hundreds of vulnerabilities in your code.
        
    - New Relic
    
        - It is a software to help website and application owners track the performances of their services.
        
    - Splunk
    
        - It is a software for searching, monitoring, and analyzing machine-generated big data, via a Web-style interface.
    
    - HP Sitescope
    
        - HP SiteScope is agentless monitoring software focused on monitoring the availability and performance of distributed IT infrastructures, including Servers, Network devices and services, Applications and application components, operating systems and various IT enterprise components.

- **Configuration**

    - SonarQube in local
    
        - You need to have JaCoCo plugin in your project, you can get it from this repository https://github.com/apokochito/mavenBasics if you don't have it (POM file)
        - Download and extract SonarQube Developer Edition from https://binaries.sonarsource.com/CommercialDistribution/sonarqube-developer/sonarqube-developer-7.8.zip (Verify your SonarQube version if you're not using Java 8)
        - Change a property in sonarqube > conf > wrapper.conf
            - `wrapper.java.comman=\path\to\my\jdk\bin\java`
        - Download SonarScanner from https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/
        - Add C:\...\SonarScanner\bin into your PATH environment variable for your windows account
        - Add a sonar-project.properties file inside your project like this one (check your own properties)
            
            ```
            sonar.projectKey=com.other.tools
            sonar.projectName=other-tools
            sonar.projectVersion=0.0.1-SNAPSHOT
            
            #sonar.host.url=someurl
            
            #Path for sonar sources, . or src/main/java
            sonar.sources=src/main/java
            
            #Path for libraries
            #sonar.libraries=target/lib/*.jar
            
            #Path for binaries
            sonar.java.binaries=target
            
            #----- Default database
            #sonar.jdbc.url=someurl
            #sonar.jdbc.driver=com.mysql.jdbc.Driver
            
            #----- Global database settings
            #sonar.jdbc.username=sonar
            #sonar.jdbc.password=sonar
            
            #----- Default directory layout
            sonar.java.source=1.8
            sonar.java.target=1.8
            sonar.language=java
            
            #----- Exclusions
            sonar.exclusions=**/*test*/**
            
            sonar.sourceEncoding=UTF-8
            
            sonar.tests=src/test/
            sonar.dynamicAnalysis=reuseReports
            sonar.junit.reportsPath=target/surfire-reports
            
            #----- JaCoCo reports
            sonar.java.coveragePlugin=jacoco
            sonar.jacoco.reportPath=target/jacoco.exec        
          ```
          
        - Run `mvn clean test` in your project by cmd
        - Run the Sonarqube server (StartSonar.bat) inside SonarQube > bin > windowsx86-x64 with the following command `.\StartSonar.bat`
            - (If the server is not working well) "Kill the Java process and try deleting the temp folder contents again."
        - Go to https://localhost:9000 an verify SonarQube UI (Check if you're not using this port already)
        - Now, run a cmd window inside your project root (otherTools folder in this case), and run this command `C:\...\sonar-scanner-4.2.0.1873-windows\bin\sonar-scanner.bat`
    
    - Grafana
    
        - Steps
    
    - ElasticSearch
      - Kibana
    - Configuration Server (bootstrap.yml)
    
        - Steps
    
    - Checkmarx SAST (CxSAST)
    
        - Steps
    
    - New Relic
    
        - Steps
    
    - Splunk
    
        - Steps
    
    - HP Sitescope
    
        - Steps