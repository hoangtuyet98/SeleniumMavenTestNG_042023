package tuyet.hoangthi.Bai10_Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tuyet.hoangthi.common.BaseTesst;

public class CustormerTest extends BaseTesst {
    @Test(priority = 1)
    public void testCusstomer(){
       //login
        //mở menu
        // mở form add
    }
    @Test(priority = 2)
    public void testFilterCusstomer(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    @Test(priority = 3)
    public void testAddCusstomerDuplicated(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    @Test(priority = 4)
    public void testEditCusstomerDuplicated(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    @Test(priority = 5)
    public void testDeleteCusstomerDuplicated(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    //---
    @Test
    public void testAddCusstomerFlow(){
        //mở menu
        // mở form add
    }
}
