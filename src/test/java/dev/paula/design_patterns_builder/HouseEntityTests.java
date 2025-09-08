package dev.paula.design_patterns_builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HouseEntityTests {

    @Test
    void testSettersAndGetters() {
        HouseEntity house = new HouseEntity();
        house.setHasPool(true);
        house.setHasGarage(true);
        house.setHasGarden(false);
        house.setHasStatues(false);

        assertTrue(house.hasPool());
        assertTrue(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasStatues());
    }

    @Test
    void testToString() {
        HouseEntity house = new HouseEntity();
        house.setHasPool(true);
        house.setHasGarage(false);
        String expected = "HouseEntity [pool=true, garden=null, garage=false, statues=null]";
        assertEquals(expected, house.toString());
    }
}
