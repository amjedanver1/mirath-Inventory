package com.mir.mirathinventory.services;

import com.mir.mirathinventory.dto.supplier.SupplierDetailsDto;
import org.springframework.stereotype.Service;

@Service
public interface SupplierService {
    public void add(SupplierDetailsDto supplierDetails) throws Exception;
    public void update(SupplierDetailsDto supplierDetails) throws Exception;
    public void delete(SupplierDetailsDto supplierDetails);
}
