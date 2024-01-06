package com.example.grpc.grpcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.grpc")
public class GrpcClientApplication {

    public static void main(String[] args)  {
        SpringApplication.run(GrpcClientApplication.class, args);
    }

}
