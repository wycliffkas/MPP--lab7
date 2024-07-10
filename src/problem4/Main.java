package src.problem4;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        mallard.display();
        mallard.swim();
        mallard.fly();
        mallard.quack();

        redhead.display();
        redhead.swim();
        redhead.fly();
        redhead.quack();

        rubber.display();
        rubber.swim();
        rubber.fly();
        rubber.quack();

        decoy.display();
        decoy.swim();
        decoy.fly();
        decoy.quack();
    }
}
