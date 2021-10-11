package StepDefintions;



	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	public class StepDefElearning {
		WebDriver wd;
		
		@Given("^User navigate to Elearning website$")
		public void user_navigate_to_Elearning_website() throws Throwable {
			System.out.println("Lauch the application");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\NikithaMuvva\\workspace\\ManipalTraining\\Drivers\\chromedriver.exe");
			wd  = new ChromeDriver();
			wd.manage().window().maximize();
			Thread.sleep(2000);
			//Navigating to URL
			wd.get("http://elearningm1.upskills.in/");
		    Thread.sleep(2000);
		}
		
		@When("^Click on Signup button in Homepage$")
		public void click_on_Signup_button_in_Homepage() throws Throwable {
			 wd.findElement(By.linkText("Sign up!")).click();
			    Thread.sleep(2000);    
		}
		
		@When("^Enter all mandatory details in Registration page$")
		public void enter_all_mandatory_details_in_Registration_page() throws Throwable {
		    System.out.println("Registration screen is displayed");
		    // Enter FirstName 
		    wd.findElement(By.id("registration_firstname")).sendKeys("manzoor");
		    Thread.sleep(2000);
		    //Enter LastName 
		    wd.findElement(By.id("registration_lastname")).sendKeys("mehadi");
		    Thread.sleep(2000);
		    //Enter Email
		    wd.findElement(By.id("registration_email")).sendKeys("manzoor@gmail.com");
		    Thread.sleep(2000);
		    //Enter Username
		    wd.findElement(By.id("username")).sendKeys("manzoor1212");
		    Thread.sleep(2000);
		    //Enter Pass
		    wd.findElement(By.id("pass1")).sendKeys("manzoor");
		    Thread.sleep(2000);
		    //Enter ConfirmPassword 
		    wd.findElement(By.id("pass2")).sendKeys("manzoor");
		    Thread.sleep(2000);
		    //Enter Phone
		    wd.findElement(By.id("registration_phone")).sendKeys("9876543210");
		    Thread.sleep(2000);
		    //Select Language 
		    WebElement selectLanguage = wd.findElement(By.id("registration_language"));
		    Select sel = new Select(selectLanguage);
		    sel.selectByValue("english");
		    Thread.sleep(2000);
		    //Studentcourse
		    WebElement rbutton = wd.findElement(By.xpath("//input[@value='5']"));
		    rbutton.click();
		    Thread.sleep(2000);
		   
		}
		
		@When("^Click on Register button$")
		public void click_on_Register_button() throws Throwable {
			//Click on 'Register'
		    wd.findElement(By.id("registration_submit")).click();
		    Thread.sleep(2000);
		}

		@Then("^User is successfully registered as Student$")
		public void user_is_successfully_registered_as_Student() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User is successfully registered as Student");
			 List<WebElement> listSearch=wd.findElements(By.xpath("//div[@class='col-xs-12 col-md-12']/p"));
		        System.out.println(listSearch.size());
		        for(WebElement we:listSearch) {
		            System.out.println(we.getText());
		        }
		     System.out.println(wd.findElement(By.id("form_register")).getText());	
			 wd.close();
		}

		@When("^Enter Username and Pass in LoginPage$")
		public void enter_Username_and_Pass_in_LoginPage() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Enter valid credentials");
			wd.findElement(By.id("login")).sendKeys("manzoor195");
		    Thread.sleep(2000);
		    wd.findElement(By.id("password")).sendKeys("manzoor");
		    Thread.sleep(2000);
		    wd.findElement(By.name("submitAuth")).click();
		    Thread.sleep(2000);
		}

		@Then("^Student is successfully logged into Elearing$")
		public void student_is_successfully_logged_into_Elearing() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Student logged in Successfully");
			System.out.println("LoginMessage: " + wd.findElement(By.xpath("//p[contains(text(),'Hello ')]")).getText());
			Thread.sleep(5000);
			wd.close();
		    //throw new PendingException();
		}
	   
		@Given("^Login as Student$")
		public void login_as_Student() throws Throwable {
			System.out.println("Enter valid credentials");
			wd.findElement(By.id("login")).sendKeys("manzoor195");
		    Thread.sleep(2000);
		    wd.findElement(By.id("password")).sendKeys("manzoor");
		    Thread.sleep(2000);
		    wd.findElement(By.name("submitAuth")).click();
		    Thread.sleep(2000);
		}
		
		@When("^Click on Edit Profile$")
		public void click_on_Edit_Profile() throws Throwable {
		    //Click on Edit Profile
		    wd.findElement(By.linkText("Edit profile")).click();
		    Thread.sleep(2000);
		}
		
		@When("^Update Password$")
		
		public void update_Password() throws Throwable {
			//UpdatePassword 
			wd.findElement(By.id("password1")).sendKeys("manzoor123");
		    Thread.sleep(2000);
		    wd.findElement(By.id("profile_password2")).sendKeys("manzoor123");
		    Thread.sleep(2000);		    
		}
		
		@When("^Save changes$")
		public void save_changes() throws Throwable {
		    //Click on Save settings
			wd.findElement(By.id("profile_apply_change")).click();
		    Thread.sleep(2000);
		}
		
		@Then("^Password has updated successfully$")
		public void password_has_updated_successfully() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   //Sucess is displayed
			System.out.println("SuccessMessage: " + wd.findElement(By.xpath("//div[contains(text(),'Your new ')]")).getText());
			Thread.sleep(5000);
			wd.close();
		}
	}


