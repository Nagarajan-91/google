package testig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	@Test
	public void search() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Downloads/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.com");
		WebElement ELE =d.findElement(By.xpath(".//*[@id='lst-ib']"));
		ELE.sendKeys("google");
		Thread.sleep(5000);
		List<WebElement> ld =d.findElements(By.xpath("//li[@class='sbsb_c gsfs']//div[@class='sbqs_c']"));
		for(WebElement w:ld) {
			System.out.println(w.getText());
		if(w.getText().equalsIgnoreCase("google translate")) {
				w.click();
			}
		}
	}
}
