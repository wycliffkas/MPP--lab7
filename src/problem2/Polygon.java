package src.problem2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    @Override
    default double computePerimeter() {
        double[] sides = getSides();
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }
}
