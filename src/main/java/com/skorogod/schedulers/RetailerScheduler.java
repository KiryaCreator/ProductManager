package com.skorogod.schedulers;

import com.skorogod.services.RetailerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RetailerScheduler {

    @Autowired
    private RetailerServiceImpl retailerService;

    @Scheduled
    public void addMainRetailers(){

    }
}
