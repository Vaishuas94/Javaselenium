package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allows-origns=*");
		ChromeDriver driver = new ChromeDriver(option);
		// url 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//create Lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testorg");
		
		//first name using id locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaish");
		
		//last name using id locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sandy");
		
		//First Name(local) field
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ASV");
		
		//Department field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		//Description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Automation");
		
		//Email address field
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vaishu@gmail.com");
		
		//locate for state
		WebElement stateEle = driver.findElement(By.name("generalStateProvinceGeoId"));
		// select the drop down value
		Select state = new Select(stateEle);
		state.selectByVisibleText("New York");
		
		//create button
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
