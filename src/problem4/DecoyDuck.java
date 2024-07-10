package src.problem4;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck");
    }

    @Override
    public void fly() {
        // Decoy ducks don't fly
        System.out.println("I can't fly!");
    }

    @Override
    public void quack() {
        // Decoy ducks don't quack
        System.out.println("<< Silence >>");
    }

}
