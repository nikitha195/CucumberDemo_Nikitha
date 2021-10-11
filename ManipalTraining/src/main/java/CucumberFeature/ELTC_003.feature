Feature: UpdatePassword

  		Scenario: 
                 Given User navigate to Elearning website
                 And Login as Student 
                 When Click on Edit Profile 
                 And Update Password
                 And Save changes 
                 Then Password has updated successfully