package pl.makalous.integrationwithorm.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.makalous.integrationwithorm.dto.ApiResponseDto;
import pl.makalous.integrationwithorm.repo.CounterRepository;
import pl.makalous.integrationwithorm.repo.InformationRepository;
import pl.makalous.integrationwithorm.repo.entites.CounterEntity;
import pl.makalous.integrationwithorm.repo.entites.InformationEntity;
import pl.makalous.integrationwithorm.ruleengine.RuleEnginePort;

@Service
public class FacadeClass {
    private RuleEnginePort ruleEnginePort;
    private CounterRepository counterRepository;
    private InformationRepository informationRepository;

    @Autowired
    FacadeClass(RuleEnginePort ruleEnginePort, CounterRepository counterRepository, InformationRepository informationRepository) {
        this.ruleEnginePort = ruleEnginePort;
        this.counterRepository = counterRepository;
        this.informationRepository = informationRepository;
    }

    public ApiResponseDto useInTheController(String name) throws JsonProcessingException {
        ApiResponseDto apiResponseDto = ruleEnginePort.ask(name);
        saveCounterRepo(apiResponseDto);
        saveInfoRepo(apiResponseDto);
        return apiResponseDto;
    }

    private void saveCounterRepo(ApiResponseDto apiResponseDto) {
        CounterEntity counterEntity = new CounterEntity();
        counterEntity.setCount(apiResponseDto.getCount());
        counterRepository.save(counterEntity);
    }

    private void saveInfoRepo(ApiResponseDto apiResponseDto) {
        InformationEntity informationEntity = new InformationEntity();
        informationEntity.setGender(apiResponseDto.getGender());
        informationEntity.setName(apiResponseDto.getName());
        informationEntity.setProbability(apiResponseDto.getProbability());
        informationRepository.save(informationEntity);
    }
}
