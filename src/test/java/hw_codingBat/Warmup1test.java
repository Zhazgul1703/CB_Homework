package hw_codingBat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Warmup1test extends BaseTest{
//    sleepIn(false, false) → true	true	OK
//    sleepIn(true, false) → false	false	OK
//    sleepIn(false, true) → true	true	OK
//    sleepIn(true, true) → true	true	OK
    @BeforeAll
    static  void beforAll(){
        System.out.println("Before all");
    }

    @Test
    void sleepIn(){
        Assertions.assertEquals(false,false);
    }


}
