package pl.makalous.kuzma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.makalous.kuzma.entity.KuzmaEntity;
import pl.makalous.kuzma.repository.KuzmaRepository;

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
        return ResponseEntity.ok(true);
    }

}
