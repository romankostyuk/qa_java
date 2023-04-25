package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private final String sex;
    private final boolean hasMane;
    public LionHasManeTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters(name = "Пол - {0}. Есть ли грива? {1}")
    public static Object[][] getLionTestData(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        boolean actualResult = lion.doesHaveMane();
        boolean expectedResult = hasMane;
        assertEquals(expectedResult, actualResult);
    }
}
