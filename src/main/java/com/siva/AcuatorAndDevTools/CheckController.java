package com.siva.AcuatorAndDevTools;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@Slf4j
public class CheckController {
    @PostConstruct
    @GetMapping("/health-check")
    public  String  init() {
        log.info("All is well !!!");
        int a = 10;
        int b = 10;
        int sum = a+b;
        return "All Is Well !!!"+sum;
    }
}
