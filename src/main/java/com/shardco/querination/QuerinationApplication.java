package com.shardco.querination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuerinationApplication {

    private static final Logger logger = LoggerFactory.getLogger(QuerinationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(QuerinationApplication.class, args);
    }

}
