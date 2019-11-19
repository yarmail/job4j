package ru.job4j.coffeemachine;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class CoffeeMachineTest {

    @Test
    public void changeMachineTest() {
        int money = 50;
        int price = 35;
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(10, 5));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        ArrayList<Integer> result = coffeeMachine.changeMachine(money, price);
        assertThat(result, is(answer));
    }

    @Test
    public void changeMachineTest2() {
        int money = 50;
        int price = 20;
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(10, 10, 10));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        ArrayList<Integer> result = coffeeMachine.changeMachine(money, price);
        assertThat(result, is(answer));
    }
}

