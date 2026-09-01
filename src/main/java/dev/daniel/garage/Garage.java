package dev.daniel.garage;

public class Garage {

    private float area;
    private int spaces;
    private boolean passageIntoHouse;

    public Garage(float area, int spaces, boolean passageIntoHouse) {
        this.area = area;
        this.spaces = spaces;
        this.passageIntoHouse = passageIntoHouse;
    }

    public float getArea() {
        return area;
    }

    public int getSpaces() {
        return spaces;
    }

    public boolean isPassageIntoHouse() {
        return passageIntoHouse;
    }
    
    
    
}
