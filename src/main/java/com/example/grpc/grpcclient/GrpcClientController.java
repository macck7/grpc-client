package com.example.grpc.grpcclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GrpcClientController {

    private static final Logger logger = LoggerFactory.getLogger(GrpcClientController.class);

    @GetMapping("/login")
    public void login() {
        logger.info("Login endpoint accessed.");
        System.out.println("hi");
    }
}
