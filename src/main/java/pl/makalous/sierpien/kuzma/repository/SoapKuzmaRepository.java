package pl.makalous.sierpien.kuzma.repository;

import io.spring.guides.gs_producing_web_service.Kuzma;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class SoapKuzmaRepository {
    private static final Map<Long, Kuzma> kuzmaMap = new HashMap<>();

    @PostConstruct
    public void initData() {
        Kuzma kuzma = new Kuzma();
        kuzma.setId(1);
        kuzma.setName("dupa");
        kuzmaMap.put(1L, kuzma);
    }

    public Kuzma findKuzma(Long id) {
        Assert.notNull(id, "The id must not be null");
        return kuzmaMap.get(id);
    }
}
