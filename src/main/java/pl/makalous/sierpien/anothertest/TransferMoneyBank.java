package pl.makalous.sierpien.anothertest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TransferMoneyBank implements TransferMoneyPort {
    @Override
    public void transferAmount(String iban, double amount) {
        //do logic here nvm
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> somethingFromReturn = restTemplate.postForEntity("https://127.0.0.1:8080", SomeDto.builder()
                .price(0.0)
                .id(1)
                .idkNvm("nvm").build(), String.class);
        if (somethingFromReturn.getStatusCode().is2xxSuccessful()) {
            //do sth
        } else {
            throw new RuntimeException("status not 200");
        }
    }
}
