package br.com.derekszabo.javaseleniumpuro.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetDriver {

	public static WebDriver configurarDriver() {

		String exePath = "C:\\Users\\dssza\\Cursos\\CursoSelenium\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}

}
