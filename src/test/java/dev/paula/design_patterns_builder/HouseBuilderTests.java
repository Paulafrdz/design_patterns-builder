package dev.paula.design_patterns_builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HouseBuilderTests {

    private HouseBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new HouseBuilder();
        builder.reset();
    }

    @Test
    void testHasPool() {
        HouseEntity house = builder.hasPool().build();
        assertTrue(house.hasPool());
    }

    @Test
    void testHasGarage() {
        HouseEntity house = builder.hasGarage().build();
        assertTrue(house.hasGarage());
    }

    @Test
    void testReset() {
        builder.hasPool().build();
        builder.reset();
        HouseEntity house = builder.build();
        assertNull(house.hasPool());
        assertNull(house.hasGarage());
    }
}


