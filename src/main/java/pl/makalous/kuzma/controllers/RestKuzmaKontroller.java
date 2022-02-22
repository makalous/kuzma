package pl.makalous.kuzma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.makalous.kuzma.service.KuzmaService;

@RestController
@RequestMapping("/kuzma/test")
public class RestKuzmaKontroller {
    private KuzmaService kuzmaService;

    @Autowired
    RestKuzmaKontroller(final KuzmaService kuzmaService) {
        this.kuzmaService = kuzmaService;
    }

    @GetMapping("/getter")
    public ResponseEntity dupa (@RequestParam Long id){
        return kuzmaService.showKuzma(id);
    }
}
