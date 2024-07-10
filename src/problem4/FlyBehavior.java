package src.problem4;

public interface FlyBehavior {
    default void fly() {
        System.out.println("I'm flying!");
    }
}
