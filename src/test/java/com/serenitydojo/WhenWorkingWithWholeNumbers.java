package com.serenitydojo;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether(){
                int initialYear = 1985;
        int targetYear;
        int timeJump = 30;


        targetYear = initialYear + timeJump;

       assertThat(targetYear, equalTo(2015));



    }
    @Test
    public void WeightConvertertoKg(){
        float Kg = 25.5F;
        float Pound;
        Pound = Kg * 2.204F;

        System.out.println("weight in Pounds =" + Pound);


    }
}
