package problems.easy.validparentheses;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ValidParenthesesTest {
    private ValidParentheses createValidParentheses() {
        return new ValidParentheses2();
    }

    @Test
    @Deprecated
    public void OneTypeParenthesesTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "()";
        boolean expected = true;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }

    @Test
    @Deprecated
    public void TwoTypesParenthesesTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "[()]";
        boolean expected = true;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }

    @Test
    @Deprecated
    public void failTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "(]";
        boolean expected = false;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }

    @Test
    @Deprecated
    public void partnerNextTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "(){}[]";
        boolean expected = true;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }

    @Test
    @Deprecated
    public void partnerNextFailTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "(){}}{";
        boolean expected = false;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }


    @Test
    @Deprecated
    public void complicatedTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "(([]){})";
        boolean expected = true;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }

    @Test
    @Deprecated
    public void oneStringTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "(";
        boolean expected = false;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }

    @Test
    @Deprecated
    public void twoSameStringTest() {
        ValidParentheses validParentheses = createValidParentheses();
        String input = "((";
        boolean expected = false;
        boolean actual = validParentheses.isValid(input);
        assertThat(expected, is(actual));
    }
}