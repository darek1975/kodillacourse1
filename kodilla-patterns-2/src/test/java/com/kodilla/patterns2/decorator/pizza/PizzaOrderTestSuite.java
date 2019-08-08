package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testTomatoSauceCheeseHamMushroomsPizzaGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(24), calculatedCost);
        System.out.println("Ordered pizza price: " + calculatedCost);
    }
    @Test
    public void testTomatoSauceCheeseHamMushroomsPizzaGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Ordered pizza description:\n" +
                "  - tomato sauce\n" +
                "  - cheese\n" +
                "  - ham\n" +
                "  - mushrooms\n", description);
        System.out.println(description);
    }
    @Test
    public void testGarlicSauceDoubleCheeseHamMushroomsPizzaGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaGarlicSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(26), calculatedCost);
        System.out.println("Ordered pizza price: " + calculatedCost);
    }
    @Test
    public void testGarlicSauceDoubleCheeseHamMushroomsPizzaGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaGarlicSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Ordered pizza description:\n" +
                "  - garlic sauce\n" +
                "  - cheese\n" +
                "  - cheese\n" +
                "  - ham\n" +
                "  - mushrooms\n", description);
        System.out.println(description);
    }

}
