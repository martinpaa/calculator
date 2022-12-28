package src.test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static src.main.java.Calculation.calculate;

public class CalculationTest {
    @Test
    @DisplayName("Addition operation successfully done")
    void calculation_addition_success() {
        //Act
        double result= calculate(1,2,"addition");
        //Assert
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Subtraction operation successfully done")
    void calculation_subtraction_success() {
        //Act
        double result= calculate(10,2,"subtraction");
        //Assert
        Assertions.assertEquals(8,result);
    }

    @Test
    @DisplayName("Multiplication operation successfully done")
    void calculation_multiplication_success() {
        //Act
        double result= calculate(10,2,"multiplication");
        //Assert
        Assertions.assertEquals(20,result);
    }

    @Test
    @DisplayName("Division operation successfully done")
    void calculation_division_success() {
        //Act
        double result= calculate(10,4,"division");
        //Assert
        Assertions.assertEquals(2.5,result);
    }

    @Test
    @DisplayName("Invalid operator throws an exception")
    void invalid_operator_throws_exception() {
        //Act & Assert
        Assertions.assertThrows(IllegalStateException.class,() -> calculate(1,2,"s"));
    }
}

