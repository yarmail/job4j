package ru.job4j.exeptionpassword;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void whenIsValid() {
        String password = "#aLOVbj31~";
        String result = PasswordValidator.validate(password);
        String expected = PasswordValidator.message;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenIsNull() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(null));
    }

    @Test
    public void whenLengthShort() {
        String password = "aLOVbj~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage(PasswordValidator.message);
    }

    @Test
    public void whenWithoutUpperChar() {
        String password = "#alowbj31~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage(PasswordValidator.message);
    }

    @Test
    public void whenWithoutLowerChar() {
        String password = "#ALOWBJ31~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage(PasswordValidator.message);
    }

    @Test
    public void whenWithoutNums() {
        String password = "#aLOVbj~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage(PasswordValidator.message);
    }

    @Test
    public void whenWithoutSpecChars() {
        String password = "fdaLowj31";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage(PasswordValidator.message);
    }

    @Test
    public void whenContainsStopWord() {
        String password = "#ALOWQwErtYBJ31~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage(PasswordValidator.message);
    }
}