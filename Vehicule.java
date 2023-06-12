public abstract class Vehicule {

    private String brand;
    private int kilometers;

    public Vehicule(String brand){
        this.brand=brand;
        this.kilometers=0;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getKm(){
        return this.kilometers;
    }

    public void setKm(int km){
        this.kilometers=km;

    }

    

}
