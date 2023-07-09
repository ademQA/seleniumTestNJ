package tests.day12_testNG;

import org.testng.annotations.Test;

public class P02 {
    @Test(priority = 5)
    public void amazontest(){
        System.out.println("amazon");

    }

    @Test(priority = 3)
    public void youtubetest(){
        System.out.println("youtube");

    }

    @Test(priority = 1)
    public void wisetest(){
        System.out.println("wise");

    }
}
