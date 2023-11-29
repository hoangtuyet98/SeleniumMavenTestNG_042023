package tuyet.hoangthi.Bai10_Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tuyet.hoangthi.common.BaseTesst;

public class LoginTest extends BaseTesst {
    @Test(priority = 1)
    public void testLoginSuccess(){
    driver.get("https://crm.anhtester.com/admin/authentication");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
    @Test(priority = 2)
    public void testCusstomer(){
        testLoginSuccess(); //gọi lại phần auto login từ testLoginSuccess
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
}
