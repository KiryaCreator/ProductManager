package com.skorogod.data;

import com.skorogod.entities.Retailer;
import com.skorogod.services.RetailerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RetailerData {

    @Autowired
    private RetailerServiceImpl retailerService;

    @EventListener
    public void addDefaultRetailers(ApplicationReadyEvent event){
        Retailer retA = Retailer.builder()
                .id(1L)
                .name("RetA")
                .build();

        Retailer retB = Retailer.builder()
                .id(2L)
                .name("RetB")
                .build();

        retailerService.save(retA);
        retailerService.save(retB);
    }
}
