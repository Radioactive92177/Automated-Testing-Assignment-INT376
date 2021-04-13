package testingUMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UMSTestSuite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

//		Opening UMS
		driver.get("https://ums.lpu.in/lpuums/");

//		Maximizing Window
		driver.manage().window().maximize();

//		Retrieving title
		String title = driver.getTitle();
		String expecteTitle = "UMS | Lovely Professional University | University Management System";

		if (title.contentEquals(expecteTitle)) {
			System.out.println("Test Passed !");
		} else {
			System.out.println("Test Failed !");
		}
	}
}
