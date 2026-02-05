package hw_codingBat;

import org.junit.jupiter.api.*;

public class Warmup1Test extends BaseTest{

    @BeforeAll
    static  void beforAll(){
        System.out.println("Before all test");
    }
    @BeforeEach
     void beforeEach(){
        System.out.println("Before each test");
    }
    @AfterAll
    static  void afterAll(){
        System.out.println("After all test");
    }
    @AfterEach
    void afterEach(){
        System.out.println("After each test");
    }

    @Test
    void sleepIn(){
        Assertions.assertEquals(false,false);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
    }

    @Test
    void monkeyTrouble(){
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
    }
//
//    sumDouble(2, 2) → 8	8	OK
//    sumDouble(-1, 0) → -1	-1	OK
//    sumDouble(3, 3) → 12	12	OK
//    sumDouble(0, 0) → 0	0	OK
//    sumDouble(0, 1) → 1	1	OK
//    sumDouble(3, 4) → 7	7	OK
    @Test
    void sumDouble(){
        Assertions.assertEquals(3,3);
        Assertions.assertEquals(5,5);
       Assertions.assertEquals(8,8);
       Assertions.assertEquals(-1,-1);
       Assertions.assertEquals(12,12);
       Assertions.assertEquals(0,0);
       Assertions.assertEquals(1,1);
       Assertions.assertEquals(7,7);
    }


}
