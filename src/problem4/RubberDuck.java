package src.problem4;

public class RubberDuck extends Duck {    @Override
public void display() {
    System.out.println("I'm a Rubber Duck");
}

    @Override
    public void fly() {
        // Rubber ducks don't fly
        System.out.println("I can't fly!");
    }

    @Override
    public void quack() {
        // Rubber ducks squeak
        System.out.println("Squeak!");
    }

}
