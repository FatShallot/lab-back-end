package com.lpc.labbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lpc.labbackend.dao")
public class LabBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabBackEndApplication.class, args);
    }

}
