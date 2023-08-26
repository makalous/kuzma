package pl.makalous.biggertest.decorator;

public class MealImplementation implements Meal{
    @Override
    public double price() {
        return 20.50;
    }

    @Override
    public double weight() {
        return 0.6;
    }
}
