package pl.makalous.sierpien.adapter.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import pl.makalous.sierpien.adapter.adaptee.Adaptee;
import pl.makalous.sierpien.adapter.target.TargerClient;

public class Adapter implements TargerClient {
    private Adaptee adaptee;

    @Autowired
    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String doSomethingFromClientSIde(String whatEngine, Long numberOfSth) {
        if (whatEngine.equalsIgnoreCase("okapi")) return adaptee.withOkapiVer(numberOfSth);
        return adaptee.withMockVer(numberOfSth);
    }
}
