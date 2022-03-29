package Week_9;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Random;

public class RandomGen {

    public static char getRandomLowerCaseLetter() {
        Random rand = new Random();
        int randInt = rand.nextInt(97, 123);
        return (char)randInt;
    }

    public static char getRandomUpperCaseLetter() {
        Random rand = new Random();
        int randInt = rand.nextInt(65, 91);
        return (char)randInt;
    }

    public static char getRandomDigitCharacter() {
        Random rand = new Random();
        int randInt = rand.nextInt(48, 58);
        return (char)randInt;
    }

    public static char getRandomCharacter() {
        Random rand = new Random();
        int randInt = rand.nextInt(1, 4);
        switch (randInt) {
            case 1 :
                return getRandomDigitCharacter();

            case 2 :
                return getRandomLowerCaseLetter();

            case 3 :
                return getRandomUpperCaseLetter();

            default:
                return 'a';
        }

    }

    public static void main(String[] args)
    {
        int i, j;
        char [] DigitCharacter = new char[15];
        char [] RandomeCharacter = new char[15];
        char [] RandomLower = new char[15];
        char [] RandomUpper = new char[15];
        for (i=0; i<=4; ++i)
        {
            for (j=0;j < 15; ++j)
            {
                if (i == 0){
                    DigitCharacter[j] = getRandomDigitCharacter();
                }
                if (i == 1){
                    RandomeCharacter[j] = getRandomCharacter();
                }
                if (i == 2){
                    RandomLower[j] = getRandomLowerCaseLetter();
                }
                else
                {
                    RandomUpper[j] = getRandomUpperCaseLetter();
                }
            }
        }
        System.out.println(DigitCharacter);
        System.out.println(RandomeCharacter);
        System.out.println(RandomLower);
        System.out.println(RandomUpper);
    }
}
