package com.healthycoderapp;

import org.junit.jupiter.api.Test;

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
}
