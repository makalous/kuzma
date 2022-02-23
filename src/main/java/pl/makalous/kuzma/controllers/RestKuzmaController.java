package pl.makalous.kuzma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.makalous.kuzma.service.KuzmaService;

@RestController
@RequestMapping("/kuzma/test")
public class RestKuzmaController {
    private KuzmaService kuzmaService;

    @Autowired
    RestKuzmaController(final KuzmaService kuzmaService) {
        this.kuzmaService = kuzmaService;
    }

    @GetMapping("/getter")
    public ResponseEntity dupaGet (@RequestParam Long id){
        return kuzmaService.showKuzma(id);
    }

    @PostMapping("/setter")
    public ResponseEntity dupaSet(@RequestParam Long id, @RequestParam String name){
        return kuzmaService.putKuzma(id, name);
    }
}
