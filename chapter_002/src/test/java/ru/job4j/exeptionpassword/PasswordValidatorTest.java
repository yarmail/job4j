package ru.job4j.exeptionpassword;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void whenIsValid() {
        String password = "#aLOVbj31~";
        String result = PasswordValidator.validate(password);
        String expected = "Password is valid";
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
                .withMessage("Длина пароля должна находится в диапазоне [8, 32]");
    }

    @Test
    public void whenWithoutUpperCaseChar() {
        String password = "#alowbj31~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage("Пароль должен содержать хотя бы один символ в верхнем регистре");
    }

    @Test
    public void whenWithoutLowerCaseChar() {
        String password = "#ALOWBJ31~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage("Пароль должен содержать хотя бы один символ в нижнем регистре");
    }

    @Test
    public void whenWithoutNums() {
        String password = "#aLOVbj~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage("Пароль должен содержать хотя бы одну цифру");
    }

    @Test
    public void whenWithoutSpecChars() {
        String password = "fdaLowj31";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage("Пароль должен содержать хотя бы один спец. символ (не цифра и не буква)");
    }

    @Test
    public void whenContainsInvalidWord() {
        String password = "#ALOWQwErtYBJ31~";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> PasswordValidator.validate(password))
                .withMessage("Пароль не должен содержать некоторые слова");
    }
}