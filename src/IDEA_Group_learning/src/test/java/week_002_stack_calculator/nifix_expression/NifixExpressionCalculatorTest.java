package week_002_stack_calculator.nifix_expression;

import exception.StackEmptyException;
import junit.framework.Assert;
import org.junit.Test;

public class NifixExpressionCalculatorTest {

    @Test
    public void should_return_the_right_value_of_nifix_expression() throws StackEmptyException {
        String expression = "6 + 10 * 2";
        NifixExpressionCalculator nifixExpressionCalculator = new NifixExpressionCalculator();
        int result = nifixExpressionCalculator.calculate(expression);
        Assert.assertTrue(result == 26);
    }

    @Test
    public void should_return_the_right_value_of_nifix_expression_with_bracket() throws StackEmptyException {
        String expression = "( 2 + 3 ) * 6 + ( 3 - 2 )";
        NifixExpressionCalculator nifixExpressionCalculator = new NifixExpressionCalculator();
        int result = nifixExpressionCalculator.calculate(expression);
        Assert.assertTrue(result == 31);
    }

    @Test
    public void should_return_the_right_value_of_nifix_expression_with_more_bracket() throws StackEmptyException {
        String expression = "( 2 + 3 ) * 6 + ( ( 3 - 2 ) * 2 )";
        NifixExpressionCalculator nifixExpressionCalculator = new NifixExpressionCalculator();
        int result = nifixExpressionCalculator.calculate(expression);
        Assert.assertTrue(result == 32);
    }
}