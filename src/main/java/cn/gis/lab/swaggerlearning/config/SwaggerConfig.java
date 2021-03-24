package cn.gis.lab.swaggerlearning.config;

import cn.gis.lab.swaggerlearning.annotation.SwaggerInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docketZJH(Environment environment) {
        Profiles of = Profiles.of("dev");
        boolean isDev = environment.acceptsProfiles(of);
        String[] activeProfiles = environment.getActiveProfiles();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())

                .enable(isDev)
//                .enable(false) // 关闭 Swagger。 生产环境和开发环境 分别配置

                .groupName("zjh") // 配置多个分组

                .select()
//                .apis(RequestHandlerSelectors.basePackage("cn.gis.lab.swaggerlearning.controller")) // 按照包 搜索路由
//                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)) // 按照注解类 搜索路由
//                .apis(RequestHandlerSelectors.withClassAnnotation(SwaggerInterface.class))
//                .paths(PathSelectors.ant("/hello/**")) // 路径过滤
                .build();
    }

    @Bean
    public Docket docket(Environment environment) {
        Profiles of = Profiles.of("dev");
        boolean isDev = environment.acceptsProfiles(of);
        String[] activeProfiles = environment.getActiveProfiles();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())

                .enable(isDev)
//                .enable(false) // 关闭 Swagger。 生产环境和开发环境 分别配置

                .select()
//                .apis(RequestHandlerSelectors.basePackage("cn.gis.lab.swaggerlearning.controller")) // 按照包 搜索路由
//                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)) // 按照注解类 搜索路由
//                .apis(RequestHandlerSelectors.withClassAnnotation(SwaggerInterface.class))
//                .paths(PathSelectors.ant("/hello/**")) // 路径过滤
                .build();
    }


    public ApiInfo apiInfo() {
        return new ApiInfo(
                "GIS Lab Swagger 文档",
                "无为",
                "1.0",
                "urn:tos",
                new Contact("赵佳晖", "", "2757412961@qq.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
