package Week_9;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static  org.junit.Assert.*;

public class RandomGenTest {
    @Test
    public void testGetRandomLowerCaseLetter() {
        char test_data = RandomGen.getRandomLowerCaseLetter();
        char test_data2 = RandomGen.getRandomLowerCaseLetter();

        System.out.println(test_data + " " + test_data2);
        // check value
        assertTrue(test_data >= 'a' & test_data <= 'z');
        assertTrue(test_data2 >= 'a' & test_data2 <= 'z');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char test_data = RandomGen.getRandomUpperCaseLetter();
        char test_data2 = RandomGen.getRandomUpperCaseLetter();

        System.out.println(test_data + " " + test_data2);
        // check value
        assertTrue(test_data >= 'A' & test_data <= 'Z');
        assertTrue(test_data2 >= 'A' & test_data2 <= 'Z');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomDigitCharacter() {
        char test_data = RandomGen.getRandomDigitCharacter();
        char test_data2 = RandomGen.getRandomDigitCharacter();

        // check value
        System.out.println(test_data + " " + test_data2);
        assertTrue(test_data >= '0' & test_data <= '9');
        assertTrue(test_data2 >= '0' & test_data2 <= '9');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomCharacter() {
        char[] test_data = {RandomGen.getRandomDigitCharacter(),
                RandomGen.getRandomDigitCharacter()};

        System.out.println(test_data);
        // check value
        for (char test: test_data) {
            boolean condition1 = (test >= '0' & test <= '9');
            boolean condition2 = (test >= 'A' & test <= 'Z');
            boolean condition3 = (test >= 'a' & test <= 'z');
            assertTrue((condition1 || condition2 || condition3));
        }

        // check random
        assertNotEquals(test_data[0], test_data[1]);
    }

    @Test
    public void testIsPrime(){
        char test = RandomGen.getRandomDigitCharacter();
        int testData = Character.digit(test, 10);
        boolean isPrime = true;
        System.out.println(testData);
        for (int i = 2; i <= testData/2; i++){
                if (i == 0)
                {
                    isPrime = false;
                }
                else if (testData % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        assertTrue(isPrime);
        }


    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(RandomGenTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
