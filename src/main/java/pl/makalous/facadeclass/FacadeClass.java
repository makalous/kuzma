package pl.makalous.facadeclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacadeClass {
    private DoSomeGranularLogic doSomeGranularLogic;
    private DoSomeMore doSomeMore;
    private WowEvenMore wowEvenMore;

    @Autowired
    FacadeClass(DoSomeGranularLogic doSomeGranularLogic, DoSomeMore doSomeMore, WowEvenMore wowEvenMore) {
        this.doSomeGranularLogic = doSomeGranularLogic;
        this.doSomeMore = doSomeMore;
        this.wowEvenMore = wowEvenMore;
    }


    // LOGIC HERE


    void doSOmethingFunny(Long id, String msg){
        //blablabla
    }

    String refferToMeInTheController(int wow){
        //logiclogic
        return "Something very funny";
    }
}
