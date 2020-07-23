import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tests {
 main obj=new main();
    @Test
    public void checkPrimeNumber() {
        main obj=new main();
        assertTrue(obj.checkPrimeNumber());
    }

    @Test
    public void CheckEvenorOdd() {
        main obj=new main();
        assertTrue(obj.CheckEvenOdd());
    }
    @Test
    public void CalculateAverage() {
        main obj=new main();
        float expectedaverage=obj.sum/obj.array.length;
        assertEquals(expectedaverage,obj.CalculateAverage());
    }
    @Test
    public void CheckPalindromString() {
        main obj=new main();

        assertTrue(obj.CheckPalindromString());
    }
    @Test
    public void getTempIntoFAndK() {
        main obj=new main();

        float expactedFAndK[]=new float[2];
        expactedFAndK[0]=obj.tempInfahrenheit;
        expactedFAndK[1]=obj.tempInKalven;


        assertArrayEquals(expactedFAndK,obj.getTempIntoFAndK());



    }
}