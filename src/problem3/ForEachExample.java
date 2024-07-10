package src.problem3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format
        list.forEach(new UpperCasePrint());
    }

    //implement a Consumer
    static class UpperCasePrint implements Consumer<String> {
        @Override
        public void accept(String s) {
            System.out.println(s.toUpperCase());
        }
    }

}
