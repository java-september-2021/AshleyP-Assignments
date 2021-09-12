public class Bat extends Mammal {

    public Bat(){
        super(300);
    }

    public void fly() {
        System.out.println("Whoosh");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Well, never mind");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Wee-ooo Wee-ooo");
        energyLevel -= 100;
    }
}