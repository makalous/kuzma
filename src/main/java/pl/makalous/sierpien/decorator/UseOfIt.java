package pl.makalous.sierpien.decorator;

public class UseOfIt {
    public void doSomething() {
        SimpleProblem test1 = new LessSimpleProblemImplementation(new SimpleProblemImplementation());
        SimpleProblem test2 = new SimpleProblemImplementation();
    }
}
