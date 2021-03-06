package com.example.cloud.zipkin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ZipkinOtherController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/call")
    public String callHome() {
        log.info("访问 cloud-zipkin-other  ");
        return restTemplate.getForObject("http://cloud-zipkin/info", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        log.info("访问 cloud-zipkin-other info  ");

        return "i'm cloud-zipkin-other";
    }
}
