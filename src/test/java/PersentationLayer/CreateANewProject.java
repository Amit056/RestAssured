package PersentationLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLib.Iconstant;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateANewProject {
@Test
public void login()

{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(Iconstant.url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys(Iconstant.appUserName);
	driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(Iconstant.appUserPassword);
	driver.findElement(By.xpath("//button[.='Sign in']")).submit();
	
	driver.findElement(By.xpath("//nav[@id='sidebar']/ul/li[2]")).click();
	

}
}
