package pl.makalous.sierpien.biggertest.decorator;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class MealDecorator implements Meal {
    private Meal meal;

    @Autowired
    MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public double price() {
        return meal.price();
    }

    @Override
    public double weight() {
        return meal.weight();
    }
}
