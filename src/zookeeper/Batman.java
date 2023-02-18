package zookeeper;

public class Batman extends Mammal{
    private int energyLevel = 300;
    public Batman () {
            super();
    }
    public void fly() {
        if
        (this.energyLevel<50) {
            System.out.println("Mr. Wayne, your energy is low, please rest");
        }
        else {
            energyLevel -= 50;
            System.out.println("It's not who you are underneath but what you do that defines you... Flying high!");
        }
    }
    public void eatHumans() {
        energyLevel += 25;
        System.out.println("Then why do you want to kill me");
    }

    public void saveGotham() {
        if
        (this.energyLevel<100) {
            System.out.println("I am whatever Gotham needs me to be..");
        }
        else {
            energyLevel -= 100;
            System.out.println("He's the hero Gotham deserves, not the one it needs right now.");
        }
    }
}
