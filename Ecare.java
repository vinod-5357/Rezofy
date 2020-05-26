package rez.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecare {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://2.ecareibe.com/");


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Search form

		WebElement origin= driver.findElement(By.id("intOrigin"));
		origin.sendKeys("maa");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ui-id-1']//li")));

		List<WebElement> list1=	driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("List suggestions"+ list1.size());

		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i).getText());

			if(list1.get(i).getText().equals("Chennai, Chennai Intl Airport, IN (MAA)")){
				list1.get(i).click();
			}

		}


		WebElement destination= driver.findElement(By.id("intDestination"));
		destination.sendKeys("blr");

		WebDriverWait wait1= new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ui-id-2']//li")));

		List<WebElement> list2 = driver.findElements(By.xpath("//*[@id='ui-id-2']//li"));
		System.out.println("list suggestions"+list2.size());

		for(int i = 0; i<list2.size(); i++){
			System.out.println(list2.get(i).getText());

			if(list2.get(i).getText().equals("Bengaluru, Kempegowda Intl Airport, IN (BLR)")){

				list2.get(i).click();


			}

		}


		WebElement calender= driver.findElement(By.name("data.searchCriteria.departDateTime.dateWithoutTime"));
		calender.click();


		WebElement nextbutton=driver.findElement(By.xpath("//a[@data-handler='next']"));
		nextbutton.click();

		WebElement dateselect=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[5]/a"));
		dateselect.click();

		WebElement traveler=driver.findElement(By.xpath("/html/body/form/section[2]/div[2]/div/div[2]/div[2]/div[1]/div/div[5]/span/input"));
		traveler.click();

		WebElement adult=driver.findElement(By.id("adults"));

		Select adultnum = new Select(adult);
		adultnum.selectByValue("2");


		WebElement search= driver.findElement(By.xpath("//*[@id='search-form']/section[2]/div[2]/div/div[2]/div[2]/div[2]/span/button"));
		search.click();




		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[13]/div[2]/section[5]/div[2]/div[1]/div/div/div[2]/div/div/div/div[1]/div/div[6]/div/div[1]")));


		//Select flight from search result page


		WebElement book= driver.findElement(By.xpath("/html/body/div[13]/div[2]/section[5]/div[2]/div[1]/div/div/div[2]/div/div/div/div[1]/div/div[6]/div/div[1]"));
		book.click();

		WebDriverWait wait3= new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("customeremail")));


		//Third page login


		WebElement inputemail= driver.findElement(By.id("customeremail"));
		inputemail.sendKeys("vinodtest8882@rezofy.com");

		WebElement inputnumber=driver.findElement(By.id("customermobileno"));
		inputnumber.sendKeys("8870987571");

		Thread.sleep(2000);

		WebElement checkbox2= driver.findElement(By.xpath("//input[@name='cb']"));
		checkbox2.click();

		Thread.sleep(2000);

		WebElement okbutton=driver.findElement(By.id("button"));
		okbutton.click();


		WebDriverWait wait4=new WebDriverWait(driver, 50);
		wait4.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("firstName0")));


		//Travel detail page

		WebElement firstname =driver.findElement(By.id("firstName0"));
		firstname.sendKeys("vinod"+Keys.ENTER);

		WebElement lastname=driver.findElement(By.id("lastName0"));
		lastname.sendKeys("kumar"+Keys.ENTER);

		driver.findElementById("firstName1").sendKeys("xyz");

		driver.findElementById("lastName1").sendKeys("abc");

		WebElement address =driver.findElement(By.id("travellerid_data_billingInfo_address1"));
		address.sendKeys("mount road"+Keys.ENTER);

		WebElement city=driver.findElement(By.id("travellerid_data_billingInfo_city"));
		city.sendKeys("chennai"+Keys.ENTER);

		WebElement state=driver.findElement(By.id("tindianStates"));
		state.click();

		Select state1=new Select(state);
		state1.selectByValue("TN");

		WebElement pincode=driver.findElement(By.id("travellerid_data_billingInfo_zip"));
		pincode.sendKeys("600002"+Keys.ENTER);



		WebElement pg =driver.findElement(By.id("radioallgateway0"));
		pg.click();


		Thread.sleep(2000);

		WebElement cbox2=driver.findElement(By.id("tcbeforeBooking"));
		cbox2.click();

		Thread.sleep(2000);


		WebElement confirmbook=driver.findElement(By.xpath("(//button[@value='Book Now'])[1]"));

		confirmbook.click();



		Thread.sleep(3000);

		driver.findElementByXPath("//span[text()='Continue']").click();

		Thread.sleep(2000);

		//Payment gateway

		driver.findElementById("ccard_number").sendKeys("5123456789012346");


		driver.findElementById("cname_on_card").sendKeys("test");

		driver.findElementById("ccvv_number").sendKeys("123");

		WebElement cardmonth= driver.findElementById("cexpiry_date_month");

		Select month = new Select(cardmonth);

		month.selectByValue("05");


		WebElement cardYear= driver.findElementById("cexpiry_date_year");

		Select year = new Select(cardYear);

		year.selectByValue("2020");

		Thread.sleep(2000);


		driver.findElementById("pay_button").click();













	}


}
