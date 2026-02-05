package hw_codingBat;

import org.junit.jupiter.api.*;

public class Warmup1Test extends BaseTest{

    @BeforeAll
    static  void beforAll(){
        System.out.println("Before all test");
    }
    @BeforeEach
     void beforeEach(){
        System.out.println("___Before each test___");
    }
    @AfterAll
    static  void afterAll(){
        System.out.println("After all test");
    }
    @AfterEach
    void afterEach(){
        System.out.println("___After each test___");
    }
//    sleepIn(false, false) → true	true	OK
//    sleepIn(true, false) → false	false	OK
//    sleepIn(false, true) → true	true	OK
//    sleepIn(true, true) → true	true	OK
    @Test
    void sleepIn(){
        Assertions.assertEquals(true,warmup1.sleepIn(false,false));
       Assertions.assertEquals(false,warmup1.sleepIn(true,false));
       Assertions.assertEquals(true,warmup1.sleepIn(false,true));
       Assertions.assertEquals(true,warmup1.sleepIn(true,true));
    }
//    monkeyTrouble(true, true) → true	true	OK
//    monkeyTrouble(true, true) → true	true	OK
//    monkeyTrouble(true, false) → false	false	OK
//    monkeyTrouble(false, true) → false	false	OK

    @Test
    void monkeyTrouble(){
       Assertions.assertEquals(true,warmup1.monkeyTrouble(true, true));
       Assertions.assertEquals(true,warmup1.monkeyTrouble(true, true));
       Assertions.assertEquals(false,warmup1.monkeyTrouble(true, false));
       Assertions.assertEquals(false, warmup1.monkeyTrouble(false, true));
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
        Assertions.assertEquals(3,warmup1.sumDouble(1,2));
        Assertions.assertEquals(5,warmup1.sumDouble(3,2));
       Assertions.assertEquals(8,warmup1.sumDouble(2,2));
       Assertions.assertEquals(-1,warmup1.sumDouble(-1,0));
       Assertions.assertEquals(12,warmup1.sumDouble(3,3));
       Assertions.assertEquals(0,warmup1.sumDouble(0,0));
       Assertions.assertEquals(1,warmup1.sumDouble(0,1));
       Assertions.assertEquals(7,warmup1.sumDouble(3,4));
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
        Assertions.assertEquals(2,warmup1.diff21(19));
        Assertions.assertEquals(11, warmup1.diff21(10));
        Assertions.assertEquals(0, warmup1.diff21(21));
        Assertions.assertEquals(2, warmup1.diff21(22));
        Assertions.assertEquals(8, warmup1.diff21(25));
        Assertions.assertEquals(18, warmup1.diff21(30));
        Assertions.assertEquals(21, warmup1.diff21(0));
        Assertions.assertEquals(20, warmup1.diff21(1));
        Assertions.assertEquals(19, warmup1.diff21(2));
        Assertions.assertEquals(22, warmup1.diff21(-1));
        Assertions.assertEquals(23, warmup1.diff21(-2));
        Assertions.assertEquals(58, warmup1.diff21(50));
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
     Assertions.assertEquals(true,warmup1.parrotTrouble(true,6));
     Assertions.assertEquals(false,warmup1.parrotTrouble(true,7));
     Assertions.assertEquals(false,warmup1.parrotTrouble(false,6));
     Assertions.assertEquals(true,warmup1.parrotTrouble(true,21));
     Assertions.assertEquals(false,warmup1.parrotTrouble(false, 21));
     Assertions.assertEquals(false,warmup1.parrotTrouble(false, 20));
     Assertions.assertEquals(true,warmup1.parrotTrouble(true, 23));
     Assertions.assertEquals(false,warmup1.parrotTrouble(false, 23));
     Assertions.assertEquals(false,warmup1.parrotTrouble(true, 20));
     Assertions.assertEquals(false,warmup1.parrotTrouble(false, 12));
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
       Assertions.assertEquals(true,warmup1.makes10(9, 10));
       Assertions.assertEquals(false,warmup1.makes10(9,9));
       Assertions.assertEquals(true,warmup1.makes10(1,9));
       Assertions.assertEquals(true,warmup1.makes10(10,1));
       Assertions.assertEquals(true,warmup1.makes10(10,10));
       Assertions.assertEquals(true,warmup1.makes10(8,2));
       Assertions.assertEquals(false,warmup1.makes10(8,3));
       Assertions.assertEquals(true,warmup1.makes10(10,42));
       Assertions.assertEquals(true,warmup1.makes10(12,-2));
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
        Assertions.assertEquals(true,warmup1.nearHundred(93));
        Assertions.assertEquals(true,warmup1.nearHundred(90));
        Assertions.assertEquals(false,warmup1.nearHundred(89));
        Assertions.assertEquals(true,warmup1.nearHundred(110));
        Assertions.assertEquals(false,warmup1.nearHundred(111));
        Assertions.assertEquals(false,warmup1.nearHundred(121));
        Assertions.assertEquals(false,warmup1.nearHundred(-101));
        Assertions.assertEquals(false,warmup1.nearHundred(-209));
        Assertions.assertEquals(true,warmup1.nearHundred(190));
        Assertions.assertEquals(true,warmup1.nearHundred(209));
        Assertions.assertEquals(false,warmup1.nearHundred(0));
        Assertions.assertEquals(false,warmup1.nearHundred(5));
        Assertions.assertEquals(false,warmup1.nearHundred(-50));
        Assertions.assertEquals(true,warmup1.nearHundred(191));
        Assertions.assertEquals(false,warmup1.nearHundred(189));
        Assertions.assertEquals(true,warmup1.nearHundred(200));
        Assertions.assertEquals(true,warmup1.nearHundred(210));
        Assertions.assertEquals(false,warmup1.nearHundred(211));
        Assertions.assertEquals(false,warmup1.nearHundred(290));
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
//    posNeg(-5, -6, false) → false	false	OK
//    posNeg(1, 2, false) → false	false	OK
//    posNeg(1, 2, false) → false	false	OK
//    posNeg(-5, -5, true) → true	true	OK
    @Test
    void posNeg(){
        Assertions.assertEquals(true,warmup1.posNeg(1,-1,false));
        Assertions.assertEquals(true,warmup1.posNeg(-1, 1, false));
        Assertions.assertEquals(true,warmup1.posNeg(-4, -5, true));
        Assertions.assertEquals(false,warmup1.posNeg(-4, -5, false));
        Assertions.assertEquals(true,warmup1.posNeg(-4, 5, false));
        Assertions.assertEquals(false,warmup1.posNeg(-4, 5, true));
        Assertions.assertEquals(false,warmup1.posNeg(1, 1, false));
        Assertions.assertEquals(false,warmup1.posNeg(-1, -1, false));
        Assertions.assertEquals(false,warmup1.posNeg(1, -1, true));
        Assertions.assertEquals(false,warmup1.posNeg(-1, 1, true));
        Assertions.assertEquals(false,warmup1.posNeg(1, 1, true));
        Assertions.assertEquals(true,warmup1.posNeg(-1, -1, true));
        Assertions.assertEquals(true,warmup1.posNeg(5, -5, false));
        Assertions.assertEquals(true,warmup1.posNeg(-6, 6, false));
        Assertions.assertEquals(false,warmup1.posNeg(-5, -6, false));
        Assertions.assertEquals(false,warmup1.posNeg(-5, -6, false));
        Assertions.assertEquals(false,warmup1.posNeg(1, 2, false));
        Assertions.assertEquals(false,warmup1.posNeg(1, 2, false));
        Assertions.assertEquals(true,warmup1.posNeg(-5, -5, true));
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
        Assertions.assertEquals("not candy",warmup1.notString("candy"));
        Assertions.assertEquals("not x",warmup1.notString("x"));
        Assertions.assertEquals("not bad",warmup1.notString("not bad"));
        Assertions.assertEquals("not bad",warmup1.notString("bad"));
        Assertions.assertEquals("not",warmup1.notString("not"));
        Assertions.assertEquals("not is not",warmup1.notString("is not"));
       Assertions.assertEquals("not no", warmup1.notString("no"));
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
        Assertions.assertEquals("ktten", warmup1.missingChar("kitten", 1));
        Assertions.assertEquals("itten", warmup1.missingChar("kitten", 0));
        Assertions.assertEquals("kittn",warmup1.missingChar("kitten", 4));
        Assertions.assertEquals("i", warmup1.missingChar("Hi", 0));
        Assertions.assertEquals("H",warmup1.missingChar("Hi", 1));
        Assertions.assertEquals("ode", warmup1.missingChar("code", 0));
        Assertions.assertEquals("cde", warmup1.missingChar("code", 1));
        Assertions.assertEquals("coe",warmup1.missingChar("code", 2));
        Assertions.assertEquals("cod", warmup1.missingChar("code", 3));
        Assertions.assertEquals("chocolat",warmup1.missingChar("chocolate", 8));
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
        Assertions.assertEquals("eodc",warmup1.frontBack("code"));
        Assertions.assertEquals("a",warmup1.frontBack("a"));
        Assertions.assertEquals("ba",warmup1.frontBack("ab"));
        Assertions.assertEquals("cba",warmup1.frontBack("abc"));
        Assertions.assertEquals("",warmup1.frontBack(""));
        Assertions.assertEquals("ehocolatC",warmup1.frontBack("Chocolate"));
        Assertions.assertEquals("Java",warmup1.frontBack("aavJ"));
        Assertions.assertEquals("oellh",warmup1.frontBack("hello"));

    }
//    front3("Java") → "JavJavJav"	"JavJavJav"	OK
//    front3("Chocolate") → "ChoChoCho"	"ChoChoCho"	OK
//    front3("abc") → "abcabcabc"	"abcabcabc"	OK
//    front3("abcXYZ") → "abcabcabc"	"abcabcabc"	OK
//    front3("ab") → "ababab"	"ababab"	OK
//    front3("a") → "aaa"	"aaa"	OK
//    front3("") → ""	""	OK
    @Test
    void  front3(){
        Assertions.assertEquals("JavJavJav",warmup1.front3("Java"));
        Assertions.assertEquals("ChoChoCho",warmup1.front3("Chocolate"));
        Assertions.assertEquals("abcabcabc",warmup1.front3("abc"));
        Assertions.assertEquals("abcabcabc",warmup1.front3("abcXYZ"));
        Assertions.assertEquals("ababab",warmup1.front3("ab"));
        Assertions.assertEquals("aaa",warmup1.front3("a"));
        Assertions.assertEquals("",warmup1.front3(""));
    }



}
