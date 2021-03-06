Feature: To validate all fields in Contact Page

	Scenario Outline: Validating Contact Page with inputs
	Given Launcing the Pedasys Contact Page
	When give input data in "<First_name>","<Last_name>","<Work_email>","<Telephone>","<company_name>","<country>"
  And  Select any one value from Audience Field
  And Select any one option from  Best Decribe your Role
  And Select any one option from Purpose of your Enquiry 
  And Check the Privacy Policy and click submit buton
  Then Close the Browser
  
  Examples:
|First_name|Last_name|Work_email|Telephone|company_name|country|
|Ramprasath|TS|ramthumatin@gmail.com|9659136272|Tech Mahindra|India|