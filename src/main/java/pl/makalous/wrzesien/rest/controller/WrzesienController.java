package pl.makalous.wrzesien.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/wrzesien")
public class WrzesienController {

    @RequestMapping(path = "/getter", method = RequestMethod.GET)
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Boolean> nevermind() {
        return ResponseEntity.ok(true);
    }
}
