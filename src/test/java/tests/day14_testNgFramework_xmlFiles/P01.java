package tests.day14_testNgFramework_xmlFiles;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P01 {
    @Test
    public  void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();
    }
}
