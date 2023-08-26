package pl.makalous.biggertest.decorator;

public class MealWithSomethingExtra extends MealDecorator {
    MealWithSomethingExtra(Meal meal) {
        super(meal);
    }

    @Override
    public double price() {
        return super.price() + 4.5;
    }

    @Override
    public double weight() {
        return super.weight() + 0.4;
    }
}
