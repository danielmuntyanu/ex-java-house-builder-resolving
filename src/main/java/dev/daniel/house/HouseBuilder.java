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


    @Override
    public IBuilder setArea(float area) {
        this.area = area;
        return this;
    }

    @Override
    public IBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public IBuilder setDesign(HouseDesign design) {
        this.design = design;
        return this;
    }

    @Override
    public IBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    @Override
    public IBuilder setGarage(Garage garage) {
        this.garage = garage;
        return this;
    }

    @Override
    public IBuilder setGarden(Garden garden) {
        this.garden = garden;
        return this;
    }

    @Override
    public IBuilder setStatues(int statues) {
        this.statues = statues;
        return this;
    }

    @Override
    public IBuilder setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }


    public House getResult() {
        return new House(floors, color, design, area, price, swimmingPool, garden, statues, garage);
    };

}
