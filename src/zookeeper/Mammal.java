package zookeeper;

public class Mammal {
    int energyLevel = 100;

    public Mammal() {

    }
    public Mammal(int energy) {
        this.energyLevel = energy;
    }
    public int getEnergy() {
        return energyLevel;
    }
    public int displayEnergy() {
        System.out.printf("Your energy level is: %s\n", this.energyLevel);
        return energyLevel;
    }
}
