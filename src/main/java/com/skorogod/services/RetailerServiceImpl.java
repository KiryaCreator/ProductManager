package com.skorogod.services;

import com.skorogod.entities.Retailer;
import com.skorogod.repositories.RetailerRepository;
import com.skorogod.services.interfaces.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailerServiceImpl implements RetailerService {

    @Autowired
    private RetailerRepository retailerRepository;

    @Override
    public Retailer save(Retailer retailer) {
        return retailerRepository.save(retailer);
    }
}
