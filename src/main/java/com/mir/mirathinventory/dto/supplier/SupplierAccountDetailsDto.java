package com.mir.mirathinventory.dto.supplier;

import com.mir.mirathinventory.entity.SupplierRegistration;
import lombok.Data;

@Data

public class SupplierAccountDetailsDto {
    private int id;
    private String accountNumber;
    private String accountName;
    private String bankName;
    private String branch;
    private SupplierRegistration supplierRegistration;
}
