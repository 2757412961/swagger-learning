package cn.gis.lab.swaggerlearning.annotation;

import org.mapstruct.TargetType;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SwaggerInterface {
}
