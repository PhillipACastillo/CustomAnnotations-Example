package com.galvanize.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME) // Custom annotation is available to JVM at runtime
@Target(TYPE) // Types are  for classes
public @interface JsonSerializable {

}
