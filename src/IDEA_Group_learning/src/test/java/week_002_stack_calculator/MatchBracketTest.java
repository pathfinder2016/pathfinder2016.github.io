package week_002_stack_calculator;

import data_structure.Stack;
import exception.StackEmptyException;
import org.junit.Assert;
import org.junit.Test;

public class MatchBracketTest {

    @Test
    public void calculate() throws Exception {
        String expression = "(({{}}))";
        Stack stack = new Stack(expression.length());
        MatchBracket matchBracket = new MatchBracket(stack);
        Assert.assertTrue(matchBracket.isMatchBracket(expression));

        expression = "((";
        stack = new Stack(expression.length());
        matchBracket = new MatchBracket(stack);
        Assert.assertTrue(matchBracket.isMatchBracket(expression));
    }

    @Test(expected = StackEmptyException.class)
    public void should_throw_exception_when_stack_empty() throws Exception {
        String expression = "(()))"; //Actuall couldn't not match correctly.
        Stack stack = new Stack(expression.length());
        MatchBracket matchBracket = new MatchBracket(stack);
        matchBracket.isMatchBracket(expression);
    }

}