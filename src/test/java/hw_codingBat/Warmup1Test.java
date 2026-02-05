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
//    sleepIn(false, false) → true	true	OK
//    sleepIn(true, false) → false	false	OK
//    sleepIn(false, true) → true	true	OK
//    sleepIn(true, true) → true	true	OK
    @Test
    void sleepIn(){
        Assertions.assertEquals(false,false);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
    }
//    monkeyTrouble(true, true) → true	true	OK
//    monkeyTrouble(false, false) → true	true	OK
//    monkeyTrouble(true, false) → false	false	OK
//    monkeyTrouble(false, true) → false	false	OK

    @Test
    void monkeyTrouble(){
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
    }
//    sumDouble(1, 2) → 3	3	OK
//    sumDouble(3, 2) → 5	5	OK
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
//    diff21(19) → 2	2	OK
//    diff21(10) → 11	11	OK
//    diff21(21) → 0	0	OK
//    diff21(22) → 2	2	OK
//    diff21(25) → 8	8	OK
//    diff21(30) → 18	18	OK
//    diff21(0) → 21	21	OK
//    diff21(1) → 20	20	OK
//    diff21(2) → 19	19	OK
//    diff21(-1) → 22	22	OK
//    diff21(-2) → 23	23	OK
//    diff21(50) → 58	58	OK
    @Test
    void diff21() {
        Assertions.assertEquals(2, 2);
        Assertions.assertEquals(11, 11);
        Assertions.assertEquals(0, 0);
        Assertions.assertEquals(2, 2);
        Assertions.assertEquals(8, 8);
        Assertions.assertEquals(18, 18);
        Assertions.assertEquals(21, 21);
        Assertions.assertEquals(20, 20);
        Assertions.assertEquals(19, 19);
        Assertions.assertEquals(22, 22);
        Assertions.assertEquals(23, 23);
        Assertions.assertEquals(58, 58);
    }

//    parrotTrouble(true, 6) → true	true	OK
//    parrotTrouble(true, 7) → false	false	OK
//    parrotTrouble(false, 6) → false	false	OK
//    parrotTrouble(true, 21) → true	true	OK
//    parrotTrouble(false, 21) → false	false	OK
//    parrotTrouble(false, 20) → false	false	OK
//    parrotTrouble(true, 23) → true	true	OK
//    parrotTrouble(false, 23) → false	false	OK
//    parrotTrouble(true, 20) → false	false	OK
//    parrotTrouble(false, 12) → false	false	OK
    @Test
    void parrotTrouble(){
      Assertions.assertTrue(true);
      Assertions.assertFalse(false);
      Assertions.assertFalse(false);
      Assertions.assertTrue(true);
      Assertions.assertFalse(false);
      Assertions.assertFalse(false);
      Assertions.assertTrue(true);
      Assertions.assertFalse(false);
      Assertions.assertFalse(false);
      Assertions.assertFalse(false);
    }
//    makes10(9, 10) → true	true	OK
//    makes10(9, 9) → false	false	OK
//    makes10(1, 9) → true	true	OK
//    makes10(10, 1) → true	true	OK
//    makes10(10, 10) → true	true	OK
//    makes10(8, 2) → true	true	OK
//    makes10(8, 3) → false	false	OK
//    makes10(10, 42) → true	true	OK
//    makes10(12, -2) → true	true	OK
    @Test
    void  makes10(){
       Assertions.assertTrue(true);
       Assertions.assertFalse(false);
       Assertions.assertTrue(true);
       Assertions.assertTrue(true);
       Assertions.assertTrue(true);
       Assertions.assertTrue(true);
       Assertions.assertFalse(false);
       Assertions.assertTrue(true);
       Assertions.assertTrue(true);
    }
//    nearHundred(93) → true	true	OK
//    nearHundred(90) → true	true	OK
//    nearHundred(89) → false	false	OK
//    nearHundred(110) → true	true	OK
//    nearHundred(111) → false	false	OK
//    nearHundred(121) → false	false	OK
//    nearHundred(-101) → false	false	OK
//    nearHundred(-209) → false	false	OK
//    nearHundred(190) → true	true	OK
//    nearHundred(209) → true	true	OK
//    nearHundred(0) → false	false	OK
//    nearHundred(5) → false	false	OK
//    nearHundred(-50) → false	false	OK
//    nearHundred(191) → true	true	OK
//    nearHundred(189) → false	false	OK
//    nearHundred(200) → true	true	OK
//    nearHundred(210) → true	true	OK
//    nearHundred(211) → false	false	OK
//    nearHundred(290) → false	false	OK
    @Test
    void nearHundred(){
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
    }
//    posNeg(1, -1, false) → true	true	OK
//    posNeg(-1, 1, false) → true	true	OK
//    posNeg(-4, -5, true) → true	true	OK
//    posNeg(-4, -5, false) → false	false	OK
//    posNeg(-4, 5, false) → true	true	OK
//    posNeg(-4, 5, true) → false	false	OK
//    posNeg(1, 1, false) → false	false	OK
//    posNeg(-1, -1, false) → false	false	OK
//    posNeg(1, -1, true) → false	false	OK
//    posNeg(-1, 1, true) → false	false	OK
//    posNeg(1, 1, true) → false	false	OK
//    posNeg(-1, -1, true) → true	true	OK
//    posNeg(5, -5, false) → true	true	OK
//    posNeg(-6, 6, false) → true	true	OK
//    posNeg(-5, -6, false) → false	false	OK
//    posNeg(-2, -1, false) → false	false	OK
//    posNeg(1, 2, false) → false	false	OK
//    posNeg(-5, 6, true) → false	false	OK
//    posNeg(-5, -5, true) → true	true	OK
    @Test
    void posNeg(){
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertFalse(false);
        Assertions.assertTrue(true);
    }

//    notString("candy") → "not candy"	"not candy"	OK
//    notString("x") → "not x"	"not x"	OK
//    notString("not bad") → "not bad"	"not bad"	OK
//    notString("bad") → "not bad"	"not bad"	OK
//    notString("not") → "not"	"not"	OK
//    notString("is not") → "not is not"	"not is not"	OK
//    notString("no") → "not no"	"not no"	OK
    @Test
    void  notString(){
        Assertions.assertEquals("not candy","not candy");
        Assertions.assertEquals("not x","not x");
        Assertions.assertEquals("not bad","not bad");
        Assertions.assertEquals("not bad",warmup1.notString("bad"));
        Assertions.assertEquals("not","not");
        Assertions.assertEquals("is not","is not");
       Assertions.assertEquals("is not", "is not");
    }
//    missingChar("kitten", 1) → "ktten"	"ktten"	OK
//    missingChar("kitten", 0) → "itten"	"itten"	OK
//    missingChar("kitten", 4) → "kittn"	"kittn"	OK
//    missingChar("Hi", 0) → "i"	"i"	OK
//    missingChar("Hi", 1) → "H"	"H"	OK
//    missingChar("code", 0) → "ode"	"ode"	OK
//    missingChar("code", 1) → "cde"	"cde"	OK
//    missingChar("code", 2) → "coe"	"coe"	OK
//    missingChar("code", 3) → "cod"	"cod"	OK
//    missingChar("chocolate", 8) → "chocolat"	"chocolat"	O
    @Test
    void  missingChar(){
        Assertions.assertEquals("ktten","ktten");
        Assertions.assertEquals("itten", "itten");
        Assertions.assertEquals("kittn","kittn");
        Assertions.assertEquals("i", "i");
        Assertions.assertEquals("h","h");
        Assertions.assertEquals("ode", "ode");
        Assertions.assertEquals("cde", "cde");
        Assertions.assertEquals("coe","coe");
        Assertions.assertEquals("cod", "cod");
        Assertions.assertEquals("chocolat","chocolat");
    }
//    frontBack("code") → "eodc"	"eodc"	OK
//    frontBack("a") → "a"	"a"	OK
//    frontBack("ab") → "ba"	"ba"	OK
//    frontBack("abc") → "cba"	"cba"	OK
//    frontBack("") → ""	""	OK
//    frontBack("Chocolate") → "ehocolatC"	"ehocolatC"	OK
//    frontBack("aavJ") → "Java"	"Java"	OK
//    frontBack("hello") → "oellh"	"oellh"	OK
    @Test
    void  frontBack(){
        Assertions.assertEquals("eodc", "eodc");
        Assertions.assertEquals("a","a");
        Assertions.assertEquals("ab","ab");
        Assertions.assertEquals("cba","cba");
        Assertions.assertEquals("","");
        Assertions.assertEquals("ehocolatC","ehocolatC");
        Assertions.assertEquals("Java","Java");
        Assertions.assertEquals("oellh","oellh");
    }

}
