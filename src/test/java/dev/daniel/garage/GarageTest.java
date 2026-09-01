package dev.daniel.garage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;


public class GarageTest {

    @Test
    void testGarage_ShouldCreateEntity() {

        Garage garage = new Garage(50F, 1, false);

        assertThat(garage, is(instanceOf(Garage.class)));
        assertThat(garage.getArea(), is(equalTo(50F)));
        assertThat(garage.getSpaces(), is(equalTo(1)));
        assertThat(garage.isPassageIntoHouse(), is(equalTo(false)));

    }
}
