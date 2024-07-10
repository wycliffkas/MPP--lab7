package src.problem4;

public abstract class Duck implements FlyBehavior, QuackBehavior {
    public void swim() {
        System.out.println("I'm swimming!");
    }

    public abstract void display();
}
