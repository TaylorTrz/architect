package com.inspur.architect;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(value = {"com.inspur.architect.controller", "com.inspur.architect.util"})
public class ArchitectApplication {
    public static void main(String[] args){
        SpringApplication.run(ArchitectApplication.class, args);
    }

    @Bean
    public CommandLineRunner getBean(ApplicationContext context) {
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("cmd");
            }
        };
    }
}
