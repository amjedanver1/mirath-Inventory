package com.mir.mirathinventory.services.impl;

import com.mir.mirathinventory.dto.supplier.SupplierDetailsDto;
import com.mir.mirathinventory.entity.SupplierRegistration;
import com.mir.mirathinventory.repository.SupplierRepository;
import com.mir.mirathinventory.services.SupplierService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository _supplierRepository;

    @Override
    public void add(SupplierDetailsDto supplierDetails) throws Exception{
        try {
            SupplierRegistration supplierRegistration = new SupplierRegistration();
            BeanUtils.copyProperties(supplierDetails, supplierRegistration);
            _supplierRepository.save(supplierRegistration);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    @Override
    public void update(SupplierDetailsDto supplierDetails) throws Exception{
        try {
            SupplierRegistration supplierRegistration = new SupplierRegistration();
            BeanUtils.copyProperties(supplierDetails, supplierRegistration);
            _supplierRepository.save(supplierRegistration);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    @Override
    public void delete(SupplierDetailsDto supplierDetails){

    }
}
