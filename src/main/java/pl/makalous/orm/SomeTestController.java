package pl.makalous.orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/otherroot")
public class SomeTestController {
    private TestService testService;

    @Autowired
    SomeTestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(path = "/getter", method = RequestMethod.GET)
    public ResponseEntity<List<JoinedEntities>> getterFromDb() {
        return ResponseEntity.ok(testService.useInTheController());
    }
}
