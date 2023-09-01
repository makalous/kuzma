package pl.makalous.sierpien.integrationwithorm.ruleengine;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.makalous.sierpien.integrationwithorm.dto.ApiResponseDto;

public class RealRuleEngine implements RuleEnginePort {
    private final String apiUrl = "https://api.genderize.io/?name=";

    @Override
    public ApiResponseDto ask(String name) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseFromServer = restTemplate.getForEntity(apiUrl + name, String.class);
        if (responseFromServer.getStatusCode().is2xxSuccessful()) {
            String apiResponse = responseFromServer.getBody();
            return new ObjectMapper().readValue(apiResponse, ApiResponseDto.class);
        }
        return null;
    }
}
