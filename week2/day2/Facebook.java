package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allows-origns=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("aaa");
		driver.findElement(By.name("lastname")).sendKeys("last");
		driver.findElement(By.name("reg_email__")).sendKeys("9876542234");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Asv@1234");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("15");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("10");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2000");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	}

}
