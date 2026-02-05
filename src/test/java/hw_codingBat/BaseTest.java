package hw_codingBat;

import org.example.hw_codingBat.warmup1.Warmup1;
import org.junit.jupiter.api.BeforeAll;

public  abstract class BaseTest {

    protected static Warmup1 warmup1;

    @BeforeAll
    public static void setWarmup1(){
         warmup1 = new Warmup1();
    }
}
