package com.line.emoji.config.apidoc

import com.line.emoji.config.Constant
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import springfox.documentation.builders.PathSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
//@Profile("!" + Constant.SPRING_PROFILE_NO_SWAGGER)
class SwaggerConfiguration {

    val DEFAULT_INCLUDE_PATTERN = "/services/.*"

    @Bean
    fun api() : Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.regex(DEFAULT_INCLUDE_PATTERN))
                .build()
    }

}