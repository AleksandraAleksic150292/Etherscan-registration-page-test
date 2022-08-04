package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	WebDriver driver;
	
		@Given("^Open the Chrome and launch the application and accept cookies$")
	    public void open_the_Chrome_and_launch_the_application_and_accept_cookies() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://etherscan.io/register");
	        driver.manage().window().maximize();
	        WebElement cookie = driver.findElement(By.id("btnCookie"));
	        cookie.sendKeys(Keys.ENTER);
		}
	
		@When("Enter the Username")
		public void enter_the_username()throws InterruptedException {
			driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("Aleksandra");
		}
	
		@When("Email Address")
		public void email_address()throws InterruptedException {
			driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).sendKeys("a.aleksic61@gmail.com");
		}
	
		@When("Confirm Email Address")
		public void confirm_email_address()throws InterruptedException {
			driver.findElement(By.id("ContentPlaceHolder1_txtConfirmEmail")).sendKeys("a.aleksic61@gmail.com");
		}
	
		@When("Password")
		public void password()throws InterruptedException {
			driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("Bogdan");
		    
		}
	
		@When("Confirm Password")
		public void confirm_password()throws InterruptedException {
			driver.findElement(By.id("ContentPlaceHolder1_txtPassword2")).sendKeys("Bogdan");
		}
	
		@Then("Close the browser")
		public void close_the_browser()throws InterruptedException {
			driver.close();
		}
		
		@When("Check agree with terms and contions checkbox")
		public void check_agree_with_terms_and_contions_checkbox()throws InterruptedException {
			WebElement checkboxTermsCond = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MyCheckBox\"]"));
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("arguments[0].click();", checkboxTermsCond);
		}

		@When("Check newsletter checkbox")
		public void check_newsletter_checkbox()throws InterruptedException {
			WebElement checkboxUnsubscribe = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_maindiv\"]/div[6]/div/label"));
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("arguments[0].click();", checkboxUnsubscribe);
		}
	
		@When("Click on terms and condition link")
		public void click_on_terms_and_condition_link()throws InterruptedException {
			WebElement termsCond = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_maindiv\"]/div[5]/div[1]/label/span/a"));
	        termsCond.sendKeys(Keys.ENTER);;
		}

		@Then("Nnew page with explanatio of Term and Conditions will open")
		public void nnew_page_with_explanatio_of_term_and_conditions_will_open()throws InterruptedException {
			driver.get("https://etherscan.io/terms");
			driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        //Scroll down till the bottom of the page
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		@When("Click on unsubscribe link")
		public void click_on_unsubscribe_link()throws InterruptedException {
			WebElement unsubscribe = driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_maindiv']/div[6]/div/label/span/a"));
	        unsubscribe.sendKeys(Keys.ENTER);}

		@Then("New page with explanation how to unsubscribe will open")
		public void new_page_with_explanation_how_to_unsubscribe_will_open()throws InterruptedException {
			driver.get("https://info.etherscan.com/how-to-subscribe-unsubscribe-newsletter/");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        //Scroll down till the bottom of the page
			TimeUnit.SECONDS.sleep(4);}   

		@When("Check recaptha checkbox")
		public void check_recaptha_checkbox()throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
	        options.addArguments("disable-infobars");
	        options.addArguments("--disable-extensions");
			new WebDriverWait(driver, (10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"ContentPlaceHolder1_maindiv\"]/div[7]/div/div/div/iframe")));
	        new WebDriverWait(driver, (10)).until(ExpectedConditions.elementToBeClickable(By.xpath("#//*[@id=\"recaptcha-anchor\"]"))).click();
	        }
		@When("Click on Click to Sing In and new page for log in will open")
		public void click_on_click_to_sing_in_and_new_page_for_log_in_will_open() throws InterruptedException{
			WebElement signIn = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_maindiv\"]/div[8]/div[1]/a"));
	        signIn.sendKeys(Keys.ENTER);
		}
		@When("Click on Create Account button")
		public void click_on_create_account_button()throws InterruptedException {
	        new WebDriverWait(driver, (10)).until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRegister"))).click();
		}



}
