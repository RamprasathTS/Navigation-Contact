Feature: To Check Menus in Top Navigation

	Scenario: To check All Menus in Top Navigation
	Given Launch the Homepage Url link of growthengineering
	When Validate all Menu accessible in Our_Products Menu
	And Validate all Menu accessible in Our_Approach Menu
	And Validate all Menu accessible in Resources
	And Validate all Menu accessible in About_Us
	When Click Get_in_Touch Menu 
	Then close Browser
