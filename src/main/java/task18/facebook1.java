package task18;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;

public class facebook1 {

	    public static void main(String[] args)
	    {

	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\project\\task18\\src\\main\\java\\task18\\chromedriver.exe");
			// Instantiate a ChromeDriver class.
			WebDriver driver = new ChromeDriver();
	        		
	        // Maximize window size of browser
	        driver.manage().window().maximize();
	     	driver.get("https://www.facebook.com");
	     			 
	     			WebElement createNewAccountButton = wait.until2(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid='open-registration-form-button']")));
	                 createNewAccountButton.click();
	        // Enter your login email id
	        driver.findElement(By.id("email"))
	            .sendKeys("testuser@test.com");

	        // Enter your login password
	        driver.findElement(By.id("password"))
	            .sendKeys("xyz12345");

	        WebElement firstNameField = driver.findElement(By.name("firstname"));
	        WebElement lastNameField = driver.findElement(By.name("lastname"));
	        WebElement emailField = driver.findElement(By.name("reg_email__"));
	        WebElement emailConfirmationField = driver.findElement(By.name("reg_email_confirmation__"));
	        WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
	        Select birthDayField = new Select(driver.findElement(By.name("birthday_day")));
	        Select birthMonthField = new Select(driver.findElement(By.name("birthday_month")));
	        Select birthYearField = new Select(driver.findElement(By.name("birthday_year")));
	        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));

	        // Enter values
	        firstNameField.sendKeys("kalees");
	        lastNameField.sendKeys("s");
	        emailField.sendKeys("skalees1808@gmail.com");
	        // Wait for the email confirmation field to appear and fill it
	        wait.until1(ExpectedConditions.visibilityOf(emailConfirmationField));
	        emailConfirmationField.sendKeys("skalees1808@gmail.com");
	        passwordField.sendKeys("Prabhu03!");
	        birthDayField.selectByValue("11");
	        birthMonthField.selectByValue("May");
	        birthYearField.selectByValue("1985");
	        genderRadioButton.click();
	        WebElement signUpButton = driver.findElement(By.name("websubmit"));
	        signUpButton.click();

	        
	        wait.until(ExpectedConditions.urlContains("facebook.com"));

	        // Print the current URL (or other verifications as needed)
	        System.out.println("Current URL: " + driver.getCurrentUrl());
	    } facebook1 (Exception e) {
	        e.printStackTrace();
	    }
	}



