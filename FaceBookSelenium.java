package testFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTestSuite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

//		Opening FaceBook
		driver.get("https://www.Facebook.com");

//		Maximizing Window
		driver.manage().window().maximize();

//		Retrieving title
		String title = driver.getTitle();
		String expecteTitle = "Facebook – log in or sign up";

		if (title.contentEquals(expecteTitle)) {
			System.out.println("Test Passed !");
		} else {
			System.out.println("Test Failed !");
		}
	}
}
