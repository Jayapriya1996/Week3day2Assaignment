package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.partialLinkText("CRM/SFA")).click();	
	     driver.findElement(By.linkText("Accounts")).click();
	     driver.findElement(By.linkText("Create Account")).click();
	     driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	     driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	     driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Jayapriya");
	     driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("testleaf.com");
	     driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("200000");
	     WebElement industry=driver.findElement(By.name("industryEnumId"));
	     Select industryObj=new Select(industry);
	     industryObj.selectByVisibleText("Computer Software");
	     WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
	     Select ownershipObj=new Select(ownership);
	     ownershipObj.selectByVisibleText("S-Corporation");
	     WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
	     Select marketingObj=new Select(marketing);
	     marketingObj.selectByIndex(5);
	     WebElement stateProvince=driver.findElement(By.id("generalStateProvinceGeoId"));
	     Select stateprovinceObj=new Select(stateProvince);
	     stateprovinceObj.selectByValue("TX");
	     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	     
	}}

























