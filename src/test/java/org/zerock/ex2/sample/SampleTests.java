package org.zerock.ex2.sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SampleTests {

    private Restaurant restaurant;

    @Test
    public void test() {
        restaurant = new Restaurant();
        System.out.println("================");
        System.out.println(restaurant);
        restaurant.test();
        System.out.println("================");
    }
}