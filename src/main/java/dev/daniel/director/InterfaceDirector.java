package dev.daniel.director;

import dev.daniel.house.House;
import dev.daniel.house.IBuilder;

public interface InterfaceDirector {

    House constructHouseWithGarage(IBuilder builder);

    House constructHouseWithFancyStatues(IBuilder builder);

    House constructHouseWithSwimmingPool(IBuilder builder);
    
    House constructHouseWithGarden(IBuilder builder);

}
