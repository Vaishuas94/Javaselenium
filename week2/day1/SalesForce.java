package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allows-origns=*");
		ChromeDriver driver = new ChromeDriver(option);
		//Login url
		driver.get("https://login.salesforce.com/");
		//user name
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        
        //password
        driver.findElement(By.id("password")).sendKeys("Leaf@1234");
        
        //Login button
        driver.findElement(By.id("Login")).click();
        
         //verify the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        
        //close the window
        driver.close();
           
	}

}
