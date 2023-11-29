package tuyet.hoangthi.Bai11_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;
import org.testng.Assert;
import org.testng.annotations.Test;
import tuyet.hoangthi.common.BaseTesst;

public class DemoHardAssert extends BaseTesst {

    // hard assert fail tại đâu chết dòng đó , không chạy các dòng tiếp theo
    @Test
    public void testLoginCRM() {
        // Asert cái header với cái test của nó
        driver.get("https://crm.anhtester.com/admin/authentication");
        String header = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        Assert.assertEquals(header, "Login", "giá trị đúng"); // nếu dòng này chết thì các dòng dưới cũng chết theo
        System.out.println("-------------------");

        boolean checkButtonLogin = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).isEnabled();
        Assert.assertTrue(checkButtonLogin, "Nut login không được bật");
        System.out.println("-------------------");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // sleep(Double.parseDouble("1000"));
        String menuName = driver.findElement(By.xpath("//span[normalize-space()='Customers']")).getText();
        // kiểm tra nếu chứa Custormer thì trả về true, so sánh chứa
        Assert.assertTrue(menuName.contains("Custormerhgjkhkl"), "giá tri menu name ko chứa giá trị mong muốn : " + menuName);
    }
}