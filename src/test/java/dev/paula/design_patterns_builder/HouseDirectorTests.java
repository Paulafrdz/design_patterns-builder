package dev.paula.design_patterns_builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HouseDirectorTests {


    private IBuilder builder;
    private HouseDirector director;

    @BeforeEach
    void setUp() {
        builder = new HouseBuilder();
        director = new HouseDirector(builder);
    }

    @Test
    void testConstructSimpleHouse() {
        HouseEntity house = director.constructSimpleHouse();
        assertTrue(house.hasGarage());
        assertNull(house.hasPool());
        assertNull(house.hasGarden());
        assertNull(house.hasStatues());
    }

    @Test
    void testConstructSummerHouse() {
        HouseEntity house = director.constructSummerHouse();
        assertTrue(house.hasPool());
        assertNull(house.hasGarage());
        assertNull(house.hasGarden());
        assertNull(house.hasStatues());
    }

    @Test
    void testConstructRusticHouse() {
        HouseEntity house = director.constructRusticHouse();
        assertTrue(house.hasGarden());
        assertNull(house.hasPool());
        assertNull(house.hasGarage());
        assertNull(house.hasStatues());
    }

    @Test
    void testConstructFancyHouse() {
        HouseEntity house = director.constructFancyHouse();
        assertTrue(house.hasStatues());
        assertNull(house.hasPool());
        assertNull(house.hasGarage());
        assertNull(house.hasGarden());
    }
}


