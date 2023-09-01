package pl.makalous.sierpien.kuzma.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.makalous.sierpien.kuzma.service.KuzmaService;

@RestController
@RequestMapping("/kuzma/test")
public class RestKuzmaController {
    private Logger LOGGER = LoggerFactory.getLogger(RestKuzmaController.class);
    private KuzmaService kuzmaService;

    @Autowired
    RestKuzmaController(final KuzmaService kuzmaService) {
        this.kuzmaService = kuzmaService;
    }

    @GetMapping("/getter")
    public ResponseEntity dupaGet (@RequestParam Long id){
        LOGGER.info("/getter gone");
        return kuzmaService.showKuzma(id);
    }

    @PostMapping("/setter")
    public ResponseEntity dupaSet(@RequestParam Long id, @RequestParam String name){
        LOGGER.info("/setter gone");
        return kuzmaService.putKuzma(id, name);
    }
}
