package Transportes;

public class Ship implements Transporte {
    private float size;
    private float capactiy;  
    
    public Ship(float size, float capactiy) {
        this.size = size;
        this.capactiy = capactiy;
    }
    
    @Override
    public void travelThroughPath() {
        System.out.println("Travelling to the destination by Ship!");
    } 

    @Override
    public void verifyType() {
        System.out.println("Ship Size: " + this.size);
        System.out.println("Ship Capacity: " + this.capactiy);
    }
}
