Feature: UI Tests
   # to enable UI tests , make sure that the below code is uncommented in Global class and chromedriver version
   # matches installed chrome browser version
  #driver = new DriverFactory().getManager();
  #wait = new WebDriverWait(driver, 3000);
  #PageFactory.initElements(driver, PageObjects.class );
#http://localhost:65299/grid/console#
  
 @firefox 
  Scenario Outline:  login registration 
      
      Given I open the site "https://www.way2automation.com/angularjs-protractor/registeration/#/login"
      When I submit login details <Username> <Password> <UsernameDesc>
      
       Examples:
        |Username|Password|UsernameDesc|
      |"angular" |"password"|"testuserName"|
        |"angular" |"password"|"testuserName2"|
        |"angular" |"password"|"testuserName3"|
 
   #@uitestsGroup2
   #Scenario Outline: submit registration
      
     # Given I open the site "https://www.way2automation.com/way2auto_jquery/index.php"
     # When I submit registration with the following information <Name> <Phone> <Email> <Country> <City> <Username> <Password>
      
    #    Examples:
     #   |Name|Phone|Email|Country|City|Username|Password|
     #   |"TestFirstName TestLastName" |"123-456-7890"| "testuser1@testcompany.com"|"United States"|"testCity"|"testusername1"|"password123"|
  
 #@Scenario: example
  # Given I log something
   
  @chrome
    Scenario Outline: Add a user and validate the user has been added to the table
      
     Given I open the site "http://www.way2automation.com/angularjs-protractor/webtables/"
        When I add  user with the following information <FirstName> <LastName> <username> <password> <Email> <CellPhone>
      
        Examples:
        |FirstName|LastName|username| password|Email|CellPhone|
       |"TestFirstName" |"TestLastName" | "testusername"  |"test12345"|"testuser@testcompany.com"|"123-456-7890"|
        |"TestFirstName1" |"TestLastName1" | "testusername1"  |"test123456"|"testuser1@testcompany.com"|"123-456-1000"|
    
   @firefox 
     Scenario: Add a user using pojo class in a scenario using data table and @DataTableType
      Given I open the site "http://www.way2automation.com/angularjs-protractor/webtables/"
       When I add  user with passing info to pojo class
       |FirstName|LastName|username| password|Email|CellPhone|
       |TestFirstName3 |TestLastName3 | testusername3  |test67890|testuser3@testcompany3.com|456-789-1122|
      
  Scenario Outline: Add a user using pojo class in scenario outline using @ParameterType
   
       Given I open the site "http://www.way2automation.com/angularjs-protractor/webtables/"
       When I add  user by passing <userInfo> to pojo class from scenario outline
       Then I see user <userInfo> added to the table
        Examples:
        |userInfo|
        |TestFirstName4,TestLastName4,testusername4,test98760,testuser4@testcompany4.com,7890-123-2233|
        |TestFirstName5,TestLastName5,testusername5,test67890,testuser5@testcompany5.com,456-789-1122|
  
  
  # Scenario Outline: Delete user and validate user has been deleted

 #        When I delete <username>
  #       Then user <username> is deleted

 #        Examples:
 #        |username|
 #        | "Novak" |
 

 # Scenario: User calls web service to get a book by its ISBN
 #	Given a book exists with an isbn of "9781451648546"
#	When a user retrieves the book by isbn
#	Then the status code is 200
#	And response includes the following
#	| totalItems 	 		| 1455 					|
#	| kind					| books#volumes			|
 #  And response includes the following in any order
	#| items.volumeInfo.title 					| Steve Jobs			|
#	| items.volumeInfo.publisher 				| Simon and Schuster	|
#	| items.volumeInfo.pageCount 				| 630					|
	#And response is parsed 