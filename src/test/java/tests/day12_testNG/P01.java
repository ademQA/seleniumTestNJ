package tests.day12_testNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class P01 {
    @Test
    public void test01(){
        Driver.getDriver().get("https:amazon.com");

        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }
}
