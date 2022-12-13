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
}
