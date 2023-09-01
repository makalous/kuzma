package pl.makalous.sierpien.kuzma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.makalous.sierpien.kuzma.entity.KuzmaEntity;
import pl.makalous.sierpien.kuzma.repository.KuzmaRepository;

import java.util.Collections;

@Service
public class KuzmaService {
    private KuzmaEntity kuzmaEntity;
    private KuzmaRepository kuzmaRepository;

    @Autowired
    KuzmaService(final KuzmaEntity kuzmaEntity, final KuzmaRepository kuzmaRepository) {
        this.kuzmaEntity = kuzmaEntity;
        this.kuzmaRepository = kuzmaRepository;
    }

    public ResponseEntity showKuzma(Long id){
        return ResponseEntity.ok(kuzmaRepository.findById(id));
    }

    public ResponseEntity putKuzma (Long id, String name){
        kuzmaEntity.setId(id);
        kuzmaEntity.setName(name);
        kuzmaRepository.save(kuzmaEntity);
        return ResponseEntity.ok(Collections.singletonMap("Status: ", true));
    }

}
