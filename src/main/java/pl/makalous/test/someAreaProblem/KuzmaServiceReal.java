package pl.makalous.test.someAreaProblem;

public class KuzmaServiceReal implements KuzmaPort{
    @Override
    public String doSomething(String something, Long aNumber) {
        return "Usage of KuzmaServiceReal";
    }

    @Override
    public boolean doSomethingMore(String nameSpace) {
        return true;
    }
}
