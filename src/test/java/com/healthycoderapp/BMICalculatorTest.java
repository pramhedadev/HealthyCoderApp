package com.healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {

    @Test
    void should_ReturnTrue_When_DietRecommended() {
        //given
        double weight = 89.0;
        double height = 1.65;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight, height);

        //then
        assertTrue(recommended);
    }

    @Test
    void should_ReturnFalse_When_DietNotRecommended() {
        //given
        double weight = 50;
        double height = 1.95;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight, height);

        //then
        assertFalse(recommended);
    }

// test if throws exception

    @Test
    void should_ThrowArithmeticException_When_HeightIsZero() {
        //given
        double weight = 50;
        double height = 0.0;

        Executable executable = () -> BMICalculator.isDietRecommended(weight, height);
        assertThrows(ArithmeticException.class, executable);
    }

    @Test
    void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty() {
        // given
        List<Coder> coder = new ArrayList<>();
        coder.add(new Coder(1.80, 60.0));
        coder.add(new Coder(1.82, 98.0));
        coder.add(new Coder(1.80, 64.7));

        //when
        Coder coderWorstBMI = BMICalculatorTest.findCoerWithWorstBMI(coder);

        //then
        asserAll(
                () -> assertEquals(1.82, coderWorstBMI.getHeight), // comparing the height
                () -> assertEquals(98.0, coderWorstBMI.getWeight)
        )
    }

    @Test
    void should_ReturnNullCoderWithWorstBMI_When_CoderListIsEmpty() {
        // given
        List<Coder> coder = new ArrayList<>();
        coder.add(new coder(1.80, 60.0));
        coder.add(new coder(1.82, 98.0));
        coder.add(new coder(1.80, 64.7));

        double[] expectedValue = {18.52, 29.59, 19.53}
        //when
        double[] bmiScores = BMICalculator.getBMIScores(coder);

        //then
    assertArrayEquals(expectedValue, bmiScores);
    }
}
