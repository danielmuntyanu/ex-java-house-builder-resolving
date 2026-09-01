package dev.daniel.house;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import dev.daniel.enums.Garden;
import dev.daniel.enums.HouseDesign;
import dev.daniel.enums.SwimmingPool;
import dev.daniel.garage.Garage;


public class HouseBuilderTest {

    @Test
    void testHouseBuilder_ShouldBuildHouseCorrectly() {

        IBuilder builder = new HouseBuilder();
        
        Garage garage = new Garage(50, 1, true);
        House house = builder
            .setArea(400F)
            .setColor("")
            .setDesign(HouseDesign.TUDOR)
            .setFloors(2)
            .setGarage(garage)
            .setStatues(4)
            .setGarden(Garden.TREES)
            .setSwimmingPool(SwimmingPool.MEDIUM)
            .getResult();

        assertThat(builder, is(instanceOf(HouseBuilder.class)));
        assertThat(house, is(instanceOf(House.class)));
        assertThat(house.getGarage(), is(equalTo(garage)));
        assertThat(house.getGarden(), is(equalTo(Garden.TREES)));
        assertThat(house.getPrice(), is(nullValue()));

    }


}
