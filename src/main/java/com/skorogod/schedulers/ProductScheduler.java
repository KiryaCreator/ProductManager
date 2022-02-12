package com.skorogod.schedulers;

import com.skorogod.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class ProductScheduler {

    @Autowired
    private ProductServiceImpl productService;

    @Async
    @Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
    public void addRandomProduct(){

    }
}
