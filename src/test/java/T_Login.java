import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class T_Login {
	
	@Test(dataProvider="getData")
	public static void login(String name, String pass){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com");
		driver.findElement(By.xpath("//input[@id='signin-email']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='signin-password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='submit btn primary-btn flex-table-btn js-submit']")).click();
	}
	
	@DataProvider
	public static Object[][] getData() throws IOException{
		
		Object[][] data= new Object[3][2];
		
		data[0][0]= Excel.read(1, 0);
		data[0][1]= Excel.read(1, 1);
		
		data[1][0]= Excel.read(2, 0);
		data[1][1]= Excel.read(2, 1);
		
		data[2][0]= Excel.read(3, 0);
		data[2][1]= Excel.read(3, 1);
		
		
		
		
		return data;
	}
	
	
}
