package tuyet.hoangthi.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import org.testng.annotations.*;

public class BaseTesst {
//    //ko xử lý có hàm ko có @test, nó chỉ hiểu là các hàm xử lý trung gian
//    public void testABC(){
//        System.out.println("Test ABC");
//    }
//
//    @BeforeClass
//    public void beforeBaseClass() {
//        System.out.println("Parent Before Class method");
//    }
//
//    @AfterClass
//    public void afterBaseClass() {
//        System.out.println("Parent After Class method");
//    }
//
//    @BeforeMethod
//    public void beforeBaseMethod() {
//        System.out.println("Parent Before method");
//    }
//
//    @AfterMethod
//    public void afterBaseMethod() {
//        System.out.println("Parent After method");
//    }





        public WebDriver driver;
        @BeforeClass //chạy trước mỗi @test
        public void createBrowser(){
            System.setProperty("webdriver.http.factory", "jdk-http-client");

            driver =new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// thời gian chờ đợi tìm kiếm element
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // thời gian chờ đợi load trang, nếu  quá 10s là báo lỗi
        }
        public void createBrowser(String browserName){
            if(browserName.equals("chrome")){
                driver =new ChromeDriver();
            }
            if(browserName.equals("edge")){
                driver =new EdgeDriver();
            }
            if(browserName.equals("firefox")){
                driver =new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// thời gian chờ đợi tìm kiếm element
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // thời gian chờ đợi load trang, nếu  quá 10s là báo lỗi
        }
        @AfterClass
        public void closeBrowser(){
            try {
                Thread.sleep(Long.parseLong("2000"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }
        public void sleep(double second){

        }
    }