package src.problem4;

public interface QuackBehavior {
    default void quack() {
        System.out.println("Quack!");
    }
}
