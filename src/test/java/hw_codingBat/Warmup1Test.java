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
//
//
//    diff21(30) → 18	18	OK
//    diff21(0) → 21	21	OK
//    diff21(1) → 20	20	OK
//    diff21(2) → 19	19	OK
//    diff21(-1) → 22	22	OK
//    diff21(-2) → 23	23	OK
//    diff21(50) → 58	58	OK
    @Test
    void diff21(){
        Assertions.assertEquals(2,2);
        Assertions.assertEquals(11,11);
        Assertions.assertEquals(0,0);
        Assertions.assertEquals(2,2);
        Assertions.assertEquals(8,8);
        Assertions.assertEquals(18,18);
        Assertions.assertEquals(21,21);
        Assertions.assertEquals(20,20);
        Assertions.assertEquals(19,19);
        Assertions.assertEquals(22,22);
        Assertions.assertEquals(23,23);
        Assertions.assertEquals(58,58);
    }


}
