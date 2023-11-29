package tuyet.hoangthi.Bai11_Assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tuyet.hoangthi.common.BaseTesst;

public class DemoSoftchAssert extends BaseTesst {


    // hard assert fail tại đâu chết dòng đó , không chạy các dòng tiếp theo
    @Test
    public void testLoginCRM() {

        driver.get("https://crm.anhtester.com/admin/authentication");
        // Khai báo đối tượng soft assert
        SoftAssert softAssert=new SoftAssert();

        String header = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        softAssert.assertEquals(header, "Login12323", "giá trị đúng"); // nếu dòng này chết thì các dòng dưới cũng chết theo
        System.out.println("-------------------");

        boolean checkButtonLogin = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).isEnabled();
        softAssert.assertTrue(checkButtonLogin, "Nut login  được bật");
        System.out.println("-------------------");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // sleep(Double.parseDouble("1000"));
        String menuName = driver.findElement(By.xpath("//span[normalize-space()='Customers']")).getText();
        // kiểm tra nếu chứa Custormer thì trả về true, so sánh chứa
        softAssert.assertTrue(menuName.contains("Custormerhgjkhkl"), "giá tri menu name ko chứa giá trị mong muốn : " + menuName);

        softAssert.assertAll(); //tổng kết tất cả trường Fail
    }

    public void testLoginCRM2() {

        driver.get("https://crm.anhtester.com/admin/authentication");
        // Khai báo đối tượng soft assert
        SoftAssert softAssert=new SoftAssert();

        String header = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        softAssert.assertEquals(header, "Login12323", "giá trị đúng"); // nếu dòng này chết thì các dòng dưới cũng chết theo
        System.out.println("-------------------");

        boolean checkButtonLogin = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).isEnabled();
        softAssert.assertTrue(checkButtonLogin, "Nut login  được bật");
        System.out.println("-------------------");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // sleep(Double.parseDouble("1000"));
        String menuName = driver.findElement(By.xpath("//span[normalize-space()='Customers']")).getText();
        // kiểm tra nếu chứa Custormer thì trả về true, so sánh chứa
        softAssert.assertTrue(menuName.contains("Custormerhgjkhkl"), "giá tri menu name ko chứa giá trị mong muốn : " + menuName);

       softAssert.assertAll(); //tổng kết tất cả trường Fail
    }

    public void testLoginCRM3() {

        driver.get("https://crm.anhtester.com/admin/authentication");
        // Khai báo đối tượng soft assert
        SoftAssert softAssert=new SoftAssert();

        String header = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        softAssert.assertEquals(header, "Login12323", "giá trị đúng"); // nếu dòng này chết thì các dòng dưới cũng chết theo
        System.out.println("-------------------");

        boolean checkButtonLogin = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).isEnabled();
        softAssert.assertTrue(checkButtonLogin, "Nut login  được bật");
        System.out.println("-------------------");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // sleep(Double.parseDouble("1000"));
        String menuName = driver.findElement(By.xpath("//span[normalize-space()='Customers']")).getText();
        // kiểm tra nếu chứa Custormer thì trả về true, so sánh chứa
        softAssert.assertTrue(menuName.contains("Custormerhgjkhkl"), "giá tri menu name ko chứa giá trị mong muốn : " + menuName);

        softAssert.assertAll(); //tổng kết tất cả trường Fail
    }
}