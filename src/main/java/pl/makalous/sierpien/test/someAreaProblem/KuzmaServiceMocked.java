package pl.makalous.sierpien.test.someAreaProblem;

public class KuzmaServiceMocked implements KuzmaPort{
    @Override
    public String doSomething(String something, Long aNumber) {
        return "Usage of KuzmaServiceMocked";
    }

    @Override
    public boolean doSomethingMore(String nameSpace) {
        return false;
    }
}
