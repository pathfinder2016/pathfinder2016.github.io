package week_002_stack_calculator;

import junit.framework.Assert;
import org.junit.Test;

public class PostfixExpressionCalculatorTest {

    @Test
    public void should_return_right_value_of_the_postfix_expression(){
        String expression = "2 1 + 3 *";
        PostfixExpressionCalculator calculator = new PostfixExpressionCalculator(expression);
        Assert.assertTrue(calculator.calculator() == 9);
    }

}
