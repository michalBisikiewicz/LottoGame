package lotto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import static lotto.InputNumbers.numberOfUserInputs;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InputNumbersTest {

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void shouldReturnLengthOfUserInput() {
        //given
        provideInput("6");
        //when
        String input = InputNumbers.getNumberOfInputs();
        //then
        Assertions.assertEquals(numberOfUserInputs, input);
    }

    @Test
    public void should_return_list_with_numbers_given_by_user() {
        //given

        //when
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        //then
        assertThat(actual).isEqualTo(expected);




    }
}
