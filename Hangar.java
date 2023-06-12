public class Hangar{
    public static void main(String[] args) {
        Car Clio= new Car("Clio");
        Boat Titanic = new Boat("Titanic");

        System.out.println(Clio.doStuff());
        System.out.println(Titanic.doStuff());
    }
}