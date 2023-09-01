package pl.makalous.sierpien.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.makalous.sierpien.test.domain.facade.KuzmaFacade;

@RestController
@RequestMapping(path = "/test")
public class SomeController {
    private final KuzmaFacade kuzmaFacade;

    @Autowired
    SomeController(KuzmaFacade kuzmaFacade) {
        this.kuzmaFacade = kuzmaFacade;
    }

    @RequestMapping(path = "/root", method = RequestMethod.GET)
    public ResponseEntity<String> doSomeGetter() {
        String something = kuzmaFacade.doSomethingInController(1L, "test");
        return ResponseEntity.ok(something);
    }
}
