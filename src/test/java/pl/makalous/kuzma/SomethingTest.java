package pl.makalous.kuzma;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// The Calculator class
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

// The CalculatorService class that uses Calculator
class CalculatorService {
    private Calculator calculator;

    CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    int performAddition(int a, int b) {
        return calculator.add(a, b);
    }
}

public class SomethingTest {
    @Test
    void testPerformAddition() {
        // Create a mock Calculator object
        Calculator calculatorMock = Mockito.mock(Calculator.class);
        //Calculator calculatorMock = new Calculator();
        // Define the behavior of the mock object
        when(calculatorMock.add(2, 3)).thenReturn(5);
        // Create an instance of CalculatorService with the mock
        CalculatorService calculatorService = new CalculatorService(calculatorMock);
        // Perform the test using the mock
        int result = calculatorService.performAddition(2, 3);
        // Verify that the expected method was called with the expected arguments
        verify(calculatorMock).add(2, 3);
        // Verify that the result matches the expected value
        assertEquals(5, result);
    }
}
