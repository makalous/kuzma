package pl.makalous.integrationwithorm.ruleengine;

import com.fasterxml.jackson.core.JsonProcessingException;
import pl.makalous.integrationwithorm.dto.ApiResponseDto;

public interface RuleEnginePort {
    ApiResponseDto ask(String name) throws JsonProcessingException;
}
