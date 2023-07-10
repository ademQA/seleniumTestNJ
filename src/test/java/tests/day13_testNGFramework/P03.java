package tests.day13_testNGFramework;

import org.testng.annotations.Test;
import utilities.ConfigReader;

public class P03 {

    @Test
    public void test01(){
        System.out.println(ConfigReader.getProperty("amazonUrl"));
        System.out.println(ConfigReader.getProperty("wiseurl"));
        System.out.println(ConfigReader.getProperty("password"));
        System.out.println(ConfigReader.getProperty("qdGecerliUsername"));
    }
}
