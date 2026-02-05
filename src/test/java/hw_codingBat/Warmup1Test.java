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


}
