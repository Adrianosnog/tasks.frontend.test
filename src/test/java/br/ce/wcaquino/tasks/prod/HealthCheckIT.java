package br.ce.wcaquino.tasks.prod;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthCheckIT {
	
	@Test
	public void healthCheckIT9(){
		
		
		WebDriver driver = new ChromeDriver();
		try {
		driver.navigate().to("http://localhost:9999/tasks");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String version = driver.findElement(By.id("version")).getText();
		Assert.assertTrue(version.startsWith("build"));
		}finally {
		driver.quit();
		}
		
	}	

}
