package dev.daniel.house;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import dev.daniel.enums.Garden;
import dev.daniel.enums.HouseDesign;
import dev.daniel.enums.SwimmingPool;
import dev.daniel.garage.Garage;


public class HouseTest {

    @Test
    void testHouse_ShouldCreateEntity() {
        
        Garage garage = new Garage(100F, 2, true);
        
        House house = new House(
            1, 
            "Green", 
            HouseDesign.RANCH, 
            1000F, 
            new BigDecimal("500000.00"), 
            SwimmingPool.SMALL, 
            Garden.FLOWERS, 
            2, 
            garage
        );

        assertThat(house, is(instanceOf(House.class)));
        assertThat(house.getArea(), is(equalTo(1000F)));
        assertThat(house.getDesign(), is(equalTo(HouseDesign.RANCH)));
        assertThat(house.getFloors(), is(equalTo(1)));
        assertThat(house.getColor(), is(equalTo("Green")));
        assertThat(house.getPrice(), is(equalTo(new BigDecimal("500000.00"))));
        assertThat(house.getGarden(), is(equalTo(Garden.FLOWERS)));
        assertThat(house.getSwimmingPool(), is(equalTo(SwimmingPool.SMALL)));
        assertThat(house.getStatues(), is(equalTo(2)));
        assertThat(house.getGarage(), is(equalTo(garage)));

    }

}
