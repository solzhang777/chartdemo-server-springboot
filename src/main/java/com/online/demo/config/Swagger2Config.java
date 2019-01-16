package com.online.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {

    @Value("${swagger.show}")
    private boolean showSwagger;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .genericModelSubstitutes(DeferredResult.class)
            .useDefaultResponseMessages(false)
            .forCodeGeneration(true)
            .apiInfo(apiInfo())
            .pathMapping("/")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.online.demo.controller"))
            .paths(PathSelectors.any())
            .build()
            .enable(showSwagger);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Online pp360 demo api document")
            .description("Online pp360 demo api document")
            .version("1.0")
            .build();
    }


}