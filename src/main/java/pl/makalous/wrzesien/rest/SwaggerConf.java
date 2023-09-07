package pl.makalous.wrzesien.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.makalous.sierpien.anothertest.EntityOne;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConf {
    private EntityOne entityOne;
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pl.makalous.wrzesien.rest.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
