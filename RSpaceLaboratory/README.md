## Links
- 
- Swagger Docs url (http://localhost:8080/public-api-interface.html)


- Note: change the localhost to  domain name 


	
	1) Objective : 	

	
		The goal is to design a small software component that Integrate with external system(Rspace) and transform data to required model . 
		The functionality that will need to be provided by your software component is described below:	
		1) User Needs to provide valid userName and pagination details.

	
	
	2) Solution :
	
	
	The Spring boot REST Api and RESTTemplate was implemented to achieve the functionality. The modularize code will help to enhance more functionality  at later stage and roll out to other countries . 	
	The api documentation will give the technical detailed  about api request and response specification.

	
	With this approach its pretty simple to integrate with the  front end/UI application relay on the HTTP Codes and response. In case of failure the api returns proper error codes and responses.	
	We also implemented the version(V1,V2,..) of the software, later we enhance the changes to release new version  
	
	Every part is implemented focusing on readability,modularize,  being easily modified and tested.

	
	3) Decision making: 
	
	  The main requirement is to build  core functionality to integrate with "researchspace.com" , marshalling   and transform the data as required. 
	  For time constraint we are focusing on the core functionality and non functional requirement like security will integrate later stages
	 
	  
	  
	  
	  
	4) System minimum requirements
	
	    java version: jdk 1.8
	    maven build tool : maven 3.3
	  
	5) Build : Go to project folder and run the below command
	     RSpaceLaboratory> mvn clean install
	     
	      It will generate the jar (build) file  RSpaceLaboratory-0.0.1-SNAPSHOT.jar
	
	
	6) Run Spring Boot app using Maven:
	
	     RSpaceLaboratory>mvn spring-boot:run
	     
	Run Spring Boot app with java -jar command
	     Go to RSpaceLaboratory/target/ and execute
	
	    java -jar RSpaceLaboratory-0.0.1-SNAPSHOT.jar
	    
	    
	8) Api interface swagger documentation url : Replace {localhost} with actual host name
	     url : http://localhost:8080/public-api-interface.html
	     
	9) Test the APi's from Swagger page.
	
	   Refer: Rspace - TestCases.pdf
	
	10) In case of facing the access with swagger page .Run the unit test cases  to test RspaceLabService service.
	
	
	
	
	
	        
	
	
	         
	  
	  
	  
	
		
	
		
	