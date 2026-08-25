package customeAnnotation;

import jdk.jfr.Description;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Description("Describe the Imp Method")
@Retention(RetentionPolicy.RUNTIME)
public @interface Important {

}
