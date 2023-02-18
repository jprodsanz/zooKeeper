package zookeeper;
public class MammalTest {
    public static void main(String[] args) {
        Batman darkKnight = new Batman();
            darkKnight.displayEnergy();
            darkKnight.saveGotham();
            darkKnight.eatHumans();
            darkKnight.eatHumans();
            darkKnight.fly();
    //Not sur if this is the right approach but did gorilla and then darkKnight second
        Mammal Squad = new Mammal(100);
        Squad.displayEnergy();

        // Arakaza means "welcome" (Rwandan Origin)
        Gorilla Arakaza = new Gorilla(100);
        Arakaza.throwSomething("banana");
        Arakaza.throwSomething("apple");
        Arakaza.throwSomething("monkey");
        Arakaza.eatBananas();
        Arakaza.climb();
        Arakaza.displayEnergy();
    }
}