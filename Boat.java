public class Boat extends Vehicule{
    
    public Boat(String brand){
        super(brand);
    }

    
    public String doStuff() {
       return "Je suis " + getBrand() + "et je fais glou glou!";
    }
}
