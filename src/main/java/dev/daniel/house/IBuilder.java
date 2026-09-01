package dev.daniel.house;

import java.math.BigDecimal;

import dev.daniel.enums.Garden;
import dev.daniel.enums.HouseDesign;
import dev.daniel.enums.SwimmingPool;
import dev.daniel.garage.Garage;

public interface IBuilder {

    IBuilder setPrice(BigDecimal price);
    IBuilder setFloors(int floors);
    IBuilder setColor(String color);
    IBuilder setDesign(HouseDesign design);
    IBuilder setArea(float area);
    IBuilder setSwimmingPool(SwimmingPool swimmingPool);
    IBuilder setGarden(Garden garden);
    IBuilder setStatues(int statues);
    IBuilder setGarage(Garage garage);
    
    House getResult();

}
