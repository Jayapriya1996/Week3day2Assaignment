package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
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
     WebElement src=driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select obj=new Select(src);
    obj.selectByVisibleText("Employee");
    WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
    Select obj1=new Select(marketing);
    obj1.selectByValue("9001");
    WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
    Select obj2=new Select(ownership);
    obj2.selectByIndex(4);
    WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
    Select obj3=new Select(country);
    obj3.selectByVisibleText("India");
    driver.findElement(By.name("submitButton")).click();
    String title=driver.getTitle();
    System.out.println(title);
    }
    

}
