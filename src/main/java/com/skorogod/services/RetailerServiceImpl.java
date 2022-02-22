package com.skorogod.services;

import com.skorogod.entities.Retailer;
import com.skorogod.repositories.RetailerRepository;
import com.skorogod.services.interfaces.RetailerService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailerServiceImpl implements RetailerService {

    @Autowired
    private RetailerRepository retailerRepository;

    @Override
    public Retailer findByIdOrThrow(Long id) throws NotFoundException {
        return retailerRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Retailer Not Found"));
    }

    @Override
    public Retailer save(Retailer retailer) {
        return retailerRepository.save(retailer);
    }
}
