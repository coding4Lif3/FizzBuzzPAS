import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays.*;

import static java.util.Arrays.asList;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz(asList(new WordRule(3,"Fizz"),
            new WordRule(5,"Buzz"), new DefaultRule()));

    @Test
    public void shouldReturnNumberWhenGenericNumber() {
        Assert.assertEquals("1", fizzBuzz.say(1));
        Assert.assertEquals("2", fizzBuzz.say(2));
    }

    @Test
    public void shouldReturnFizzWhenMultipleOfThree() {
        Assert.assertEquals("Fizz", fizzBuzz.say(3));
        Assert.assertEquals("Fizz", fizzBuzz.say(3*2));
    }

    @Test
    public void shouldReturnBuzzWhenMultipleOfFive() {
        Assert.assertEquals("Buzz", fizzBuzz.say(5));
        Assert.assertEquals("Buzz", fizzBuzz.say(5*2));
    }

    @Test
    public void shouldReturnFizzBuzzWhenMultipleOfThreeAndFive() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.say(3*5));
        Assert.assertEquals("FizzBuzz", fizzBuzz.say(3*5*2));
    }

}