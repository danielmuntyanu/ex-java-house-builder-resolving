package dev.daniel.house;

import dev.daniel.enums.Garden;
import dev.daniel.enums.HouseDesign;
import dev.daniel.enums.SwimmingPool;
import dev.daniel.garage.Garage;

public class HouseBuilder implements IBuilder {

    private int floors;
    private String color;
    private HouseDesign design;
    private float area;
    private float price;

    private SwimmingPool swimmingPool;
    private Garden garden;
    private int statues;
    private Garage garage;

    public House getResult() {
        return new House(floors, color, design, area, price, swimmingPool, garden, statues, garage);
    };

}
