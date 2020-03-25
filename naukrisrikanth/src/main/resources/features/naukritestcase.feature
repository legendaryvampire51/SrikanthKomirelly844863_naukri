@naukri_Feature
Feature: naukri website

@tc01_login
Scenario: check that the user can login naukri account
	
	Given  user launched the chrome browser 
	When  user opens naukri homepage 
	Then user clicks login 
	
@tc02_Edit_Profile
Scenario: To Check the user can edit certain fields in the Edit_Field Section
	
	Given usera launched the chrome browser 
	And usera opens naukri homepage
	And usera clicks login
	Then Hovers on MyNaukri and clicks EditProfile
	