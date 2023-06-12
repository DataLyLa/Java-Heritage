public class Car extends Vehicule{
    
    public Car(String brand){
        super(brand);
    }

    
    public String doStuff() {
       return "Je suis " + getBrand() + " et je fais vroom vroom!";
    }
}
