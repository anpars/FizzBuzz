package anpars.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzMainTestShould {

    @Test
    @Parameters({"45", "30", "15"})
    public void fizzBuzz_on_a(String multiple_of_3_and_5) {
        assertThat(FizzBuzzMain.doFizzBuzz(multiple_of_3_and_5)).isEqualTo(FizzBuzzMain.FIZZ_BUZZ);
    }

    @Test
    @Parameters({"3", "6", "9"})
    public void fizz_on_a(String multiple_of_3) {
        assertThat(FizzBuzzMain.doFizzBuzz(multiple_of_3)).isEqualTo(FizzBuzzMain.FIZZ);
    }

    @Test
    @Parameters({"25", "5", "10"})
    public void buzz_on_a(String multiple_of_5) {
        assertThat(FizzBuzzMain.doFizzBuzz(multiple_of_5)).isEqualTo(FizzBuzzMain.BUZZ);
    }

    @Test
    @Parameters({"26", "7", "22"})
    public void String_on_a(String none_multiple_of_3_or_5) {
        assertThat(FizzBuzzMain.doFizzBuzz(none_multiple_of_3_or_5)).isEqualTo(FizzBuzzMain.YOU_FAILED_TO_FIND_A_MULTIPLE_OF_3_OR_5);
    }
}
