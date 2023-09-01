package pl.makalous.sierpien.integrationwithorm.ruleengine;

import com.fasterxml.jackson.core.JsonProcessingException;
import pl.makalous.sierpien.integrationwithorm.dto.ApiResponseDto;

public interface RuleEnginePort {
    ApiResponseDto ask(String name) throws JsonProcessingException;
}
