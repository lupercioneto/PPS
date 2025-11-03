package Transportes;

public class Truck implements Transporte {
    
    private float size;
    private float capactiy;  
    
    public Truck(float size, float capactiy) {
        this.size = size;
        this.capactiy = capactiy;
    }

    @Override
    public void travelThroughPath() {
        System.out.println("Travelling to the destination by Trukck!");
    }
    
    @Override
    public void verifyType() {
        System.out.println("Ship Size: " + this.size);
        System.out.println("Ship Capacity: " + this.capactiy);
    }
}
