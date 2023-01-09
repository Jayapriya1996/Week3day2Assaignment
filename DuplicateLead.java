package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.partialLinkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Create Lead")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayapriya");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sudhakar");
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("selvampriya658@gmail.com");
	     driver.findElement(By.name("submitButton")).click();
	     String title=driver.getTitle();
	     System.out.println(title);
	     driver.findElement(By.linkText("Duplicate Lead")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).clear();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
	     driver.findElement(By.id("createLeadForm_firstName")).clear();
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chitra");
	     driver.findElement(By.name("submitButton")).click();
	     String t=driver.getTitle();
	     System.out.println(t);
	     
	     
	     }

}
