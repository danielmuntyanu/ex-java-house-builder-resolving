package dev.daniel.director;

import dev.daniel.enums.HouseDesign;
import dev.daniel.garage.Garage;
import dev.daniel.house.House;
import dev.daniel.house.IBuilder;

public class Director implements InterfaceDirector {

    @Override
    public House constructHouseWithFancyStatues(IBuilder builder) {
        House houseWithFancyStatues = builder
            .setDesign(HouseDesign.TUDOR)
            .setArea(500F)
            .setFloors(2)
            .setColor("White")
            .setPrice(750000F)
            .setStatues(4)
            .getResult();
        
        return houseWithFancyStatues;
    }

    @Override
    public House constructHouseWithGarage(IBuilder builder) {
        House houseWithGarage = builder
            .setDesign(HouseDesign.MODERN)
            .setArea(300F)
            .setFloors(1)
            .setColor("Gray")
            .setPrice(400000F)
            .setGarage(
                new Garage(50F, 1, true)
            )
            .getResult();
        
        return houseWithGarage;
    }

    @Override
    public House constructHouseWithGarden(IBuilder builder) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public House constructHouseWithSwimmingPool(IBuilder builder) {
        // TODO Auto-generated method stub
        return null;
    }

}
