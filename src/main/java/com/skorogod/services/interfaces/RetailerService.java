package com.skorogod.services.interfaces;

import com.skorogod.entities.Retailer;
import javassist.NotFoundException;

public interface RetailerService {

    public Retailer findByIdOrThrow(Long id) throws NotFoundException;

    public Retailer save(Retailer retailer);
}
