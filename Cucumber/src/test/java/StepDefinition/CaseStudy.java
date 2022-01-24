package StepDefinition;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class CaseStudy {

	WebDriver driver = null;

	@Given("Open PhpTravels site")
	public void open_php_travels_site() {
		System.out.println("inside step - PhpTraveles is open");

		System.setProperty("webdriver.chrome.driver", "F:\\Software\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
	}

	@When("Click on Login")
	public void Click_on_Login() {
		System.out.println("inside step - click on login");
		driver.findElement(By.xpath("/html/body/header/div/nav/a[4]")).click();
	}

	@Then("it will switch to second window")
	public void it_will_switch_to_second_window() {
		System.out.println("inside step - switch to 2nd Window");
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> iter=windows.iterator();
		String window1=iter.next();
		String window2=iter.next();
		driver.switchTo().window(window2);
	}

	@When("user click on creat new account")
	public void user_click_on_creat_new_account() {
		System.out.println("inside step - click on Creat new Account");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/div/a")).click();
	}

	@Then("user have to fill personal details")
	public void user_have_to_fill_personal_details() {
		System.out.println("inside step - form filling");
		driver.findElement(By.xpath("//*[@id=\"inputFirstName\"]")).sendKeys("Kshitij1234");
		driver.findElement(By.xpath("//*[@id=\"inputLastName\"]")).sendKeys("Ambade1234");
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("kshitij1234.anilambade@hcl.com");
		driver.findElement(By.xpath("//*[@id=\"inputCompanyName\"]")).sendKeys("HCL");
		driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys("PUNE MAGARAPATTA CITY");
		driver.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("PUNE");
		driver.findElement(By.xpath("//*[@id=\"stateinput\"]")).sendKeys("MAHARASHTRA");
		driver.findElement(By.xpath("//*[@id=\"inputPostcode\"]")).sendKeys("411015");


		driver.findElement(By.xpath("//*[@id=\"inputNewPassword1\"]")).sendKeys("Xperia@x8");
		driver.findElement(By.xpath("//*[@id=\"inputNewPassword2\"]")).sendKeys("Xperia@x8");

		Select sel1 = new Select (driver.findElement(By.xpath("//*[@id=\"inputCountry\"]")));
		sel1.selectByValue("IN");

		driver.findElement(By.xpath("//*[@id=\"inputPhone\"]")).sendKeys("7387826568");

		Select sel2 = new Select (driver.findElement(By.xpath("//*[@id=\"stateselect\"]"))); 
		sel2.selectByVisibleText("Maharashtra");

	}

	@And("hits Register button")
	public void hits_register_button() throws InterruptedException {
		System.out.println("inside step - click on Register button");
		Thread.sleep(16000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[5]/input")).click();
	}
	
	@When("User is sussfuly register and logged it Take Screenshort")
	public void User_is_sussfull_register_and_logged_it_Take_Screenshort() throws AWTException, IOException {
		System.out.println("inside step - Take Screenshort on the front page");
		
		Robot robot1=new Robot();
		Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(sc_size);
		BufferedImage Source=robot1.createScreenCapture(rect);
		File destination=new File("F:\\screen2.png");
		ImageIO.write(Source, "png", destination);
	}

}
