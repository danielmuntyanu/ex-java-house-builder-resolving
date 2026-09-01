package dev.daniel.director;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import dev.daniel.enums.Garden;
import dev.daniel.enums.SwimmingPool;
import dev.daniel.garage.Garage;
import dev.daniel.house.House;
import dev.daniel.house.HouseBuilder;
import dev.daniel.house.IBuilder;

public class DirectorTest {

    @Test
    void testDirector_ShouldCreateHouseWithGarage() {
        Director director = new Director();
        IBuilder builder = new HouseBuilder();

        House houseWithGarage = director.constructHouseWithGarage(builder);

        assertThat(houseWithGarage, is(instanceOf(House.class)));
        assertThat(houseWithGarage.getGarage(), is(instanceOf(Garage.class)));
        assertThat(houseWithGarage.getSwimmingPool(), is(nullValue()));
        assertThat(houseWithGarage.getGarden(), is(nullValue()));
        assertThat(houseWithGarage.getStatues(), is(equalTo(0)));
    }

    @Test
    void testDirector_ShouldCreateHouseWithSwimmingPool() {
        Director director = new Director();
        IBuilder builder = new HouseBuilder();

        House houseWithSwimmingPool = director.constructHouseWithSwimmingPool(builder);

        assertThat(houseWithSwimmingPool, is(instanceOf(House.class)));
        assertThat(houseWithSwimmingPool.getSwimmingPool(), is(instanceOf(SwimmingPool.class)));
        assertThat(houseWithSwimmingPool.getGarage(), is(nullValue()));
        assertThat(houseWithSwimmingPool.getGarden(), is(nullValue()));
        assertThat(houseWithSwimmingPool.getStatues(), is(equalTo(0)));
    }

    @Test
    void testDirector_ShouldCreateHouseWithGarden() {
        Director director = new Director();
        IBuilder builder = new HouseBuilder();

        House houseWithSGarden = director.constructHouseWithGarden(builder);

        assertThat(houseWithSGarden, is(instanceOf(House.class)));
        assertThat(houseWithSGarden.getGarden(), is(instanceOf(Garden.class)));
        assertThat(houseWithSGarden.getGarage(), is(nullValue()));
        assertThat(houseWithSGarden.getSwimmingPool(), is(nullValue()));
        assertThat(houseWithSGarden.getStatues(), is(equalTo(0)));
    }

    

}
