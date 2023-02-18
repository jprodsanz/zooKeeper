package zookeeper;

public class Gorilla extends Mammal {
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }
    public void throwSomething(String item) {
        System.out.printf("throwing %s\n", item);
    }
    public void eatBananas() {
        System.out.println("Are you hungry? Eat a banana!");
        energyLevel +=10;
    }
    public void climb() {
        System.out.println("Got energy? Climb now!");
        energyLevel -=10;
    }
}
