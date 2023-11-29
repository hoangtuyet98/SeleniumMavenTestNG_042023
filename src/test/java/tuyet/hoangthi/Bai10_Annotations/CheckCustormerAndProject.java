package tuyet.hoangthi.Bai10_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;
import org.testng.annotations.Test;
import tuyet.hoangthi.common.BaseTesst;

public class CheckCustormerAndProject extends BaseTesst {
    //Mở Browser mỗi lần
    @Test(priority = 1)
    public void testCustomerAndProject(){
        //login
        //Add custormer
        //Add project
        //Search project
    }
    @Test(priority = 2)
    public void testProjectAndTask(){
        //login
        //Add task
        //Add project
        //Search project
    }
}
