package bookingReport;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MIS_ReportBookingData {

	static WebDriverWait wait;
	static Actions action;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://2.ecareibe.com/miswelcome");
		driver.manage().window().maximize();
		/* driver.manage().deleteAllCookies(); */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementById("misid").sendKeys("admin");
		driver.findElementById("misPassword").sendKeys("Dipl0mat1@");
		driver.findElementByName("Login").click();
		driver.findElementByXPath("//td[text()='Reports']").click();
		driver.findElementById("divCustomBookingSummary").click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Booking Filter']")));

		WebElement service = driver.findElementById("serviceType");
		Select services = new Select(service);
		services.selectByValue("FLIGHT");

		// choosing month range

		/*
		 * driver.findElementById("fromdate").click(); WebElement monthHeading =
		 * driver.findElementByXPath("(//span[@class='ui-datepicker-month'][1])");
		 * WebElement backclick = driver.
		 * findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-w']");
		 * 
		 * while(!monthHeading.getText().equals("January")) { action= new
		 * Actions(driver); action.moveToElement(backclick).click().perform();
		 * 
		 * }
		 * 
		 * driver.findElementByXPath(
		 * "//table[@class='ui-datepicker-calendar']/tbody[1]/tr[1]/td[4]/a[1]").click()
		 * ;
		 */

		/*
		 * int i=1; int n=12;
		 * 
		 * 
		 * for(i=1; i<=n; i++) {
		 * 
		 * driver.findElementById("fromdate").sendKeys("1/"+i+"/2020");
		 * driver.findElementById("todate").sendKeys("31/"+i+"/2020");
		 * 
		 * driver.findElementByXPath("//img[@name='search']").click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@class='pagebanner']"))); String text =
		 * driver.findElementByXPath("//span[@class='pagebanner']").getText();
		 * System.out.println("Month"+i+"="+text);
		 * 
		 * }
		 */
		
		//January
		driver.findElementById("fromdate").sendKeys("1/1/2020");
		driver.findElementById("todate").sendKeys("31/1/2020");	
		driver.findElementByXPath("//img[@name='search']").click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pagebanner']")));
		String text1 = driver.findElementByXPath("//span[@class='pagebanner']").getText();
		System.out.println("January :"+text1);
		driver.findElementById("fromdate").clear();
		driver.findElementById("todate").clear();
		
		
		//February
		
		driver.findElementById("fromdate").sendKeys("1/2/2020");
		driver.findElementById("todate").sendKeys("29/2/2020");	
		driver.findElementByXPath("//img[@name='search']").click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pagebanner']")));
		String text2 = driver.findElementByXPath("//span[@class='pagebanner']").getText();
		System.out.println("February :"+text2);
		Thread.sleep(2000);
		driver.findElementById("fromdate").clear();
		driver.findElementById("todate").clear();
		
		
		//March
		
		driver.findElementById("fromdate").sendKeys("1/3/2020");
		driver.findElementById("todate").sendKeys("31/3/2020");	
		driver.findElementByXPath("//img[@name='search']").click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pagebanner']")));
		String text3 = driver.findElementByXPath("//span[@class='pagebanner']").getText();
		System.out.println("March :"+text3);
		driver.findElementById("fromdate").clear();
		driver.findElementById("todate").clear();
		
		
		//April
		
		driver.findElementById("fromdate").sendKeys("1/4/2020");
		driver.findElementById("todate").sendKeys("30/4/2020");	
		driver.findElementByXPath("//img[@name='search']").click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pagebanner']")));
		String text4 = driver.findElementByXPath("//span[@class='pagebanner']").getText();
		System.out.println("April :"+text4);
		driver.findElementById("fromdate").clear();
		driver.findElementById("todate").clear();
		
		
		//May
		
		driver.findElementById("fromdate").sendKeys("1/5/2020");
		driver.findElementById("todate").sendKeys("31/5/2020");	
		driver.findElementByXPath("//img[@name='search']").click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pagebanner']")));
		String text5 = driver.findElementByXPath("//span[@class='pagebanner']").getText();
		System.out.println("May :"+text5);		
		driver.findElementById("fromdate").clear();
		driver.findElementById("todate").clear();
		
		
		//June
		
		driver.findElementById("fromdate").sendKeys("1/6/2020");
		driver.findElementById("todate").sendKeys("30/6/2020");	
		driver.findElementByXPath("//img[@name='search']").click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pagebanner']")));
		String text6 = driver.findElementByXPath("//span[@class='pagebanner']").getText();
		System.out.println("June :"+text6);
		driver.findElementById("fromdate").clear();
		driver.findElementById("todate").clear();
		
		
		/*
		 * //July
		 * 
		 * driver.findElementById("fromdate").sendKeys("1/7/2020");
		 * driver.findElementById("todate").sendKeys("31/7/2020");
		 * driver.findElementByXPath("//img[@name='search']").click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@class='pagebanner']"))); String text7 =
		 * driver.findElementByXPath("//span[@class='pagebanner']").getText();
		 * System.out.println("July :"+text7);
		 * 
		 * //August
		 * 
		 * driver.findElementById("fromdate").sendKeys("1/8/2020");
		 * driver.findElementById("todate").sendKeys("31/8/2020");
		 * driver.findElementByXPath("//img[@name='search']").click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@class='pagebanner']"))); String text8 =
		 * driver.findElementByXPath("//span[@class='pagebanner']").getText();
		 * System.out.println("August :"+text8);
		 * 
		 * //September
		 * 
		 * driver.findElementById("fromdate").sendKeys("1/9/2020");
		 * driver.findElementById("todate").sendKeys("30/9/2020");
		 * driver.findElementByXPath("//img[@name='search']").click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@class='pagebanner']"))); String text9 =
		 * driver.findElementByXPath("//span[@class='pagebanner']").getText();
		 * System.out.println("September :"+text9);
		 * 
		 * //October
		 * 
		 * driver.findElementById("fromdate").sendKeys("1/10/2020");
		 * driver.findElementById("todate").sendKeys("31/10/2020");
		 * driver.findElementByXPath("//img[@name='search']").click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@class='pagebanner']"))); String text10 =
		 * driver.findElementByXPath("//span[@class='pagebanner']").getText();
		 * System.out.println("October :"+text10);
		 * 
		 * //November
		 * 
		 * driver.findElementById("fromdate").sendKeys("1/11/2020");
		 * driver.findElementById("todate").sendKeys("30/11/2020");
		 * driver.findElementByXPath("//img[@name='search']").click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@class='pagebanner']"))); String text11 =
		 * driver.findElementByXPath("//span[@class='pagebanner']").getText();
		 * System.out.println("November :"+text11);
		 * 
		 * 
		 * //December
		 * 
		 * driver.findElementById("fromdate").sendKeys("1/12/2020");
		 * driver.findElementById("todate").sendKeys("31/12/2020");
		 * driver.findElementByXPath("//img[@name='search']").click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[@class='pagebanner']"))); String text12 =
		 * driver.findElementByXPath("//span[@class='pagebanner']").getText();
		 * System.out.println("December :"+text12);
		 */
		
		
		
		//Read Excel
		

		
		XSSFWorkbook wbook = new XSSFWorkbook();
		XSSFSheet createSheet = wbook.createSheet("Booking count");
		
		Object[][] bookData = {
                {"Sl.No", "Month", "BookingCount"},
                {"1", "Jan", text1},
                {"2", "Feb", text2},
                {"3", "Mar", text3},
                {"4", "Apr", text4},
                {"5", "May", text5},
                {"6", "Jun", text6},
				/*
				 * {"7", "Jul", text7}, {"8", "Aug", text8}, {"9", "Sep", text9}, {"10", "Oct",
				 * text10}, {"11", "Nov", text11}, {"12", "Dec", text12},
				 */
		};
		
		int rowCount = 0;
		
		for (Object[] abook : bookData) {
			Row row = createSheet.createRow(++rowCount);

			int columnCount = 0;
			
			for (Object field : abook) {
				
				Cell cell = row.createCell(++columnCount);
				
				
				  if (field instanceof String) {
				  
				  cell.setCellValue((String) field);
				  
				  }
				  
				  else if (field instanceof Integer) { cell.setCellValue((Integer) field); }
				 
			}
				
			}
			
		
		        
		
		  try (FileOutputStream outputStream = new FileOutputStream("BookingReports.xlsx")) {
		  wbook.write(outputStream);
		  
		  }
		 
		
		
		
	}

}
