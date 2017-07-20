/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)
        System.out.println("subtraction test");
        rpnExpression = "4,2,-";
        expectedResult = 2.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        System.out.println("division test");
        rpnExpression = "6,2,/";
        expectedResult = 3.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);


        System.out.println("multiplication test");
        rpnExpression = "10,2,*";
        expectedResult = 20.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);


        // Uncomment this test which has many operators
        System.out.println("a bunch of test");
        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
