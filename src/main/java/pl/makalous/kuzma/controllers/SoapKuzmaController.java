package pl.makalous.kuzma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetKuzmaRequest;
import io.spring.guides.gs_producing_web_service.GetKuzmaResponse;
import pl.makalous.kuzma.service.SoapKuzmaService;

@Endpoint
public class SoapKuzmaController {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private SoapKuzmaService soapKuzmaService;

    @Autowired
    SoapKuzmaController(final SoapKuzmaService soapKuzmaService) {
        this.soapKuzmaService = soapKuzmaService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getKuzmaRequest")
    @ResponsePayload
    public io.spring.guides.gs_producing_web_service.GetKuzmaResponse getCountry(@RequestPayload io.spring.guides.gs_producing_web_service.GetKuzmaRequest request) {
        io.spring.guides.gs_producing_web_service.GetKuzmaResponse response = new io.spring.guides.gs_producing_web_service.GetKuzmaResponse();

        response.setKuzma(soapKuzmaService.getSoapKuzmaRepository().findKuzma(request.getId()));

        return response;
    }
}
