package dev.daniel.director;

import java.math.BigDecimal;

import dev.daniel.enums.Garden;
import dev.daniel.enums.HouseDesign;
import dev.daniel.enums.SwimmingPool;
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
            .setPrice(
                new BigDecimal("750000.00")
            )
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
            .setPrice(
                new BigDecimal("400000.00")
            )
            .setGarage(
                new Garage(50F, 1, true)
            )
            .getResult();
        
        return houseWithGarage;
    }

    @Override
    public House constructHouseWithGarden(IBuilder builder) {
        House houseWithGarden = builder
            .setArea(700F)
            .setDesign(HouseDesign.GEORGIAN)
            .setFloors(2)
            .setColor("Brown")
            .setPrice(
                new BigDecimal("800000.00")
            )
            .setGarden(Garden.FULL)
            .getResult();
        
        return houseWithGarden;
    }

    @Override
    public House constructHouseWithSwimmingPool(IBuilder builder) {
        House houseWithSwimmingPool = builder
            .setArea(1200F)
            .setDesign(HouseDesign.SPANISH)
            .setFloors(3)
            .setColor("black")
            .setPrice(
                new BigDecimal("1000000.00")
            )
            .setSwimmingPool(SwimmingPool.BIG)
            .getResult();
        
        return houseWithSwimmingPool;
    }

}
