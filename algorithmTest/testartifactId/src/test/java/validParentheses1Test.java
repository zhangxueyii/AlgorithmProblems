import org.junit.Test;

import static org.junit.Assert.*;

public class validParentheses1Test {

    @Test
    public void func_validInput_1() {
        assertTrue(validParentheses1.func("()"));
    }

    @Test
    public void func_validInput_2() {
        assertTrue(validParentheses1.func("[()]"));
    }

    @Test
    public void func_validInput_3() {
        assertTrue(validParentheses1.func("{[()]}"));
    }

    @Test
    public void func_validInput_4() {
        assertTrue(validParentheses1.func("([])"));
    }

    @Test
    public void func_validInput_5() {
        assertTrue(validParentheses1.func("({})"));
    }

    @Test
    public void func_validInput_6() {
        assertTrue(validParentheses1.func("[()]"));
    }

    @Test
    public void func_validInput_7() {
        assertTrue(validParentheses1.func("(())"));
    }

    @Test
    public void func_invalidInput_8() {
        assertFalse(validParentheses1.func(""));
    }

    @Test
    public void func_invalidInput_9() {
        assertFalse(validParentheses1.func(null));
    }

    @Test
    public void func_invalidInput_10() {
        assertFalse(validParentheses1.func("("));
    }

    @Test
    public void func_invalidInput_11() {
        assertFalse(validParentheses1.func(")"));
    }


    @Test
    public void func_invalidInput_12() {
        assertFalse(validParentheses1.func("{"));
    }


    @Test
    public void func_invalidInput_13() {
        assertFalse(validParentheses1.func("}"));
    }


    @Test
    public void func_invalidInput_14() {
        assertFalse(validParentheses1.func("["));
    }


    @Test
    public void func_invalidInput_15() {
        assertFalse(validParentheses1.func("]"));
    }


    @Test
    public void func_invalidInput_16() {
        assertFalse(validParentheses1.func("(()"));
    }


    @Test
    public void func_invalidInput_17() {
        assertFalse(validParentheses1.func("{{}"));
    }

    @Test
    public void func_invalidInput_18() {
        assertFalse(validParentheses1.func("[[]"));
    }

    @Test
    public void func_invalidInput_19() {
        assertFalse(validParentheses1.func("(}"));
    }

    @Test
    public void func_invalidInput_20() {
        assertFalse(validParentheses1.func("(]"));
    }

    @Test
    public void func_invalidInput_21() {
        assertFalse(validParentheses1.func("{)"));
    }

    @Test
    public void func_invalidInput_22() {
        assertFalse(validParentheses1.func("{]"));
    }

    @Test
    public void func_invalidInput_23() {
        assertFalse(validParentheses1.func("[)"));
    }

    @Test
    public void func_invalidInput_24() {
        assertFalse(validParentheses1.func("[}"));
    }

    @Test
    public void func_invalidInput_25() {
        assertFalse(validParentheses1.func("[]]"));
    }
}