package com.example.mirathinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.mirathinventory"})
public class MirathInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MirathInventoryApplication.class, args);
    }

}
