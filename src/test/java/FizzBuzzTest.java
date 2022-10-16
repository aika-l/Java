import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive Happy path
    // if (start <= end)  ==>> return arr
    // start < end
    @Test
    public void testStartLessThanEnd_HappyPath(){
        //AAA (arrange, actual, assert)
        //Arrange
        int start = 1;
        int end = 20;
        String[] expRes = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //Act

      //  FizzBuzz fb = new FizzBuzz();
        String[] actResult = new FizzBuzz().fizzBuzz(start, end);

        // Assert
        Assert.assertEquals(actResult, expRes);
    }


     // start == end
     @Test
     public void testStartEqualsEnd_HappyPath(){
         //AAA (arrange, actual, assert)
         //Arrange
         int start = 1;
         int end = 1;
         String[] expRes = {"1"};

         //Act

         //  FizzBuzz fb = new FizzBuzz();
         String[] actResult = new FizzBuzz().fizzBuzz(start, end);

         // Assert
         Assert.assertEquals(actResult, expRes);
     }


    @Ignore
    @Test
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath(){
        //AAA (arrange, actual, assert)
        //Arrange
        int start = -20;
        int end = -1;
        String[] expRes = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //Act

        //  FizzBuzz fb = new FizzBuzz();
        String[] actResult = new FizzBuzz().fizzBuzz(start, end);

        // Assert
        Assert.assertEquals(actResult, expRes);
    }
    //2. Negative test
    // if (start > end)  ==>> return arr[0];
    @Test
    public void testStartGreaterEnd_Negative(){
        //AAA (arrange, actual, assert)
        //Arrange
        int start = 20;
        int end = 1;
        String[] expRes = {};

        //Act

        //  FizzBuzz fb = new FizzBuzz();
        String[] actResult = new FizzBuzz().fizzBuzz(start, end);

        // Assert
        Assert.assertEquals(actResult, expRes);
    }
}
