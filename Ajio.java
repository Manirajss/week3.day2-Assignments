package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ajio.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
        driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-genderfilter')])[2]")).click();
       // Thread.sleep(2000);
        String totalltems = driver.findElement(By.className("length")).getText();
        System.out.println("Total number of items: "+totalltems);
        System.out.println("List of Brands");
        List<WebElement> bagBrandList= driver.findElements(By.className("brand"));
        System.out.println("Size: "+bagBrandList.size());
        for(int i=0; i<bagBrandList.size(); i++) {
        	String text = driver.findElement(By.className("brand")).getText();
        	System.out.println(text);
        }
        List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
        System.out.println("Size: "+bagNameList.size());
        System.out.println("Names of the Bags");
        for(int j=0; j<bagNameList.size(); j++) {
        	String name = driver.findElement(By.className("nameCls")).getText();
        	System.out.println(name);
        }
	}

}
