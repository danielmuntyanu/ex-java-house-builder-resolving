package dev.daniel.director;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

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

}
