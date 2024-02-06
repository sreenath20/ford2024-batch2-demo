package lambda;

import java.util.List;

@FunctionalInterface
public interface CustomFunction {
    List<Integer> sort(List<Integer> intList); //void displayTwo();
}
