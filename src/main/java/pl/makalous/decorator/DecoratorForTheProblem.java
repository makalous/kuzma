package pl.makalous.decorator;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class DecoratorForTheProblem implements SimpleProblem {
    private final SimpleProblem simpleProblem;

    @Autowired
    DecoratorForTheProblem(SimpleProblem simpleProblem) {
        this.simpleProblem = simpleProblem;
    }

    @Override
    public boolean solvable() {
        return simpleProblem.solvable();
    }

    @Override
    public int cost() {
        return simpleProblem.cost();
    }
}
