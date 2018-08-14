import org.junit.Test;

import static org.junit.Assert.*;

public class validParentheses2Test {

    @Test
    public void func_validInput_1() {
        assertTrue(validParentheses2.func("()"));
    }

    @Test
    public void func_validInput_2() {
        assertTrue(validParentheses2.func("[()]"));
    }

    @Test
    public void func_validInput_3() {
        assertTrue(validParentheses2.func("{[()]}"));
    }

    @Test
    public void func_validInput_4() {
        assertTrue(validParentheses2.func("([])"));
    }

    @Test
    public void func_validInput_5() {
        assertTrue(validParentheses2.func("({})"));
    }

    @Test
    public void func_validInput_6() {
        assertTrue(validParentheses2.func("[()]"));
    }

    @Test
    public void func_validInput_7() {
        assertTrue(validParentheses2.func("(())"));
    }

    @Test
    public void func_invalidInput_8() {
        assertFalse(validParentheses2.func(""));
    }

    @Test
    public void func_invalidInput_9() {
        assertFalse(validParentheses2.func(null));
    }

    @Test
    public void func_invalidInput_10() {
        assertFalse(validParentheses2.func("("));
    }

    @Test
    public void func_invalidInput_11() {
        assertFalse(validParentheses2.func(")"));
    }


    @Test
    public void func_invalidInput_12() {
        assertFalse(validParentheses2.func("{"));
    }


    @Test
    public void func_invalidInput_13() {
        assertFalse(validParentheses2.func("}"));
    }


    @Test
    public void func_invalidInput_14() {
        assertFalse(validParentheses2.func("["));
    }


    @Test
    public void func_invalidInput_15() {
        assertFalse(validParentheses2.func("]"));
    }


    @Test
    public void func_invalidInput_16() {
        assertFalse(validParentheses2.func("(()"));
    }


    @Test
    public void func_invalidInput_17() {
        assertFalse(validParentheses2.func("{{}"));
    }

    @Test
    public void func_invalidInput_18() {
        assertFalse(validParentheses2.func("[[]"));
    }

    @Test
    public void func_invalidInput_19() {
        assertFalse(validParentheses2.func("(}"));
    }

    @Test
    public void func_invalidInput_20() {
        assertFalse(validParentheses2.func("(]"));
    }

    @Test
    public void func_invalidInput_21() {
        assertFalse(validParentheses2.func("{)"));
    }

    @Test
    public void func_invalidInput_22() {
        assertFalse(validParentheses2.func("{]"));
    }

    @Test
    public void func_invalidInput_23() {
        assertFalse(validParentheses2.func("[)"));
    }

    @Test
    public void func_invalidInput_24() {
        assertFalse(validParentheses2.func("[}"));
    }

    @Test
    public void func_invalidInput_25() {
        assertFalse(validParentheses2.func("[]]"));
    }
}