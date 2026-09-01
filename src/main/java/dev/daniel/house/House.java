package dev.daniel.house;

import dev.daniel.enums.Garden;
import dev.daniel.enums.HouseDesign;
import dev.daniel.enums.SwimmingPool;

public class House {

    private int floors;
    private String color;
    private HouseDesign design;
    private float area;
    private float price;

    private SwimmingPool swimmingPool;
    private Garden garden;
    private int statues;
    private boolean garage;


    public House(int floors, String color, HouseDesign design, float area, float price) {
        this.floors = floors;
        this.color = color;
        this.design = design;
        this.area = area;
        this.price = price;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }


    public void setGarden(Garden garden) {
        this.garden = garden;
    }


    public void setStatues(int statues) {
        this.statues = statues;
    }


    public void setGarage(boolean garage) {
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

    public float getPrice() {
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

    public boolean isGarage() {
        return garage;
    }

    

}
