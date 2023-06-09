package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allows-origns=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testorg");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sandy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ASV");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vaishu@gmail.com");
		WebElement stateEle = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(stateEle);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		//Edit button
		driver.findElement(By.linkText("Edit")).click();
		// clear the description field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("new learning");
		//Important note field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important field");
		//update button
		driver.findElement(By.name("submitButton")).click();
		// get title of the page
		String title = driver.getTitle();
		System.out.println(title);
	}

}
