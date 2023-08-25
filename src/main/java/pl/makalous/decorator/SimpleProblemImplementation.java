package pl.makalous.decorator;

public class SimpleProblemImplementation implements SimpleProblem{
    @Override
    public boolean solvable() {
        return true;
    }

    @Override
    public int cost() {
        return 10;
    }
}
