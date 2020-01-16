package com.chaochaogu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author chaochao Gu
 * @date 2020/1/15
 */
@SpringBootApplication
@EnableScheduling
public class UtilityApplication {
    public static void main(String[] args) {
        SpringApplication.run(UtilityApplication.class, args);
    }
}
