package pl.makalous.sierpien.integrationwithorm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.makalous.sierpien.integrationwithorm.dto.ApiResponseDto;
import pl.makalous.sierpien.integrationwithorm.service.FacadeClass;

@RestController
@RequestMapping(path = "/integration/lol/xd")
public class SimpleControllerIntegration {
    private FacadeClass facadeClass;

    @Autowired
    SimpleControllerIntegration(FacadeClass facadeClass) {
        this.facadeClass = facadeClass;
    }


    @RequestMapping(path = "getter", method = RequestMethod.GET)
    public ResponseEntity<ApiResponseDto> getterLol(@RequestParam String name) throws JsonProcessingException {
        return ResponseEntity.ok(facadeClass.useInTheController(name));
    }
}
