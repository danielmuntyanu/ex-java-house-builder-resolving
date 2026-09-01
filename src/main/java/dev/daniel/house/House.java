package dev.daniel.house;

import java.math.BigDecimal;

import dev.daniel.enums.Garden;
import dev.daniel.enums.HouseDesign;
import dev.daniel.enums.SwimmingPool;
import dev.daniel.garage.Garage;

public class House {

    private int floors;
    private String color;
    private HouseDesign design;
    private float area;
    private BigDecimal price;

    private SwimmingPool swimmingPool;
    private Garden garden;
    private int statues;
    private Garage garage;
    
    public House(int floors, String color, HouseDesign design, float area, BigDecimal price, SwimmingPool swimmingPool,
            Garden garden, int statues, Garage garage) {
        this.floors = floors;
        this.color = color;
        this.design = design;
        this.area = area;
        this.price = price;
        this.swimmingPool = swimmingPool;
        this.garden = garden;
        this.statues = statues;
        this.garage = garage;
    }

    public int getFloors() {
        return floors;
    }

    public String getColor() {
        return color;
    }

    public HouseDesign getDesign() {
        return design;
    }

    public float getArea() {
        return area;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public Garden getGarden() {
        return garden;
    }

    public int getStatues() {
        return statues;
    }

    public Garage getGarage() {
        return garage;
    }

}
