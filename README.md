# openapi-kotlin-nullable

This is an example Micronaut Kotlin and OpenAPI project which tries to reproduce issue described in [micronaut-projects/micronaut-core#1455](https://github.com/micronaut-projects/micronaut-core/issues/1455)


Please execute following Gradle task as:
```
./gradlew run ./gradlew class
```

And then, open file `build/tmp/kapt3/classes/main/META-INF/swagger/issue-1455-0.0.yml` which correctly generates the `nullable: true` attribute as defined by OpenAPI in https://swagger.io/docs/specification/data-models/data-types/
