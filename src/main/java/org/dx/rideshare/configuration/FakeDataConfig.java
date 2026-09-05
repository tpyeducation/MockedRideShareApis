package org.dx.rideshare.configuration;

import com.github.javafaker.Faker;
import org.mitre.synthea.engine.Generator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeDataConfig {

    @Bean
    public Faker faker() {
        return new Faker();
    }

    @Bean
    public Generator syntheaGenerator() {
        // Initialize the Synthea generator
        Generator generator = new Generator();
        return generator;
    }


    @Bean
    public String tarini() {
        return new String("32");
    }


}
