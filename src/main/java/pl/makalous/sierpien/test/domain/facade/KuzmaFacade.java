package pl.makalous.sierpien.test.domain.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.makalous.sierpien.test.someAreaProblem.KuzmaPort;

@Service
public class KuzmaFacade {
    private KuzmaPort kuzmaPort;
    //private KuzmaSecondPort kuzmaSecondPort;

    @Autowired
    public KuzmaFacade(KuzmaPort kuzmaPort) {
        this.kuzmaPort = kuzmaPort;
        //this.kuzmaSecondPort = kuzmaSecondPort;
    }

    public String doSomethingInController(Long id, String nameSpace) {
        //do some logic here
        return kuzmaPort.doSomething(nameSpace, id);
    }
}
