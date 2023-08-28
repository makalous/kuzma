package pl.makalous.integrationwithorm.ruleengine;

import pl.makalous.integrationwithorm.dto.ApiResponseDto;

public class MockedRuleEngine implements RuleEnginePort {
    @Override
    public ApiResponseDto ask(String name) {
        ApiResponseDto apiResponseDto = new ApiResponseDto();
        apiResponseDto.setCount(0);
        apiResponseDto.setGender("mocked");
        apiResponseDto.setName(name);
        apiResponseDto.setProbability(-1.0);
        return apiResponseDto;
    }
}
