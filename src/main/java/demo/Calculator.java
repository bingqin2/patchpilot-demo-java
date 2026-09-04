package demo;

/**
 * A tiny calculator used as the target repository for PatchPilot demos.
 */
public class Calculator {

    public int add(int left, int right) {
        return left + right;
    }

    public int subtract(int left, int right) {
        return left - right;
    }

    public int multiply(int left, int right) {
        return left * right;
    }

    public int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
