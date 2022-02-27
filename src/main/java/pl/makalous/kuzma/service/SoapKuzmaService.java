package pl.makalous.kuzma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.makalous.kuzma.repository.SoapKuzmaRepository;

@Service
public class SoapKuzmaService {
    private SoapKuzmaRepository soapKuzmaRepository;

    @Autowired
    SoapKuzmaService(final SoapKuzmaRepository soapKuzmaRepository) {
        this.soapKuzmaRepository = soapKuzmaRepository;
    }

    public SoapKuzmaRepository getSoapKuzmaRepository() {
        return soapKuzmaRepository;
    }
}
