package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01_notasyons {


    // her bir testinöncelik değeri 0 'dır
    @Test (priority = 1)
    public void devrim(){
        System.out.println("Devrim testi çalıştı");
    }

    @Test (priority = 2)
    public void odilov(){
        System.out.println("Odilov testi çalıştı");
    }

    @Test (dependsOnMethods = "odilov")
    public void elif(){
        System.out.println("Elif testi çalıştı");
    }

    @Test
    public void murat(){
        System.out.println("Murat testi çalıştı");
    }
}
