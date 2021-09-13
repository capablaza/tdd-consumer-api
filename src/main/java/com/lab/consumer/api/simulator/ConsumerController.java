package com.lab.consumer.api.simulator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("simulator")
public class ConsumerController {

    @PostMapping
    public CreditResponse simulate(@RequestBody CreditConsumer consumer) {
        CreditResponse response = new CreditResponse();
        response.loadValues(consumer, consumer.evaluate());
        return response;
    }
}
